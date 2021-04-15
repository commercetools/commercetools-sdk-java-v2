
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomLineItemTaxRateActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public StagedOrderSetCustomLineItemTaxRateAction build() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of() {
        return new StagedOrderSetCustomLineItemTaxRateActionBuilder();
    }

    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionBuilder builder = new StagedOrderSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
