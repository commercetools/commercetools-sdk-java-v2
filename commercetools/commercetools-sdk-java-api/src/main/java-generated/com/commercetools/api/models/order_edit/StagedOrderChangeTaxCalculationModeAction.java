package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderChangeTaxCalculationModeActionImpl.class)
public interface StagedOrderChangeTaxCalculationModeAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public static StagedOrderChangeTaxCalculationModeAction of(){
        return new StagedOrderChangeTaxCalculationModeActionImpl();
    }
    

    public static StagedOrderChangeTaxCalculationModeAction of(final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionImpl instance = new StagedOrderChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder builder(){
        return StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }
    
    public static StagedOrderChangeTaxCalculationModeActionBuilder builder(final StagedOrderChangeTaxCalculationModeAction template){
        return StagedOrderChangeTaxCalculationModeActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderChangeTaxCalculationModeAction(Function<StagedOrderChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }
}
