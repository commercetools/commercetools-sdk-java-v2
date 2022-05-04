package com.commercetools.sdk.examples.spring.config;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import static org.springframework.security.web.reactive.result.view.CsrfRequestDataValueProcessor.DEFAULT_CSRF_ATTR_NAME;

//@ControllerAdvice
public class SecurityControllerAdvice {
//    @ModelAttribute
    Mono<CsrfToken> csrfToken(ServerWebExchange exchange) {
        Mono<CsrfToken> csrfToken = exchange.getAttribute(CsrfToken.class.getName());
        return csrfToken.doOnSuccess(token -> exchange.getAttributes()
                .put(DEFAULT_CSRF_ATTR_NAME, token));
    }
}
