package com.jpsmoura.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.jpsmoura.aggregators.MortgageAggregator;
import com.jpsmoura.datamodel.Applicant;
import com.jpsmoura.datamodel.MortgageApplication;
import com.jpsmoura.datamodel.Property;
import com.jpsmoura.services.ApplicantsService;
import com.jpsmoura.services.PropertiesService;
import org.apache.camel.PropertyInject;

@Component
public class Routes extends RouteBuilder {

    @PropertyInject("{{restlet.server.port}}")
    private String restlet_port;

    @Override
    public void configure() {

    	 //Rest DSL Configuration
         restConfiguration()
         .component("restlet")
         .bindingMode(RestBindingMode.json)
         .dataFormatProperty("prettyPrint", "true")
         .contextPath("/")
		     .port(Integer.parseInt(restlet_port))

		  //Swagger Support
         .apiContextPath("/api-doc")
           .apiProperty("api.title", "Rest DSL API")
           .apiProperty("api.version", "0.0.1")
           .apiProperty("cors", "true");

         //Rest Services Definition
          rest("/mortgages/")
                .get("/getMortgageApplication")
                .produces("application/json")
                .outType(MortgageApplication.class)
                .to("direct:getMortgageApplication");

          rest("/applicants/")
                .get("/getApplicant")
                .produces("application/json")
                .outType(Applicant.class)
                .to("direct:getApplicant");

          rest("/properties/")
		        .get("/getProperty")
		        .produces("application/json")
		        .outType(Property.class)
		        .to("direct:getProperty");

          from("direct:getApplicant")
           .bean(ApplicantsService.class, "getApplicant");

          from("direct:getProperty")
           .bean(PropertiesService.class, "getProperty");


        from("direct:getMortgageApplication")

          .multicast(new MortgageAggregator())
          //Get a populated mortgageApplication Example (Inline or Bean)
          .bean(MortgageApplication.class,"getMortgageApplicationSample")
          /*.process(new Processor() {
          	public void process(Exchange exchange) throws Exception {
          		mortgageApplication mortgage = new mortgageApplication();
          		mortgage.setApr(8.00);
          		mortgage.setAmortization(30);
          		mortgage.setDownPayment(4000);
          		mortgage.setMortgageAmount(40000);
  				exchange.getIn().setBody(mortgage);
  			 }
  			})*/
          .parallelProcessing()
          .to("direct:callPropertyService", "direct:callApplicantService")
          .end();


        from("direct:callPropertyService")
         .removeHeaders("CamelHttp*")
         .enrich("http://localhost:"+restlet_port+"/properties/getProperty")
         .unmarshal().json(JsonLibrary.Jackson, Property.class);


        from("direct:callApplicantService")
         .removeHeaders("CamelHttp*")
         .enrich("http://localhost:"+restlet_port+"/applicants/getApplicant")
         .unmarshal().json(JsonLibrary.Jackson, Applicant.class);

    }
}
