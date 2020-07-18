# Spring Cloud Config Getting Started

**Spring** Cloud Config is Spring's client/server approach for storing and serving distributed configurations across multiple applications and environments.

## Description
### Dependencies
- spring-cloud-config-server

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
|||
|||
|||

## Demo

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
