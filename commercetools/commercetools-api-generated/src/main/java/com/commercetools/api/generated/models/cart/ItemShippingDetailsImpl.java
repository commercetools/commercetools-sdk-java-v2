package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemShippingDetailsImpl implements ItemShippingDetails {

   private Boolean valid;
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets;

   @JsonCreator
   ItemShippingDetailsImpl(@JsonProperty("valid") final Boolean valid, @JsonProperty("targets") final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets) {
      this.valid = valid;
      this.targets = targets;
   }
   public ItemShippingDetailsImpl() {
      
   }
   
   
   public Boolean getValid(){
      return this.valid;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }

   public void setValid(final Boolean valid){
      this.valid = valid;
   }
   
   public void setTargets(final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets){
      this.targets = targets;
   }

}