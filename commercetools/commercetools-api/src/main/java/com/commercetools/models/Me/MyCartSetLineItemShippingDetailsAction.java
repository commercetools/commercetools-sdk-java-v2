package com.commercetools.models.me;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartSetLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = MyCartSetLineItemShippingDetailsActionImpl.class)
public interface MyCartSetLineItemShippingDetailsAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setLineItemId(final String lineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static MyCartSetLineItemShippingDetailsActionImpl of(){
      return new MyCartSetLineItemShippingDetailsActionImpl();
   }
   

   public static MyCartSetLineItemShippingDetailsActionImpl of(final MyCartSetLineItemShippingDetailsAction template) {
      MyCartSetLineItemShippingDetailsActionImpl instance = new MyCartSetLineItemShippingDetailsActionImpl();
      instance.setShippingDetails(template.getShippingDetails());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}