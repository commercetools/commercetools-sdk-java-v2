
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderExcerptBuilder implements Builder<OrderExcerpt> {

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private Integer version;

    public OrderExcerptBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderExcerptBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public OrderExcerptBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    public OrderExcerptBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public OrderExcerptBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public Integer getVersion() {
        return this.version;
    }

    public OrderExcerpt build() {
        Objects.requireNonNull(totalPrice, OrderExcerpt.class + ": totalPrice is missing");
        Objects.requireNonNull(version, OrderExcerpt.class + ": version is missing");
        return new OrderExcerptImpl(totalPrice, taxedPrice, version);
    }

    /**
     * builds OrderExcerpt without checking for non null required values
     */
    public OrderExcerpt buildUnchecked() {
        return new OrderExcerptImpl(totalPrice, taxedPrice, version);
    }

    public static OrderExcerptBuilder of() {
        return new OrderExcerptBuilder();
    }

    public static OrderExcerptBuilder of(final OrderExcerpt template) {
        OrderExcerptBuilder builder = new OrderExcerptBuilder();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.version = template.getVersion();
        return builder;
    }

}
