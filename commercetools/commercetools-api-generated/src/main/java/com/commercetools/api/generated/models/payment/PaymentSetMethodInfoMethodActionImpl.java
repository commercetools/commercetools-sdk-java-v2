package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetMethodInfoMethodActionImpl implements PaymentSetMethodInfoMethodAction {

   private String action;
   
   private String method;

   @JsonCreator
   PaymentSetMethodInfoMethodActionImpl(@JsonProperty("method") final String method) {
      this.method = method;
      this.action = "setMethodInfoMethod";
   }
   public PaymentSetMethodInfoMethodActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If not provided, the method is unset.</p>
   */
   public String getMethod(){
      return this.method;
   }

   public void setMethod(final String method){
      this.method = method;
   }

}