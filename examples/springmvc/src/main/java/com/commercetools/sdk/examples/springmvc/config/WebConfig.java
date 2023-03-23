
package com.commercetools.sdk.examples.springmvc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.*;
import io.vrap.rmf.base.client.error.NotFoundException;

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    private ApplicationContext ctx;

    @ExceptionHandler(NotFoundException.class)
    public String handleNoSuchElementFoundException(NotFoundException exception) {
        return exception.getMessage();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/static/");
    }
}
