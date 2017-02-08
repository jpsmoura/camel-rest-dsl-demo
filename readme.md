# Run the Example

Switch to this branch

`git checkout inception`

`mvn clean package`

`oc new-project inception`

`oc new-app https://github.com/jpsmoura/camel-rest-dsl-demo.git#inception`

Create Route

`oc expose svc/`

# Hit the endpoints

## Restlet - Camel Rest DSL

- http://localhost/camel-rest-dsl-example-0.0.1/services/applicants/getApplicant
- http://localhost/camel-rest-dsl-example-0.0.1/services/properties/getProperty
- http://localhost/camel-rest-dsl-example-0.0.1/services/mortgages/getMortgageApplication

## Tomcat - All the Spring Boot Endpoints e.g.

- http://localhost/camel-rest-dsl-example-0.0.1/health
- http://localhost/camel-rest-dsl-example-0.0.1/metrics

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/9a66c0e16ae26b2402ab)
