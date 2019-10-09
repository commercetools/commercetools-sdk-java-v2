package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.cart.CartSetCustomLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = CartSetCustomLineItemCustomTypeActionImpl.class)
public interface CartSetCustomLineItemCustomTypeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static CartSetCustomLineItemCustomTypeActionImpl of(){
      return new CartSetCustomLineItemCustomTypeActionImpl();
   }
   

   public static CartSetCustomLineItemCustomTypeActionImpl of(final CartSetCustomLineItemCustomTypeAction template) {
      CartSetCustomLineItemCustomTypeActionImpl instance = new CartSetCustomLineItemCustomTypeActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}