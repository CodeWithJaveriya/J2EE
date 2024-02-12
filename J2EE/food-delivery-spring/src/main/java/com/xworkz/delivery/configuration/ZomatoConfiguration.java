package com.xworkz.delivery.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.delivery")
public class ZomatoConfiguration {

    @Bean
    public ViewResolver getViewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }

    @Bean
    public LocalEntityManagerFactoryBean localEntityManagerFactoryBean(){
        LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
        bean.setPersistenceUnitName("com.xworkz");
        return bean;
    }


}
