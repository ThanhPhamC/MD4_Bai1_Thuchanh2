package rikkei.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"rikkei.academy.controller", "rikkei.academy.service.impl"})
public class Appconfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver viewResolver (){
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/customers/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
