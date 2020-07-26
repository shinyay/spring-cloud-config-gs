# Spring Cloud Config Server Getting Started

**Spring** Cloud Config is Spring's client/server approach for storing and serving distributed configurations across multiple applications and environments.

## Description
### Dependencies
- spring-cloud-config-server

### Related Repository

- https://github.com/shinyay/spring-cloud-getting-started
- https://github.com/shinyay/spring-cloud-gateway-gs
- https://github.com/shinyay/spring-cloud-loadbalancer-gs
- https://github.com/shinyay/spring-cloud-eureka-server-gs
- https://github.com/shinyay/spring-cloud-config-client-gs

### Enable Config Server
Add annotation `@EnableConfigServer`

```kotlin
@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigGsApplication
```

### application.yml

- `spring.cloud.config.server.git`

|property|content|
|--------|-------|
|uri|Git Repository URI <br> - https://github.com/... <br> - file://${user.home}/...|
|search-paths|sub-directories where config stores <br> - config-repo <br> - foo,bar*|
|clone-on-start|Whether the Config Server should clone the default repository when it starts up|
|skip-ssl-validation|validation of the Git server’s SSL certificate can be disabled|

## Demo
### 1. Create Remote Repository
Create a remote repository on GitHub and a directory to store properties by indicating the following:

- `spring.cloud.config.server.git.uri`
- `spring.cloud.config.server.git.search-paths`

### 2. Store property files

- `application` is defined by `spring.application.name` in Config Client App
- `profile` is defined by `spring.cloud.config.profile` in Config Client App
- `label` is an optional git label (default is `master`) defined by `spring.cloud.config.label` in Config Client App

Property files can be named and located as follows:
- /{application}/{profile}[/{label}]
- /{application}-{profile}.yml
- /{label}/{application}-{profile}.yml
- /{application}-{profile}.properties
- /{label}/{application}-{profile}.properties

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
