package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

@Repository
@Component
public class MeRepository {
    private final ProjectApiRoot apiRoot;

    private static final Logger logger = LoggerFactory.getLogger(MeRepository.class);
    public MeRepository(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public Mono<Cart> meCart()
    {
        return Mono.fromFuture(apiRoot.me().activeCart().get().execute()
                .thenApply(ApiHttpResponse::getBody)
        )
                .onErrorReturn(CartBuilder.of().lineItems(Collections.emptyList()).buildUnchecked());
    }
}
