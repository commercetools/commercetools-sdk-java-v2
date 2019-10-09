package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetInterfaceIdActionImpl;

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
@JsonDeserialize(as = PaymentSetInterfaceIdActionImpl.class)
public interface PaymentSetInterfaceIdAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("interfaceId")
   public String getInterfaceId();

   public void setInterfaceId(final String interfaceId);
   
   public static PaymentSetInterfaceIdActionImpl of(){
      return new PaymentSetInterfaceIdActionImpl();
   }
   

   public static PaymentSetInterfaceIdActionImpl of(final PaymentSetInterfaceIdAction template) {
      PaymentSetInterfaceIdActionImpl instance = new PaymentSetInterfaceIdActionImpl();
      instance.setInterfaceId(template.getInterfaceId());
      return instance;
   }

}