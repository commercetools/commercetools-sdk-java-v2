package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsImpl;

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
@JsonDeserialize(as = ItemShippingDetailsImpl.class)
public interface ItemShippingDetails  {

   
   @NotNull
   @Valid
   @JsonProperty("targets")
   public List<ItemShippingTarget> getTargets();
   
   @NotNull
   @JsonProperty("valid")
   public Boolean getValid();

   public void setTargets(final List<ItemShippingTarget> targets);
   
   public void setValid(final Boolean valid);
   
   public static ItemShippingDetailsImpl of(){
      return new ItemShippingDetailsImpl();
   }
   

   public static ItemShippingDetailsImpl of(final ItemShippingDetails template) {
      ItemShippingDetailsImpl instance = new ItemShippingDetailsImpl();
      instance.setValid(template.getValid());
      instance.setTargets(template.getTargets());
      return instance;
   }

}