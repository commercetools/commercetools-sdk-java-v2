package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
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
public final class PaymentSetInterfaceIdActionImpl implements PaymentSetInterfaceIdAction {

   private String action;
   
   private String interfaceId;

   @JsonCreator
   PaymentSetInterfaceIdActionImpl(@JsonProperty("interfaceId") final String interfaceId) {
      this.interfaceId = interfaceId;
      this.action = "setInterfaceId";
   }
   public PaymentSetInterfaceIdActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getInterfaceId(){
      return this.interfaceId;
   }

   public void setInterfaceId(final String interfaceId){
      this.interfaceId = interfaceId;
   }

}