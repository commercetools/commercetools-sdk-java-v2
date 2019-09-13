package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetCustomTypeActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomTypeActionImpl.class)
public interface PaymentSetCustomTypeAction extends PaymentUpdateAction {

   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
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