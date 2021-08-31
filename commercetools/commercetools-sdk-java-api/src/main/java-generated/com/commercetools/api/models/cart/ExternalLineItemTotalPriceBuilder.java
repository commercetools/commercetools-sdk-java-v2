
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalLineItemTotalPriceBuilder implements Builder<ExternalLineItemTotalPrice> {

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.common.Money totalPrice;

    public ExternalLineItemTotalPriceBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ExternalLineItemTotalPriceBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ExternalLineItemTotalPriceBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ExternalLineItemTotalPriceBuilder totalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    public ExternalLineItemTotalPrice build() {
        Objects.requireNonNull(price, ExternalLineItemTotalPrice.class + ": price is missing");
        Objects.requireNonNull(totalPrice, ExternalLineItemTotalPrice.class + ": totalPrice is missing");
        return new ExternalLineItemTotalPriceImpl(price, totalPrice);
    }

    /**
     * builds ExternalLineItemTotalPrice without checking for non null required values
     */
    public ExternalLineItemTotalPrice buildUnchecked() {
        return new ExternalLineItemTotalPriceImpl(price, totalPrice);
    }

    public static ExternalLineItemTotalPriceBuilder of() {
        return new ExternalLineItemTotalPriceBuilder();
    }

    public static ExternalLineItemTotalPriceBuilder of(final ExternalLineItemTotalPrice template) {
        ExternalLineItemTotalPriceBuilder builder = new ExternalLineItemTotalPriceBuilder();
        builder.price = template.getPrice();
        builder.totalPrice = template.getTotalPrice();
        return builder;
    }

}
