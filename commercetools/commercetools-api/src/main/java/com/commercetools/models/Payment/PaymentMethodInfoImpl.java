package com.commercetools.models.payment;

import com.commercetools.models.common.LocalizedString;
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
public final class PaymentMethodInfoImpl implements PaymentMethodInfo {

   private java.lang.String method;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.lang.String paymentInterface;

   @JsonCreator
   PaymentMethodInfoImpl(@JsonProperty("method") final java.lang.String method, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("paymentInterface") final java.lang.String paymentInterface) {
      this.method = method;
      this.name = name;
      this.paymentInterface = paymentInterface;
   }
   public PaymentMethodInfoImpl() {
      
   }
   
   
   public java.lang.String getMethod(){
      return this.method;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getPaymentInterface(){
      return this.paymentInterface;
   }

   public void setMethod(final java.lang.String method){
      this.method = method;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setPaymentInterface(final java.lang.String paymentInterface){
      this.paymentInterface = paymentInterface;
   }

}