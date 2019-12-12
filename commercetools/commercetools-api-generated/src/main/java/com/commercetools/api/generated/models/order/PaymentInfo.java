package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.payment.PaymentReference;
import com.commercetools.api.generated.models.order.PaymentInfoImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = PaymentInfoImpl.class)
public interface PaymentInfo  {

   
   @NotNull
   @Valid
   @JsonProperty("payments")
   public List<PaymentReference> getPayments();

   public void setPayments(final List<PaymentReference> payments);
   
   public static PaymentInfoImpl of(){
      return new PaymentInfoImpl();
   }
   

   public static PaymentInfoImpl of(final PaymentInfo template) {
      PaymentInfoImpl instance = new PaymentInfoImpl();
      instance.setPayments(template.getPayments());
      return instance;
   }

}