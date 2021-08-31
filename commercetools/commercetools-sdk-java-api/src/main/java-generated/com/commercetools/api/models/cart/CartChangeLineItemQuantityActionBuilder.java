
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeLineItemQuantityActionBuilder implements Builder<CartChangeLineItemQuantityAction> {

    private String lineItemId;

    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    public CartChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CartChangeLineItemQuantityActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CartChangeLineItemQuantityActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    public CartChangeLineItemQuantityActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    public CartChangeLineItemQuantityActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public CartChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId, CartChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, CartChangeLineItemQuantityAction.class + ": quantity is missing");
        return new CartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    /**
     * builds CartChangeLineItemQuantityAction without checking for non null required values
     */
    public CartChangeLineItemQuantityAction buildUnchecked() {
        return new CartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    public static CartChangeLineItemQuantityActionBuilder of() {
        return new CartChangeLineItemQuantityActionBuilder();
    }

    public static CartChangeLineItemQuantityActionBuilder of(final CartChangeLineItemQuantityAction template) {
        CartChangeLineItemQuantityActionBuilder builder = new CartChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
