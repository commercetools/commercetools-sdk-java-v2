
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartRemoveLineItemActionBuilder implements Builder<MyCartRemoveLineItemAction> {

    private String lineItemId;

    @Nullable
    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    public MyCartRemoveLineItemActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public MyCartRemoveLineItemActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public MyCartRemoveLineItemActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    public MyCartRemoveLineItemActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    public MyCartRemoveLineItemActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    public MyCartRemoveLineItemActionBuilder shippingDetailsToRemove(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetailsToRemove = builder
                .apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public MyCartRemoveLineItemActionBuilder shippingDetailsToRemove(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
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

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove() {
        return this.shippingDetailsToRemove;
    }

    public MyCartRemoveLineItemAction build() {
        Objects.requireNonNull(lineItemId, MyCartRemoveLineItemAction.class + ": lineItemId is missing");
        return new MyCartRemoveLineItemActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice,
            shippingDetailsToRemove);
    }

    /**
     * builds MyCartRemoveLineItemAction without checking for non null required values
     */
    public MyCartRemoveLineItemAction buildUnchecked() {
        return new MyCartRemoveLineItemActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice,
            shippingDetailsToRemove);
    }

    public static MyCartRemoveLineItemActionBuilder of() {
        return new MyCartRemoveLineItemActionBuilder();
    }

    public static MyCartRemoveLineItemActionBuilder of(final MyCartRemoveLineItemAction template) {
        MyCartRemoveLineItemActionBuilder builder = new MyCartRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
        return builder;
    }

}
