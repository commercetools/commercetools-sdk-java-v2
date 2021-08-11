
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLineItemShippingDetailsActionBuilder
        implements Builder<StagedOrderSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public StagedOrderSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(
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

    public StagedOrderSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId,
            StagedOrderSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds StagedOrderSetLineItemShippingDetailsAction without checking for non null required values
     */
    public StagedOrderSetLineItemShippingDetailsAction buildUnchecked() {
        return new StagedOrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    public static StagedOrderSetLineItemShippingDetailsActionBuilder of() {
        return new StagedOrderSetLineItemShippingDetailsActionBuilder();
    }

    public static StagedOrderSetLineItemShippingDetailsActionBuilder of(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        StagedOrderSetLineItemShippingDetailsActionBuilder builder = new StagedOrderSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
