package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
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
public final class PaymentStatusInterfaceCodeSetMessagePayloadImpl implements PaymentStatusInterfaceCodeSetMessagePayload {

   private java.lang.String type;
   
   private java.lang.String paymentId;
   
   private java.lang.String interfaceCode;

   @JsonCreator
   PaymentStatusInterfaceCodeSetMessagePayloadImpl(@JsonProperty("paymentId") final java.lang.String paymentId, @JsonProperty("interfaceCode") final java.lang.String interfaceCode) {
      this.paymentId = paymentId;
      this.interfaceCode = interfaceCode;
      this.type = "PaymentStatusInterfaceCodeSet";
   }
   public PaymentStatusInterfaceCodeSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getPaymentId(){
      return this.paymentId;
   }
   
   
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public void setPaymentId(final java.lang.String paymentId){
      this.paymentId = paymentId;
   }
   
   public void setInterfaceCode(final java.lang.String interfaceCode){
      this.interfaceCode = interfaceCode;
   }

}