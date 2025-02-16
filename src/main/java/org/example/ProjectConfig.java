package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class ProjectConfig {

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }
}
