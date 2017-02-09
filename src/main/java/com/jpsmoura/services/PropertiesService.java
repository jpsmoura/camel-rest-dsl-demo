package com.jpsmoura.services;

import com.jpsmoura.datamodel.Property;
import org.apache.camel.Exchange;


public class PropertiesService {

    public PropertiesService() {
    }

    public void getProperty(Exchange exchange) {
    	Property property = new Property("Cannon Street", 2000);
        exchange.getIn().setBody(property);
    }

   
}