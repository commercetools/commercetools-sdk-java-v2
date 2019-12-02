package com.commercetools.api.generated.models.order;


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
public final class DeliveryItemImpl implements DeliveryItem {

   private Integer quantity;
   
   private String id;

   @JsonCreator
   DeliveryItemImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("id") final String id) {
      this.quantity = quantity;
      this.id = id;
   }
   public DeliveryItemImpl() {
      
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public String getId(){
      return this.id;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setId(final String id){
      this.id = id;
   }

}