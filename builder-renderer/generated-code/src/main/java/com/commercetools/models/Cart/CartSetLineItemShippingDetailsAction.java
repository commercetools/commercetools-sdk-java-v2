package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemShippingDetailsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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
      instance.setShippingDetails(template.getShippingDetails());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}