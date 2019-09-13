package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomLineItemShippingDetailsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = CartSetCustomLineItemShippingDetailsActionImpl.class)
public interface CartSetCustomLineItemShippingDetailsAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static CartSetCustomLineItemShippingDetailsActionImpl of(){
      return new CartSetCustomLineItemShippingDetailsActionImpl();
   }
   

   public static CartSetCustomLineItemShippingDetailsActionImpl of(final CartSetCustomLineItemShippingDetailsAction template) {
      CartSetCustomLineItemShippingDetailsActionImpl instance = new CartSetCustomLineItemShippingDetailsActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setShippingDetails(template.getShippingDetails());
      return instance;
   }

}