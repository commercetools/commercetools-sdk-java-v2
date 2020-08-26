package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetLineItemShippingDetailsActionImpl.class)
public interface CartSetLineItemShippingDetailsAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CartSetLineItemShippingDetailsActionImpl of(){
        return new CartSetLineItemShippingDetailsActionImpl();
    }
    

    public static CartSetLineItemShippingDetailsActionImpl of(final CartSetLineItemShippingDetailsAction template) {
        CartSetLineItemShippingDetailsActionImpl instance = new CartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

}
