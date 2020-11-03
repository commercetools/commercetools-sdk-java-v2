package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetCustomLineItemShippingDetailsAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static StagedOrderSetCustomLineItemShippingDetailsActionImpl of(){
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
    }
    

    public static StagedOrderSetCustomLineItemShippingDetailsActionImpl of(final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        StagedOrderSetCustomLineItemShippingDetailsActionImpl instance = new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    default <T> T withStagedOrderSetCustomLineItemShippingDetailsAction(Function<StagedOrderSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }
}
