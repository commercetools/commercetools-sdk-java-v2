
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemTaxRateActionBuilder implements Builder<CartSetLineItemTaxRateAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public CartSetLineItemTaxRateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public CartSetLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public CartSetLineItemTaxRateAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemTaxRateAction.class + ": lineItemId is missing");
        return new CartSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate);
    }

    /**
     * builds CartSetLineItemTaxRateAction without checking for non null required values
     */
    public CartSetLineItemTaxRateAction buildUnchecked() {
        return new CartSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate);
    }

    public static CartSetLineItemTaxRateActionBuilder of() {
        return new CartSetLineItemTaxRateActionBuilder();
    }

    public static CartSetLineItemTaxRateActionBuilder of(final CartSetLineItemTaxRateAction template) {
        CartSetLineItemTaxRateActionBuilder builder = new CartSetLineItemTaxRateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
