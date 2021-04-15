
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemShippingDetailsActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public CartSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
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

    public CartSetCustomLineItemShippingDetailsAction build() {
        return new CartSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    public static CartSetCustomLineItemShippingDetailsActionBuilder of() {
        return new CartSetCustomLineItemShippingDetailsActionBuilder();
    }

    public static CartSetCustomLineItemShippingDetailsActionBuilder of(
            final CartSetCustomLineItemShippingDetailsAction template) {
        CartSetCustomLineItemShippingDetailsActionBuilder builder = new CartSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
