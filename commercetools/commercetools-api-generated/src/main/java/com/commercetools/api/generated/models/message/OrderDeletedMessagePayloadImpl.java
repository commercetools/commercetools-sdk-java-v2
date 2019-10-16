package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Order;
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

   private String type;
   
   private com.commercetools.api.generated.models.order.Order order;

   @JsonCreator
   OrderDeletedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.generated.models.order.Order order) {
      this.order = order;
      this.type = "OrderDeleted";
   }
   public OrderDeletedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.order.Order getOrder(){
      return this.order;
   }

   public void setOrder(final com.commercetools.api.generated.models.order.Order order){
      this.order = order;
   }

}