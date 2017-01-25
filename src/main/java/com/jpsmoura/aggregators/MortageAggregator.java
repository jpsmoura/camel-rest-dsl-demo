package com.jpsmoura.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.jpsmoura.datamodel.Applicant;
import com.jpsmoura.datamodel.MortageApplication;
import com.jpsmoura.datamodel.Property;
public class MortageAggregator implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

    	 if (oldExchange == null) {
             System.out.println("oldExchange is null -> Returning new exchange");
             return newExchange;
         }
                
        if( newExchange.getIn().getBody() instanceof Applicant){
        	 Applicant applicant = newExchange.getIn().getBody(Applicant.class);
        	 MortageApplication mortage = oldExchange.getIn().getBody(MortageApplication.class);
        	 mortage.setApplicant(applicant);
        }
        else {
        	Property property = newExchange.getIn().getBody(Property.class);
	       	MortageApplication mortage = oldExchange.getIn().getBody(MortageApplication.class);
	       	mortage.setProperty(property);       	
        }
   
        return oldExchange;
    }

}