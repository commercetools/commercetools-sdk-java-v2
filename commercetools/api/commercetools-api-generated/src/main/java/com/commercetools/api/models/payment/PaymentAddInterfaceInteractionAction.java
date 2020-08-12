package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionImpl;

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
@JsonDeserialize(as = PaymentAddInterfaceInteractionActionImpl.class)
public interface PaymentAddInterfaceInteractionAction extends PaymentUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static PaymentAddInterfaceInteractionActionImpl of(){
      return new PaymentAddInterfaceInteractionActionImpl();
   }
   

   public static PaymentAddInterfaceInteractionActionImpl of(final PaymentAddInterfaceInteractionAction template) {
      PaymentAddInterfaceInteractionActionImpl instance = new PaymentAddInterfaceInteractionActionImpl();
      instance.setType(template.getType());
      instance.setFields(template.getFields());
      return instance;
   }

}
