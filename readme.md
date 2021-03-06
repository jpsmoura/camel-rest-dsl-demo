# Description

The aim of this PoC is to demonstrate the fastest route to deploy a Camel Spring Boot Application into different containers. The project uses minimal configuration and some dev tools that might not be suitable in production setups.
It includes a Camel Spring Boot Application that exposes three Rest endpoints. The mortgage application service combines data from another two backend Rest Services using an Aggregation Strategy. An example of swagger documentation for the Rest API is also published.

<img src="https://raw.githubusercontent.com/jpsmoura/camel-rest-dsl-demo/master/images/servicesDiagram.png" width="600" height="300">

This project is divided into five git branches:

- Spring Boot Standalone (Tomcat)
- Spring Boot Standalone (Undertow)
- Spring Boot WAR running on a JEE Container (Websphere Liberty)
- Spring Boot on Openshift (Tomcat)
- Inception - Spring Boot WAR running on Websphere Liberty running on Openshift

# Run the Example

`git clone https://github.com/jpsmoura/camel-rest-dsl-demo.git`

`cd camel-rest-dsl-demo`


- Spring Boot standalone [link](https://github.com/jpsmoura/camel-rest-dsl-demo/blob/standalone/readme.md)
- Spring Boot WAR running on a JEE Container (Websphere Liberty) [link](https://github.com/jpsmoura/camel-rest-dsl-demo/blob/war-websphere/readme.md)
- Spring Boot on Openshift [link](https://github.com/jpsmoura/camel-rest-dsl-demo/blob/openshift/readme.md)
- Inception - Spring Boot WAR running on Websphere Liberty running on Openshift [link](https://github.com/jpsmoura/camel-rest-dsl-demo/blob/inception/readme.md)
