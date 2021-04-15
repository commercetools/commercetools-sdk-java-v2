
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetLineItemShippingDetailsActionBuilder {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public OrderSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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
