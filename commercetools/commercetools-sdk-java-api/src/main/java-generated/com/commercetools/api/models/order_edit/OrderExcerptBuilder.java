
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderExcerptBuilder {

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private Integer version;

    public OrderExcerptBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
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
