package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.me.MyCartRemovePaymentActionImpl;

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
@JsonDeserialize(as = MyCartRemovePaymentActionImpl.class)
public interface MyCartRemovePaymentAction extends MyCartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);
   
   public static MyCartRemovePaymentActionImpl of(){
      return new MyCartRemovePaymentActionImpl();
   }
   

   public static MyCartRemovePaymentActionImpl of(final MyCartRemovePaymentAction template) {
      MyCartRemovePaymentActionImpl instance = new MyCartRemovePaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}