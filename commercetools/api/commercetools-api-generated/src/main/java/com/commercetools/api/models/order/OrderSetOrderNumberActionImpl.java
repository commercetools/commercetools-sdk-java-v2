package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetOrderNumberActionImpl implements OrderSetOrderNumberAction {

   private String action;
   
   private String orderNumber;

   @JsonCreator
   OrderSetOrderNumberActionImpl(@JsonProperty("orderNumber") final String orderNumber) {
      this.orderNumber = orderNumber;
      this.action = "setOrderNumber";
   }
   public OrderSetOrderNumberActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getOrderNumber(){
      return this.orderNumber;
   }

   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }

}
