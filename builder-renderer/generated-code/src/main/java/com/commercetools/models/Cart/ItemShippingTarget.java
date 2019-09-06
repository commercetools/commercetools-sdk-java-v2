package com.commercetools.models.Cart;

import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.ItemShippingTargetImpl;

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
@JsonDeserialize(as = ItemShippingTargetImpl.class)
public interface ItemShippingTarget  {

   
   @NotNull
   @JsonProperty("addressKey")
   public String getAddressKey();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();

   public void setAddressKey(final String addressKey);
   
   public void setQuantity(final Integer quantity);
   
   public static ItemShippingTargetImpl of(){
      return new ItemShippingTargetImpl();
   }
   

   public static ItemShippingTargetImpl of(final ItemShippingTarget template) {
      ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
      instance.setQuantity(template.getQuantity());
      instance.setAddressKey(template.getAddressKey());
      return instance;
   }

}