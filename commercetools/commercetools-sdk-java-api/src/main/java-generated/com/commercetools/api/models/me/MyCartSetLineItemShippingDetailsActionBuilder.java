
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetLineItemShippingDetailsActionBuilder
        implements Builder<MyCartSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public MyCartSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(
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

    public MyCartSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds MyCartSetLineItemShippingDetailsAction without checking for non null required values
     */
    public MyCartSetLineItemShippingDetailsAction buildUnchecked() {
        return new MyCartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    public static MyCartSetLineItemShippingDetailsActionBuilder of() {
        return new MyCartSetLineItemShippingDetailsActionBuilder();
    }

    public static MyCartSetLineItemShippingDetailsActionBuilder of(
            final MyCartSetLineItemShippingDetailsAction template) {
        MyCartSetLineItemShippingDetailsActionBuilder builder = new MyCartSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
