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
public final class OrderSetCustomerIdActionImpl implements OrderSetCustomerIdAction {

   private String action;
   
   private String customerId;

   @JsonCreator
   OrderSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
      this.customerId = customerId;
      this.action = "setCustomerId";
   }
   public OrderSetCustomerIdActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomerId(){
      return this.customerId;
   }

   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }

}