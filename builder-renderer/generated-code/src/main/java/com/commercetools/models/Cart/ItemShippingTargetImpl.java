package com.commercetools.models.Cart;

import java.lang.Integer;
import java.lang.String;
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
public final class ItemShippingTargetImpl implements ItemShippingTarget {

   private java.lang.Integer quantity;
   
   private java.lang.String addressKey;

   @JsonCreator
   ItemShippingTargetImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("addressKey") final java.lang.String addressKey) {
      this.quantity = quantity;
      this.addressKey = addressKey;
   }
   public ItemShippingTargetImpl() {
      
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setAddressKey(final java.lang.String addressKey){
      this.addressKey = addressKey;
   }

}