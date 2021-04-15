
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeTaxRoundingModeActionBuilder {

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    public StagedOrderChangeTaxRoundingModeActionBuilder taxRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public StagedOrderChangeTaxRoundingModeAction build() {
        return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder of() {
        return new StagedOrderChangeTaxRoundingModeActionBuilder();
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder of(
            final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionBuilder builder = new StagedOrderChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
