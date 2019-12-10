package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentSetCustomTypeActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomTypeActionImpl.class)
public interface PaymentSetCustomTypeAction extends PaymentUpdateAction {

   /**
   *  <p>If set, the custom type is set to this new value.
   *  If absent, the custom type and any existing custom fields are removed.</p>
   */
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   /**
   *  <p>Sets the custom fields to this value.</p>
   */
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static PaymentSetCustomTypeActionImpl of(){
      return new PaymentSetCustomTypeActionImpl();
   }
   

   public static PaymentSetCustomTypeActionImpl of(final PaymentSetCustomTypeAction template) {
      PaymentSetCustomTypeActionImpl instance = new PaymentSetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}