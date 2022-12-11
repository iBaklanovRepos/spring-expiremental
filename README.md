# Spring experimental

This is the project that demonstrates and extends core features of Spring IoC container, Bean lifecycle, etc.

## Covered features
### 3-phase constructor

Example provided in [PascalDeveloper](src/main/java/org/example/api/PascalDeveloper.java) demonstrates 3 phases when
Spring's bean could be modified
- phase 1 - Java constructor
- phase 2 - method annotated with @PostConstruct
- phase 3 - method which is called on context refresh event

### Dynamic proxy

Feature that allows to add extra functionality to compiled class at runtime via custom [BeanPostProcessor](src/main/java/org/example/infra/ProfilingAnnotationBeanPostProcessor.java)

### Application context

Created custom [ApplicationContext](src/main/java/org/example/infra/PropertyFileApplicationContext.java) based on beans described in .properties file

### Bean scope

Created custom [PeriodicalBeanScope](src/main/java/org/example/infra/PeriodicalScopeConfigurer.java) which is a mix of singleton and prototype scopes 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)