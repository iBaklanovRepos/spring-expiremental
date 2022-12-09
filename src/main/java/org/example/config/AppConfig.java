package org.example.config;

import org.example.api.Developer;
import org.example.api.JuniorDeveloper;
import org.example.infra.InjectRandomIntAnnotationProcessor;
import org.example.infra.PostProxyInvokerContextListener;
import org.example.infra.ProfilingAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InjectRandomIntAnnotationProcessor injectRandomIntAnnotationProcessor() {
        return new InjectRandomIntAnnotationProcessor();
    }

    @Bean
    public ProfilingAnnotationBeanPostProcessor profilingAnnotationBeanPostProcessor() {
        return new ProfilingAnnotationBeanPostProcessor();
    }

    @Bean
    public PostProxyInvokerContextListener postProxyInvokerContextListener() {
        return new PostProxyInvokerContextListener();
    }

    @Bean
    public JuniorDeveloper developer() {
        return new JuniorDeveloper();
    }
}
