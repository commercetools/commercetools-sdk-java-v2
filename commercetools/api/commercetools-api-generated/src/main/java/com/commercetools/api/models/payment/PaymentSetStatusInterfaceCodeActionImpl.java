package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
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
public final class PaymentSetStatusInterfaceCodeActionImpl implements PaymentSetStatusInterfaceCodeAction {

   private String action;

   private String interfaceCode;

   @JsonCreator
   PaymentSetStatusInterfaceCodeActionImpl(@JsonProperty("interfaceCode") final String interfaceCode) {
      this.interfaceCode = interfaceCode;
      this.action = "setStatusInterfaceCode";
   }
   public PaymentSetStatusInterfaceCodeActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getInterfaceCode(){
      return this.interfaceCode;
   }

   public void setInterfaceCode(final String interfaceCode){
      this.interfaceCode = interfaceCode;
   }

}
