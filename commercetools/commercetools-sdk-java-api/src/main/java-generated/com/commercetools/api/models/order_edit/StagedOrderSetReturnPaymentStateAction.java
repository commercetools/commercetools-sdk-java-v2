package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnPaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetReturnPaymentStateActionImpl.class)
public interface StagedOrderSetReturnPaymentStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    public void setReturnItemId(final String returnItemId);
    
    public void setPaymentState(final ReturnPaymentState paymentState);

    public static StagedOrderSetReturnPaymentStateAction of(){
        return new StagedOrderSetReturnPaymentStateActionImpl();
    }
    

    public static StagedOrderSetReturnPaymentStateAction of(final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionImpl instance = new StagedOrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public static StagedOrderSetReturnPaymentStateActionBuilder builder(){
        return StagedOrderSetReturnPaymentStateActionBuilder.of();
    }
    
    public static StagedOrderSetReturnPaymentStateActionBuilder builder(final StagedOrderSetReturnPaymentStateAction template){
        return StagedOrderSetReturnPaymentStateActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetReturnPaymentStateAction(Function<StagedOrderSetReturnPaymentStateAction, T> helper) {
        return helper.apply(this);
    }
}
