
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemShippingDetailsActionBuilder
        implements Builder<CartSetCustomLineItemShippingDetailsAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public CartSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
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
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemShippingDetailsAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    /**
     * builds CartSetCustomLineItemShippingDetailsAction without checking for non null required values
     */
    public CartSetCustomLineItemShippingDetailsAction buildUnchecked() {
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
