package com.commercetools.api.generated.models.cart;


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
public final class ItemShippingTargetImpl implements ItemShippingTarget {

   private Integer quantity;
   
   private String addressKey;

   @JsonCreator
   ItemShippingTargetImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("addressKey") final String addressKey) {
      this.quantity = quantity;
      this.addressKey = addressKey;
   }
   public ItemShippingTargetImpl() {
      
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public String getAddressKey(){
      return this.addressKey;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setAddressKey(final String addressKey){
      this.addressKey = addressKey;
   }

}