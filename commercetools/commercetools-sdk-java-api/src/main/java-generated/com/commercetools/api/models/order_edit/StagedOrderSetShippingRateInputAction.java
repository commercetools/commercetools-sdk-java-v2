package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputActionImpl;

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
@JsonDeserialize(as = StagedOrderSetShippingRateInputActionImpl.class)
public interface StagedOrderSetShippingRateInputAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    
    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);
    

    public static StagedOrderSetShippingRateInputAction of(){
        return new StagedOrderSetShippingRateInputActionImpl();
    }
    

    public static StagedOrderSetShippingRateInputAction of(final StagedOrderSetShippingRateInputAction template) {
        StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    public static StagedOrderSetShippingRateInputActionBuilder builder(){
        return StagedOrderSetShippingRateInputActionBuilder.of();
    }
    
    public static StagedOrderSetShippingRateInputActionBuilder builder(final StagedOrderSetShippingRateInputAction template){
        return StagedOrderSetShippingRateInputActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetShippingRateInputAction(Function<StagedOrderSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }
}
