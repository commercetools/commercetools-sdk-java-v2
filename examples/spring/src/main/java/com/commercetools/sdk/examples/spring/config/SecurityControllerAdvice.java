package com.commercetools.sdk.examples.spring.config;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.security.web.reactive.result.view.CsrfRequestDataValueProcessor.DEFAULT_CSRF_ATTR_NAME;

//@ControllerAdvice
public class SecurityControllerAdvice {
//    @ModelAttribute
    public void handleRequest(WebSession session, Model model) {
        model.addAttribute("user", "test");
    }
}
