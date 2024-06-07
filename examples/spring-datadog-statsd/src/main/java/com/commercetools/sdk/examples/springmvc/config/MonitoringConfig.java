package com.commercetools.sdk.examples.springmvc.config;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import jakarta.servlet.*;
import org.slf4j.MDC;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.UUID;

@Configuration
public class MonitoringConfig {

    @Bean
    FilterRegistrationBean<MDCInsertingServletFilter> mdcFilterRegistrationBean() {
        FilterRegistrationBean<MDCInsertingServletFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RequestIdMDCInsertingServletFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(Integer.MIN_VALUE);
        return registrationBean;
    }

    static class RequestIdMDCInsertingServletFilter extends MDCInsertingServletFilter
    {
        public static String REQUEST_ID = "req.id";

        @Override public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            insertRequestId();
            super.doFilter(request, response, chain);
            clearRequestId();
        }

        void insertRequestId() {
            MDC.put(REQUEST_ID, UUID.randomUUID().toString());
        }

        void clearRequestId() {
            MDC.remove(REQUEST_ID);
        }
    }
}
