package com.commercetools.models.Order;

import com.commercetools.models.Payment.PaymentReference;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentInfoImpl implements PaymentInfo {

   private java.util.List<com.commercetools.models.Payment.PaymentReference> payments;

   @JsonCreator
   PaymentInfoImpl(@JsonProperty("payments") final java.util.List<com.commercetools.models.Payment.PaymentReference> payments) {
      this.payments = payments;
   }
   public PaymentInfoImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Payment.PaymentReference> getPayments(){
      return this.payments;
   }

   public void setPayments(final java.util.List<com.commercetools.models.Payment.PaymentReference> payments){
      this.payments = payments;
   }

}