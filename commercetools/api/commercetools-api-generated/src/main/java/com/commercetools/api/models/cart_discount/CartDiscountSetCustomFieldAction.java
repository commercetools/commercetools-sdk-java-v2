package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionImpl;

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
@JsonDeserialize(as = CartDiscountSetCustomFieldActionImpl.class)
public interface CartDiscountSetCustomFieldAction extends CartDiscountUpdateAction {


   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
   *  If <code>value</code> is provided, set the <code>value</code> of the field defined by the <code>name</code>.
   *  The FieldDefinition determines the format for the <code>value</code> to be provided.</p>
   */

   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);

   public void setValue(final JsonNode value);

   public static CartDiscountSetCustomFieldActionImpl of(){
      return new CartDiscountSetCustomFieldActionImpl();
   }


   public static CartDiscountSetCustomFieldActionImpl of(final CartDiscountSetCustomFieldAction template) {
      CartDiscountSetCustomFieldActionImpl instance = new CartDiscountSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}
