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
public final class PaymentSetMethodInfoInterfaceActionImpl implements PaymentSetMethodInfoInterfaceAction {

   private String action;
   
   private String _interface;

   @JsonCreator
   PaymentSetMethodInfoInterfaceActionImpl(@JsonProperty("interface") final String _interface) {
      this._interface = _interface;
      this.action = "setMethodInfoInterface";
   }
   public PaymentSetMethodInfoInterfaceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   public String getInterface() {
      return this._interface;
   }

   public void setInterface(final String _interface) {
      this._interface = _interface;
   }

}