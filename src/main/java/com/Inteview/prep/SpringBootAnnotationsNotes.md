Core spring annotations :
    @Component : This annotation is used for enabling the automatic detection during classpath scanning.
    key features :
        automatically registered as bean.
        used for generic components.

    @Controller :
        This annotation is used in Spring mvc for handling the HTTP requests.
        combines with @RequestMapping for routing.

    @Service :
        This annotation indicates that class holdes the bussines logic.
        Improves the readability and understanding of application layers.
        Typically used in the service layer.

    @Repository:
        This annotation is used to define data access components, and it indicates this class stores the database related operations.
        Automatically translate persistence exceptions.

    @Configuration : indicates that a class declares one or more @beans methods

    @Bean : Indicates that a method produces a bean to be managed by the spring container.

    @lazy : Marks a bean as lazy-initialized.
            It delays bean creation until is needed.

    @value : injects value from properties files or environments variables.
             supports expression language.

Spring boot specific annotations :
    @SpringBootApplication :
        This annotation is used with main method. (entry point of springboot)
        It combines @ComponentScan, @EnableAutoConfiguration and @Configuration.

        @EnableAutoConfiguration : Enables spring boot autoconfiguration mechanism.
            It automatically configures the application based on dependencies.

        @ComponentScan :
            Automatically detects the @service, @repository, @controller, @component.

        @ConditionalOnProperty :
            Configures beans based on specific properties.
            provides fine-grained control over bean registration.

        @SpringBootTest : Used to test spring components.

Dependency Injection and scope :
    @Autowired : this annotation is used inject dependencies automatically.
        It can be applied to constructor and getter setter method.

    @Qualifier : It resolves conflicts when multiple beans qualify for injection.

    @Scope : it defines the scope of bean.
        Common scopes : singleton, prototype, request, session.

Spring MVC Annotations :
    @RequestMapping :
         it maps web request to handler methods.

         it supports http methods and uri patterns.
         can be applied at the class or method level.

    @GetMapping, @PostMapping, @PutMapping, @DeleteMapping :
         These are the specialized by Request mapping for http methods.

    @PathVariable : it binds method parameter to URI

     @RequestParam : Binds a method parameter to a query parameter.

     @ResponseBody : Converts a methods return value into an Http response.

     @RestController : Simplifies the restful services.
          It combines @Controller and @ResponseBody

Validation annotations :
    @valid : Triggers validation for annotated fields or methods.

    @NotNull, @Min, @Max, @Size : Bean validation constraints. it ensure data consistency.

    @RequestBody : Maps the body of an http request to a method parameter.  used with json and xml payloads.

Transactional management :
    @Transactional : THis annotation manages the declaratively.
            rollback transaction or exceptions

Asynchronous processing :
    @Async :
        Executes a method asynchronously.

    @Scheduled :
        Defines a task to run at a scheduled time.

Spring Annotations :
    @EnableSecurity :
        Enables spring security web security support. customizes security settings.

    @PreAuthorize, @PostAuthorize
        Enforces security constraints before/after method execution.

    @Secured :
        Define security constraint at method level.

Actuator and Monitoring :
    @Endpoint :
        Defines a custom actuator endpoint.
        supports health check and monitoring.

    @ReadOperation, @writeOperation, @DeleteOperation
        Defines operations for actuator endpoints.









