package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.cart_discount.CartDiscountSetCustomTypeActionImpl;

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
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public Object getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final Object fields);
   
   public static CartDiscountSetCustomTypeActionImpl of(){
      return new CartDiscountSetCustomTypeActionImpl();
   }
   

   public static CartDiscountSetCustomTypeActionImpl of(final CartDiscountSetCustomTypeAction template) {
      CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}