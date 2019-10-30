package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LocalizedString;
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
public final class PaymentMethodInfoImpl implements PaymentMethodInfo {

   private String method;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private String paymentInterface;

   @JsonCreator
   PaymentMethodInfoImpl(@JsonProperty("method") final String method, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("paymentInterface") final String paymentInterface) {
      this.method = method;
      this.name = name;
      this.paymentInterface = paymentInterface;
   }
   public PaymentMethodInfoImpl() {
      
   }
   
   
   public String getMethod(){
      return this.method;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getPaymentInterface(){
      return this.paymentInterface;
   }

   public void setMethod(final String method){
      this.method = method;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setPaymentInterface(final String paymentInterface){
      this.paymentInterface = paymentInterface;
   }

}