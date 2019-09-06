package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodSetKeyActionImpl;

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
@JsonDeserialize(as = ShippingMethodSetKeyActionImpl.class)
public interface ShippingMethodSetKeyAction extends ShippingMethodUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ShippingMethodSetKeyActionImpl of(){
      return new ShippingMethodSetKeyActionImpl();
   }
   

   public static ShippingMethodSetKeyActionImpl of(final ShippingMethodSetKeyAction template) {
      ShippingMethodSetKeyActionImpl instance = new ShippingMethodSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}