package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Order;
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
public final class OrderDeletedMessagePayloadImpl implements OrderDeletedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.order.Order order;

   @JsonCreator
   OrderDeletedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.models.order.Order order) {
      this.order = order;
      this.type = "OrderDeleted";
   }
   public OrderDeletedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.order.Order getOrder(){
      return this.order;
   }

   public void setOrder(final com.commercetools.models.order.Order order){
      this.order = order;
   }

}