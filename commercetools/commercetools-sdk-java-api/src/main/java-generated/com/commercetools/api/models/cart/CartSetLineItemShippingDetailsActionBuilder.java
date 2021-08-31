
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemShippingDetailsActionBuilder
        implements Builder<CartSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public CartSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public CartSetLineItemShippingDetailsActionBuilder shippingDetails(
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

    public CartSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new CartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds CartSetLineItemShippingDetailsAction without checking for non null required values
     */
    public CartSetLineItemShippingDetailsAction buildUnchecked() {
        return new CartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    public static CartSetLineItemShippingDetailsActionBuilder of() {
        return new CartSetLineItemShippingDetailsActionBuilder();
    }

    public static CartSetLineItemShippingDetailsActionBuilder of(final CartSetLineItemShippingDetailsAction template) {
        CartSetLineItemShippingDetailsActionBuilder builder = new CartSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
