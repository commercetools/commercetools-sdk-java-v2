package com.commercetools.models.Order;

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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemImpl implements DeliveryItem {

   private java.lang.Integer quantity;
   
   private java.lang.String id;

   @JsonCreator
   DeliveryItemImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("id") final java.lang.String id) {
      this.quantity = quantity;
      this.id = id;
   }
   public DeliveryItemImpl() {
      
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }

}