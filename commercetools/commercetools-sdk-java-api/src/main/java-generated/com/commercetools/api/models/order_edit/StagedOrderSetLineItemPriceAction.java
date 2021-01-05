package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemPriceActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemPriceActionImpl.class)
public interface StagedOrderSetLineItemPriceAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    public void setLineItemId(final String lineItemId);
    
    public void setExternalPrice(final Money externalPrice);

    public static StagedOrderSetLineItemPriceAction of(){
        return new StagedOrderSetLineItemPriceActionImpl();
    }
    

    public static StagedOrderSetLineItemPriceAction of(final StagedOrderSetLineItemPriceAction template) {
        StagedOrderSetLineItemPriceActionImpl instance = new StagedOrderSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalPrice(template.getExternalPrice());
        return instance;
    }

    public static StagedOrderSetLineItemPriceActionBuilder builder(){
        return StagedOrderSetLineItemPriceActionBuilder.of();
    }
    
    public static StagedOrderSetLineItemPriceActionBuilder builder(final StagedOrderSetLineItemPriceAction template){
        return StagedOrderSetLineItemPriceActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetLineItemPriceAction(Function<StagedOrderSetLineItemPriceAction, T> helper) {
        return helper.apply(this);
    }
}
