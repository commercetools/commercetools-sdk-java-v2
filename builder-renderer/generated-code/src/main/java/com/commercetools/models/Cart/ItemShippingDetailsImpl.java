package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.Boolean;
import javax.annotation.Generated;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemShippingDetailsImpl implements ItemShippingDetails {

   private java.lang.Boolean valid;
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targets;

   @JsonCreator
   ItemShippingDetailsImpl(@JsonProperty("valid") final java.lang.Boolean valid, @JsonProperty("targets") final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targets) {
      this.valid = valid;
      this.targets = targets;
   }
   public ItemShippingDetailsImpl() {
      
   }
   
   
   public java.lang.Boolean getValid(){
      return this.valid;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }

   public void setValid(final java.lang.Boolean valid){
      this.valid = valid;
   }
   
   public void setTargets(final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targets){
      this.targets = targets;
   }

}