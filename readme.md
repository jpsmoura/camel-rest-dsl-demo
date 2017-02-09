# Run the Example

Switch Branch

`git checkout standalone`

Run the Spring Boot App

`mvn spring-boot:run`

# Hit the endpoints(Tomcat Server)

## Camel Rest DSL

- [http://localhost:8080/services/applicants/getApplicant](http://localhost:8080/services/applicants/getApplicant)
- [http://localhost:8080//services/properties/getProperty](http://localhost:8080//services/properties/getProperty)
- [http://localhost:8080/services/mortgages/getmortgageApplication](http://localhost:8080/services/mortgages/getmortgageApplication)

## Swagger Documentation

- [http://localhost:8080/services/api-doc](http://localhost:8080/services/api-doc)

## All the Spring Boot Endpoints e.g.

- [http://localhost:8080/health](http://localhost:8080/health)
- [http://localhost:8080/metrics](http://localhost:8080/metrics)
- [http://localhost:8080/env](http://localhost:8080/env)
- [http://localhost:8080/trace](http://localhost:8080/trace)
- ...

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/d9c404348d394ae78fcf)

# Connecting to the Spring Boot Console

`ssh -p 2000 user@localhost` `u:user p:password`
