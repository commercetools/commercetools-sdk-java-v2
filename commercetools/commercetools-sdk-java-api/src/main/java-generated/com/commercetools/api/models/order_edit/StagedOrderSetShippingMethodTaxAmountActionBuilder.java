
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingMethodTaxAmountActionBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public StagedOrderSetShippingMethodTaxAmountAction build() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of() {
        return new StagedOrderSetShippingMethodTaxAmountActionBuilder();
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        StagedOrderSetShippingMethodTaxAmountActionBuilder builder = new StagedOrderSetShippingMethodTaxAmountActionBuilder();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
