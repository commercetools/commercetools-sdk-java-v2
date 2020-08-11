package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.me.MyCartAddPaymentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = MyCartAddPaymentActionImpl.class)
public interface MyCartAddPaymentAction extends MyCartUpdateAction {


   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);

   public static MyCartAddPaymentActionImpl of(){
      return new MyCartAddPaymentActionImpl();
   }


   public static MyCartAddPaymentActionImpl of(final MyCartAddPaymentAction template) {
      MyCartAddPaymentActionImpl instance = new MyCartAddPaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}
