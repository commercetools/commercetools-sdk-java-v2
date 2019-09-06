package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetExternalIdActionImpl;

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
@JsonDeserialize(as = PaymentSetExternalIdActionImpl.class)
public interface PaymentSetExternalIdAction extends PaymentUpdateAction {

   
   
   @JsonProperty("externalId")
   public String getExternalId();

   public void setExternalId(final String externalId);
   
   public static PaymentSetExternalIdActionImpl of(){
      return new PaymentSetExternalIdActionImpl();
   }
   

   public static PaymentSetExternalIdActionImpl of(final PaymentSetExternalIdAction template) {
      PaymentSetExternalIdActionImpl instance = new PaymentSetExternalIdActionImpl();
      instance.setExternalId(template.getExternalId());
      return instance;
   }

}