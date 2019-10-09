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
public final class PaymentSetStatusInterfaceTextActionImpl implements PaymentSetStatusInterfaceTextAction {

   private String action;
   
   private String interfaceText;

   @JsonCreator
   PaymentSetStatusInterfaceTextActionImpl(@JsonProperty("interfaceText") final String interfaceText) {
      this.interfaceText = interfaceText;
      this.action = "setStatusInterfaceText";
   }
   public PaymentSetStatusInterfaceTextActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getInterfaceText(){
      return this.interfaceText;
   }

   public void setInterfaceText(final String interfaceText){
      this.interfaceText = interfaceText;
   }

}