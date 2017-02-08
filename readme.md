# Versions Used

| Technology                                                | Version       |
| :--- | :--- |
| Apache Maven                                              | 3.3.9         |
| Spring Boot                                               | 1.4.3.RELEASE |
| Apache Camel                                              | 2.18.1        |
| Fabric8 Maven Plugin Camel                                | 3.2.15        |
| Red Hat CDK                                               | 2.3           |
| Docker Image jboss-fuse-6-tech-preview/fis-java-openshift | Latest        |

# Deploying the Example into Openshift

1. Start the CDK `vagrant up` [link](https://developers.redhat.com/products/cdk/overview/)
2. Enter your Credentials to register the box
3. Login using the CLI `oc login 10.1.2.2:8443` `u:admin p:admin`
4. Create a new project `oc new-project demo`
5. Switch to this branch `git checkout openshift`
6. Build and Deploy onto Openshift. `mvn clean fabric8:deploy`
   * Base Image [link](https://access.redhat.com/containers/#/repo/583fdc1f9c624c7ea34eb945)-> registry.access.redhat.com/jboss-fuse-6-tech-preview/fis-java-openshift
   * Deployed using Fabric8 Maven Plugin [link](https://maven.fabric8.io/)

# Hit the endpoints

## Restlet - Camel Rest DSL

- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/applicants/getApplicant](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/applicants/getApplicant)
- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/properties/getProperty](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/properties/getProperty)
- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/mortgages/getMortgageApplication](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/mortgages/getMortgageApplication)

## Swagger Documentation

- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/services/api-doc](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/services/api-doc)

## Tomcat - All the Spring Boot Endpoints e.g.

- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/health](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/health)
- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/metrics](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/metrics)
- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/env](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/env)
- [http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/trace](http://spring-boot-demo.rhel-cdk.10.1.2.2.xip.io/trace)
- ...


[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/d692a929abe54da8ae6f)
