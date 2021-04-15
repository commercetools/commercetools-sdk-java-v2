package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeTaxModeActionImpl.class)
public interface StagedOrderChangeTaxModeAction extends StagedOrderUpdateAction {

    String CHANGE_TAX_MODE = "changeTaxMode";

    
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    
    public void setTaxMode(final TaxMode taxMode);
    

    public static StagedOrderChangeTaxModeAction of(){
        return new StagedOrderChangeTaxModeActionImpl();
    }
    

    public static StagedOrderChangeTaxModeAction of(final StagedOrderChangeTaxModeAction template) {
        StagedOrderChangeTaxModeActionImpl instance = new StagedOrderChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public static StagedOrderChangeTaxModeActionBuilder builder(){
        return StagedOrderChangeTaxModeActionBuilder.of();
    }
    
    public static StagedOrderChangeTaxModeActionBuilder builder(final StagedOrderChangeTaxModeAction template){
        return StagedOrderChangeTaxModeActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderChangeTaxModeAction(Function<StagedOrderChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }
}
