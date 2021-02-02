
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetCustomLineItemShippingDetailsActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public OrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public OrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public OrderSetCustomLineItemShippingDetailsAction build() {
        return new OrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder of() {
        return new OrderSetCustomLineItemShippingDetailsActionBuilder();
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder of(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        OrderSetCustomLineItemShippingDetailsActionBuilder builder = new OrderSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
