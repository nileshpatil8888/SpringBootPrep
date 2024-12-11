How do you configure spring boot application ?
    It can be configured using several methods :
        Application properties/yaml : Define configuration into this two files.
        Environment variables : Use environment variables for configuration , which can be especially useful in cloud deployments.
        Command-line Arguments : Pass configuration properties through command line when starting the application.
        Configuration classes : Use @Configuration classes to define beans and customize setting programmatically.

what are spring boot starters and what purpose do they serve ?
    Spring boot starters are dependencies and a set of commonly used libraries for a particular functionality.
        spring-boot-starter-web : this dependency includes for building web application, including spring mvc and tomcat.
        spring-boot-starter-data-jpa : provides dependencies of spring data jpa and spring hibernate.
        spring-boot-starter-security : Adds security related dependencies for authentication and authorization.

How can you override spring boot default configurations ?
    configurations can be overridden in several ways :
        with the help of application.properties we can override : just define the custom values for properties in these files.
        using @configuration class for defining the override beans and settings programmatically.
        profiles : Use profiles-specific property files.

what is spring boot actuator and how it is used.?
    Spring boot actuator actually provides production ready features to monitor and manage our application.
        It includes endpoints for :
            Health checks : /actuator/health to check the status related to our application.
            metric : /actuator/metrics to view various metrics like memory usage and garbage collection.
            environment info : /actuator/env to inspect environment properties and configuration.
            Logging : /actuator/loggers to view and change logging levels, actuator endpoints help with monitoring,
                        troubleshooting and managing applications in production environments.

how does spring boot handle externalized configurations ?
    It can be achieved through application properties, environment variables, command line arguments, config server.

what is the significance of application.properties or application.yaml in springboot ?
   This files allow developers to externalize application settings, also customize various properties such as database configuration,
   server settings, logging level and application-specific properties.
   this files helps to keep configurations separate from code.

Explain the concept of profiles and how they are used.
    spring-boot profiles allows you to define different configuration for different environments(e.g, dev, Qa, prod).
    profiles are activated using the spring.profile.active property in application.properties or through command line argument.
