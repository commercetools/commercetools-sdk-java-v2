
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomLineItemShippingDetailsActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
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

    public StagedOrderSetCustomLineItemShippingDetailsAction build() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
    }

    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder = new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
