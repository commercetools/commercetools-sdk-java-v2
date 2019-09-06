package com.commercetools.models.Payment;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetMethodInfoNameActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoNameActionImpl.class)
public interface PaymentSetMethodInfoNameAction extends PaymentUpdateAction {

   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static PaymentSetMethodInfoNameActionImpl of(){
      return new PaymentSetMethodInfoNameActionImpl();
   }
   

   public static PaymentSetMethodInfoNameActionImpl of(final PaymentSetMethodInfoNameAction template) {
      PaymentSetMethodInfoNameActionImpl instance = new PaymentSetMethodInfoNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}