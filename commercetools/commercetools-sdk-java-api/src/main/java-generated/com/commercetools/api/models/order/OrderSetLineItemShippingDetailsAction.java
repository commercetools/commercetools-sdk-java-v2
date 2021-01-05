package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = OrderSetLineItemShippingDetailsActionImpl.class)
public interface OrderSetLineItemShippingDetailsAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static OrderSetLineItemShippingDetailsAction of(){
        return new OrderSetLineItemShippingDetailsActionImpl();
    }
    

    public static OrderSetLineItemShippingDetailsAction of(final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionImpl instance = new OrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static OrderSetLineItemShippingDetailsActionBuilder builder(){
        return OrderSetLineItemShippingDetailsActionBuilder.of();
    }
    
    public static OrderSetLineItemShippingDetailsActionBuilder builder(final OrderSetLineItemShippingDetailsAction template){
        return OrderSetLineItemShippingDetailsActionBuilder.of(template);
    }
    

    default <T> T withOrderSetLineItemShippingDetailsAction(Function<OrderSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }
}
