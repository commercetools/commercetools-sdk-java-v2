package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetStatusInterfaceTextActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetStatusInterfaceTextActionImpl.class)
public interface PaymentSetStatusInterfaceTextAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("interfaceText")
   public String getInterfaceText();

   public void setInterfaceText(final String interfaceText);
   
   public static PaymentSetStatusInterfaceTextActionImpl of(){
      return new PaymentSetStatusInterfaceTextActionImpl();
   }
   

   public static PaymentSetStatusInterfaceTextActionImpl of(final PaymentSetStatusInterfaceTextAction template) {
      PaymentSetStatusInterfaceTextActionImpl instance = new PaymentSetStatusInterfaceTextActionImpl();
      instance.setInterfaceText(template.getInterfaceText());
      return instance;
   }

}