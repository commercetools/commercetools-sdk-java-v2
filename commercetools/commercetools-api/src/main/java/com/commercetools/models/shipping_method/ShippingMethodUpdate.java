package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodUpdateImpl;

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
@JsonDeserialize(as = ShippingMethodUpdateImpl.class)
public interface ShippingMethodUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ShippingMethodUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ShippingMethodUpdateAction> actions);
   
   public static ShippingMethodUpdateImpl of(){
      return new ShippingMethodUpdateImpl();
   }
   

   public static ShippingMethodUpdateImpl of(final ShippingMethodUpdate template) {
      ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}