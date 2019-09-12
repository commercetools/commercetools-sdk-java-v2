package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodSetDescriptionActionImpl;

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
@JsonDeserialize(as = ShippingMethodSetDescriptionActionImpl.class)
public interface ShippingMethodSetDescriptionAction extends ShippingMethodUpdateAction {

   
   
   @JsonProperty("description")
   public String getDescription();

   public void setDescription(final String description);
   
   public static ShippingMethodSetDescriptionActionImpl of(){
      return new ShippingMethodSetDescriptionActionImpl();
   }
   

   public static ShippingMethodSetDescriptionActionImpl of(final ShippingMethodSetDescriptionAction template) {
      ShippingMethodSetDescriptionActionImpl instance = new ShippingMethodSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}