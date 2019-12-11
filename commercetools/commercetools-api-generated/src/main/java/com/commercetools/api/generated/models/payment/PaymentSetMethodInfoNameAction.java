package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoNameActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoNameActionImpl.class)
public interface PaymentSetMethodInfoNameAction extends PaymentUpdateAction {

   /**
   *  <p>If not provided, the name is unset.</p>
   */
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