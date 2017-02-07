# Rest DSL Example

A Camel Spring Boot Application that exposes three Rest endpoints. The mortgage application service combines data from another two backend Rest Services using an Aggregation Strategy.

<img src="https://raw.githubusercontent.com/jpsmoura/camel-rest-dsl-demo/master/images/servicesDiagram.png" width="600" height="300">

# Run the Example

`git clone https://github.com/jpsmoura/camel-rest-dsl-demo.git && cd camel-rest-dsl-demo`

`mvn spring-boot:run`

# Endpoints

- http://localhost:8081/applicants/getApplicant
- http://localhost:8081/properties/getProperty
- http://localhost:8081/mortgages/getmortgageApplication

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/d9c404348d394ae78fcf)
