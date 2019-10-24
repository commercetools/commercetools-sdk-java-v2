package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
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
public final class OrderUpdateImpl implements OrderUpdate {

   private java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> actions;
   
   private Long version;

   @JsonCreator
   OrderUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public OrderUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}