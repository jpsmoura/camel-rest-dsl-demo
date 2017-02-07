# Rest DSL Example
A Camel Spring Boot Application that exposes a Rest Service. This service combines data from another two backend Rest Services using an Aggregation Strategy (JSON)

# Versions

| Technology                                                | Version       |
| :--- | :--- |
| Spring Boot                                               | 1.4.3.RELEASE |
| Apache Camel                                              | 2.18.1        |
| Fabric8 Maven Plugin Camel                                | 3.2.15        |
| Red Hat CDK                                               | 2.2           |
| Docker Image jboss-fuse-6-tech-preview/fis-java-openshift | Latest        |

# Deploying the Example into Openshift

1. Start the CDK `vagrant up` [link](https://developers.redhat.com/products/cdk/overview/)
2. Enter your Credentials to register the box
3. Login using the CLI `oc login 10.1.2.2:8443` `u:admin p:admin`
4. Create a new project `oc new-project demo`
5. Clone and switch to this branch `git clone -b openshift https://github.com/jpsmoura/camel-rest-dsl-demo.git`
6. Build and Deploy onto Openshift. `mvn clean fabric8:deploy`
   * Base Image [link](https://access.redhat.com/containers/#/repo/583fdc1f9c624c7ea34eb945)-> registry.access.redhat.com/jboss-fuse-6-tech-preview/fis-java-openshift
   * Deployed using Fabric8 Maven Plugin v.3.2.15 [link](https://maven.fabric8.io/)
