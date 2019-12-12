package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomTypeActionImpl;

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
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

   /**
   *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
   */
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   /**
   *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
   *  Sets the custom fields to this value.</p>
   */
   @Valid
   @JsonProperty("fields")
   public JsonNode getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final JsonNode fields);
   
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