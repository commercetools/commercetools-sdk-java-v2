
package com.commercetools.sdk.examples.springmvc.service;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;

import com.newrelic.api.agent.Trace;
import io.vrap.rmf.base.client.ApiHttpResponse;

import jakarta.servlet.http.HttpSession;

public class CartRepository {
    private final ProjectScopedApiRoot apiRoot;

    private final HttpSession session;

    public static final String SESSION_CART = "ctp.session.cart";
    public static final String SESSION_CART_ITEMS = "ctp.session.cart_items";

    public CartRepository(ProjectScopedApiRoot apiRoot, HttpSession session) {
        this.apiRoot = apiRoot;
        this.session = session;
    }

    private Cart emptyCart() {
        return CartBuilder.of().lineItems(Collections.emptyList()).buildUnchecked();
    }

    @Trace(async = true)
    public CompletableFuture<Cart> meCart() {
        if (session.getAttribute(SESSION_CART) == null) {
            return CompletableFuture.completedFuture(emptyCart());
        }
        return apiRoot.carts().withId(session.getAttribute(SESSION_CART).toString()).get().execute()
                .thenApply(ApiHttpResponse::getBody)
                .thenApply(cart -> {
                    session.setAttribute(SESSION_CART, cart.getId());
                    session.setAttribute(SESSION_CART_ITEMS, cart.getTotalLineItemQuantity());
                    return cart;
                })
                .exceptionally(throwable -> emptyCart());
    }


    public CompletableFuture<Cart> addToCart(final String sku) {
        return addToCart(sku, 1);
    }

    public CompletableFuture<Cart> addToCart(final String sku, final long quantity) {
        return meCart().thenCompose(cart -> {
            if (cart.getId() == null) {
                return apiRoot.carts()
                        .post(c -> c.currency("EUR").plusLineItems(b -> b.sku(sku).quantity(quantity)))
                        .execute()
                        .thenApply(ApiHttpResponse::getBody)
                        .thenApply(c -> {
                            session.setAttribute(SESSION_CART, c.getId());
                            session.setAttribute(SESSION_CART_ITEMS, c.getTotalLineItemQuantity());
                            return c;
                        });
            }
            return apiRoot.carts()
                    .withId(cart.getId())
                    .post(c -> c.version(cart.getVersion())
                            .plusActions(a -> a.addLineItemBuilder().sku(sku).quantity(quantity)))
                    .execute()
                    .thenApply(ApiHttpResponse::getBody);
        });
    }

    public CompletableFuture<Cart> removeFromCart(final String lineItemId) {
        return meCart().thenCompose(cart -> {
            if (cart.getId() == null) {
                return CompletableFuture.completedFuture(emptyCart());
            }
            return apiRoot.carts()
                    .withId(cart.getId())
                    .post(c -> c.version(cart.getVersion())
                            .withActions(a -> a.removeLineItemBuilder().lineItemId(lineItemId)))
                    .execute()
                    .thenApply(ApiHttpResponse::getBody);
        });
    }
}
