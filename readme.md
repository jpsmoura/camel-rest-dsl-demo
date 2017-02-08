# Description

A Simple Docker Strategy is used here to build the image. For simplicity, the war file is stored with the source code. Ideally, it should be pulled from an Artifact repository during the Docker build.

# Run the Example

Switch to this branch

`git checkout inception`

`oc new-project inception`

`oc new-app https://github.com/jpsmoura/camel-rest-dsl-demo.git#inception`

Create Route

`oc expose svc/camel-rest-dsl-demo`

# Hit the endpoints

## Camel Rest DSL - camel-servlet

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/applicants/getApplicant
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/properties/getProperty
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/mortgages/getMortgageApplication

## Tomcat - All the Spring Boot Endpoints e.g.

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/health
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/metrics

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/2f9bf92f75a339c75fd4)
