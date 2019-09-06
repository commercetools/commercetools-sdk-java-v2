package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = CartSetLineItemCustomTypeActionImpl.class)
public interface CartSetLineItemCustomTypeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setLineItemId(final String lineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static CartSetLineItemCustomTypeActionImpl of(){
      return new CartSetLineItemCustomTypeActionImpl();
   }
   

   public static CartSetLineItemCustomTypeActionImpl of(final CartSetLineItemCustomTypeAction template) {
      CartSetLineItemCustomTypeActionImpl instance = new CartSetLineItemCustomTypeActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}