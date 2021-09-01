
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLineItemTaxRateActionBuilder implements Builder<StagedOrderSetLineItemTaxRateAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetLineItemTaxRateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderSetLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetLineItemTaxRateActionBuilder externalTaxRate(
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

    public StagedOrderSetLineItemTaxRateAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemTaxRateAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate);
    }

    /**
     * builds StagedOrderSetLineItemTaxRateAction without checking for non null required values
     */
    public StagedOrderSetLineItemTaxRateAction buildUnchecked() {
        return new StagedOrderSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate);
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder of() {
        return new StagedOrderSetLineItemTaxRateActionBuilder();
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder of(final StagedOrderSetLineItemTaxRateAction template) {
        StagedOrderSetLineItemTaxRateActionBuilder builder = new StagedOrderSetLineItemTaxRateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
