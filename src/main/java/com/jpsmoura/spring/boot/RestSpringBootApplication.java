package com.jpsmoura.spring.boot;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RestSpringBootApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RestSpringBootApplication.class, args);
    }

}
