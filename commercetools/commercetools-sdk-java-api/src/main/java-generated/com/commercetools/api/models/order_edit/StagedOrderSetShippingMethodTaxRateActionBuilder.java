
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingMethodTaxRateActionBuilder
        implements Builder<StagedOrderSetShippingMethodTaxRateAction> {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public StagedOrderSetShippingMethodTaxRateAction build() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingMethodTaxRateAction without checking for non null required values
     */
    public StagedOrderSetShippingMethodTaxRateAction buildUnchecked() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder of() {
        return new StagedOrderSetShippingMethodTaxRateActionBuilder();
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder of(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionBuilder builder = new StagedOrderSetShippingMethodTaxRateActionBuilder();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
