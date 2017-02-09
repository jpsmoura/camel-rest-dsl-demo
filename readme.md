# Description

A Simple Docker Strategy is used here to build the image. For simplicity, the war file is stored with the source code. Ideally, it should be pulled from an Artifact repository during the Docker build.

# Run the Example

1. Start the CDK `vagrant up` [link](https://developers.redhat.com/products/cdk/overview/)
2. Enter your Credentials to register the box
3. Login using the CLI `oc login 10.1.2.2:8443` `u:admin p:admin`
4. Create a new project `oc new-project inception`
5. Switch to this branch `git checkout inception`
6. Create the App in Openshift `oc new-app https://github.com/jpsmoura/camel-rest-dsl-demo.git#inception`
7. Create Route `oc expose svc/camel-rest-dsl-demo`

# Hit the endpoints (Websphere Server)

## Camel Rest DSL - camel-servlet

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/applicants/getApplicant
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/properties/getProperty
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/services/mortgages/getMortgageApplication

## All the Spring Boot Endpoints e.g.

- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/health
- http://camel-rest-dsl-demo-inception.rhel-cdk.10.1.2.2.xip.io/camel-rest-dsl-example-0.0.1/metrics

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/2f9bf92f75a339c75fd4)
