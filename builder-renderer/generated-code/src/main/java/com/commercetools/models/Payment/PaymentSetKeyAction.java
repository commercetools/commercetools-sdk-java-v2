package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetKeyActionImpl.class)
public interface PaymentSetKeyAction extends PaymentUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static PaymentSetKeyActionImpl of(){
      return new PaymentSetKeyActionImpl();
   }
   

   public static PaymentSetKeyActionImpl of(final PaymentSetKeyAction template) {
      PaymentSetKeyActionImpl instance = new PaymentSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}