package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import com.commercetools.api.models.customer.Customer;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import java.util.Collections;

public class MeRepository {
    private final ProjectApiRoot apiRoot;

    private final WebSession session;

    public static final String SESSION_CART = "ctp.session.cart";

    public MeRepository(ProjectApiRoot apiRoot, WebSession session) {
        this.apiRoot = apiRoot;
        this.session = session;
    }

    private Cart emptyCart() {
        return CartBuilder.of().lineItems(Collections.emptyList()).buildUnchecked();
    }

    public Mono<Cart> meCart()
    {
        if (session.getAttribute(SESSION_CART) == null) {
            return Mono.just(emptyCart());
        }
        return Mono.fromFuture(apiRoot.me().activeCart().get().execute()
                .thenApply(ApiHttpResponse::getBody)
        )
                .onErrorReturn(emptyCart());
    }

    public Mono<Customer> me()
    {
        return Mono.fromFuture(apiRoot.me().get().execute()
                        .thenApply(ApiHttpResponse::getBody)
                )
                .onErrorReturn(null);
    }
}
