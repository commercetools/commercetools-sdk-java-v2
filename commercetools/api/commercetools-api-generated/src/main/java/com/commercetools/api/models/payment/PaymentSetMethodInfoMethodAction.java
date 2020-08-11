package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoMethodActionImpl.class)
public interface PaymentSetMethodInfoMethodAction extends PaymentUpdateAction {

   /**
   *  <p>If not provided, the method is unset.</p>
   */

   @JsonProperty("method")
   public String getMethod();

   public void setMethod(final String method);

   public static PaymentSetMethodInfoMethodActionImpl of(){
      return new PaymentSetMethodInfoMethodActionImpl();
   }


   public static PaymentSetMethodInfoMethodActionImpl of(final PaymentSetMethodInfoMethodAction template) {
      PaymentSetMethodInfoMethodActionImpl instance = new PaymentSetMethodInfoMethodActionImpl();
      instance.setMethod(template.getMethod());
      return instance;
   }

}
