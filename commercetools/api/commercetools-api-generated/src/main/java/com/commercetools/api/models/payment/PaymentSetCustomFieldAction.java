package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.payment.PaymentSetCustomFieldActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomFieldActionImpl.class)
public interface PaymentSetCustomFieldAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static PaymentSetCustomFieldActionImpl of(){
      return new PaymentSetCustomFieldActionImpl();
   }
   

   public static PaymentSetCustomFieldActionImpl of(final PaymentSetCustomFieldAction template) {
      PaymentSetCustomFieldActionImpl instance = new PaymentSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}
