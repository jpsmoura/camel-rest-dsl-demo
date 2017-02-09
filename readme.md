# Run the Example

Switch to this branch

 `git checkout war-websphere`

`mvn clean package`

`docker run -d -p 80:9080 -v $(pwd)/target/camel-rest-dsl-example-0.0.1.war:/config/dropins/camel-rest-dsl-example-0.0.1.war   websphere-liberty:webProfile7`

# Hit the endpoints(Websphere)

## Camel Rest DSL

- http://localhost/camel-rest-dsl-example-0.0.1/services/applicants/getApplicant
- http://localhost/camel-rest-dsl-example-0.0.1/services/properties/getProperty
- http://localhost/camel-rest-dsl-example-0.0.1/services/mortgages/getMortgageApplication

## All the Spring Boot Endpoints e.g.

- http://localhost/camel-rest-dsl-example-0.0.1/health
- http://localhost/camel-rest-dsl-example-0.0.1/metrics

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/9a66c0e16ae26b2402ab)
