package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangeTaxCalculationModeActionBuilder {

    
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    public StagedOrderChangeTaxCalculationModeActionBuilder taxCalculationMode( final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
        return this.taxCalculationMode;
    }

    public StagedOrderChangeTaxCalculationModeAction build() {
        return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder of() {
        return new StagedOrderChangeTaxCalculationModeActionBuilder();
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder of(final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionBuilder builder = new StagedOrderChangeTaxCalculationModeActionBuilder();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        return builder;
    }

}
