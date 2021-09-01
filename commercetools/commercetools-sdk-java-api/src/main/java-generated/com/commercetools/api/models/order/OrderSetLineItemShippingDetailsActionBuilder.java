
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetLineItemShippingDetailsActionBuilder
        implements Builder<OrderSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public OrderSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public OrderSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId, OrderSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds OrderSetLineItemShippingDetailsAction without checking for non null required values
     */
    public OrderSetLineItemShippingDetailsAction buildUnchecked() {
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    public static OrderSetLineItemShippingDetailsActionBuilder of() {
        return new OrderSetLineItemShippingDetailsActionBuilder();
    }

    public static OrderSetLineItemShippingDetailsActionBuilder of(
            final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionBuilder builder = new OrderSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
