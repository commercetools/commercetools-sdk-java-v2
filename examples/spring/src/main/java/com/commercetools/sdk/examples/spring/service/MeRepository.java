
package com.commercetools.sdk.examples.spring.service;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.me.MyCartAddLineItemActionBuilder;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import com.commercetools.api.models.me.MyCartUpdateBuilder;
import com.commercetools.api.models.me.MyLineItemDraftBuilder;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

public class MeRepository {
    private final ProjectApiRoot apiRoot;

    private final WebSession session;

    public static final String SESSION_CART = "ctp.session.cart";
    public static final String SESSION_CART_ITEMS = "ctp.session.cart_items";

    public MeRepository(ProjectApiRoot apiRoot, WebSession session) {
        this.apiRoot = apiRoot;
        this.session = session;
    }

    private Cart emptyCart() {
        return CartBuilder.of().lineItems(Collections.emptyList()).buildUnchecked();
    }

    public Mono<Cart> meCart() {
        if (session.getAttribute(SESSION_CART) == null) {
            return Mono.just(emptyCart());
        }
        return Mono.fromFuture(apiRoot.me().activeCart().get().execute().thenApply(ApiHttpResponse::getBody))
                .doOnSuccess(cart -> {
                    session.getAttributes().put(SESSION_CART, cart.getId());
                    session.getAttributes().put(SESSION_CART_ITEMS, cart.getTotalLineItemQuantity());
                })
                .onErrorReturn(emptyCart());
    }

    public Mono<Customer> me() {
        return Mono.fromFuture(
            apiRoot.me().get().execute().thenApply(ApiHttpResponse::getBody).exceptionally(throwable -> null));
    }

    public Mono<Cart> addToCart(final String sku) {
        return addToCart(sku, 1);
    }

    public Mono<Cart> addToCart(final String sku, final long quantity) {
        return meCart().flatMap(cart -> {
            if (cart.getId() == null) {
                return Mono
                        .fromFuture(apiRoot.me()
                                .carts()
                                .post(MyCartDraftBuilder.of()
                                        .currency("EUR")
                                        .lineItems(MyLineItemDraftBuilder.of().sku(sku).quantity(quantity).build())
                                        .build())
                                .execute()
                                .thenApply(ApiHttpResponse::getBody))
                        .doOnSuccess(c -> {
                            session.getAttributes().put(SESSION_CART, c.getId());
                            session.getAttributes().put(SESSION_CART_ITEMS, c.getTotalLineItemQuantity());
                        });
            }
            return Mono.fromFuture(apiRoot.me()
                    .carts()
                    .withId(cart.getId())
                    .post(MyCartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(MyCartAddLineItemActionBuilder.of().sku(sku).quantity(quantity).build())
                            .build())
                    .execute()
                    .thenApply(ApiHttpResponse::getBody));
        });
    }
}
