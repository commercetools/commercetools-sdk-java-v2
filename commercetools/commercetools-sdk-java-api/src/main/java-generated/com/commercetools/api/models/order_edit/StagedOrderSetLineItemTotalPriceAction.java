package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTotalPriceActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemTotalPriceActionImpl.class)
public interface StagedOrderSetLineItemTotalPriceAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);
    
    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static StagedOrderSetLineItemTotalPriceActionImpl of(){
        return new StagedOrderSetLineItemTotalPriceActionImpl();
    }
    

    public static StagedOrderSetLineItemTotalPriceActionImpl of(final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionImpl instance = new StagedOrderSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    default <T> T withStagedOrderSetLineItemTotalPriceAction(Function<StagedOrderSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }
}
