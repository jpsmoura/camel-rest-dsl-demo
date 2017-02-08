# Run the Example

Switch to this branch

`git checkout inception`

`mvn clean package`

`oc new-project inception`

`oc new-app https://github.com/jpsmoura/camel-rest-dsl-demo.git#inception`

Create Route

`oc expose svc/camel-rest-dsl-demo`

# Hit the endpoints

## Restlet - Camel Rest DSL

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/applicants/getApplicant
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/properties/getProperty
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/mortgages/getMortgageApplication

## Tomcat - All the Spring Boot Endpoints e.g.

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/health
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/metrics

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/2f9bf92f75a339c75fd4)
