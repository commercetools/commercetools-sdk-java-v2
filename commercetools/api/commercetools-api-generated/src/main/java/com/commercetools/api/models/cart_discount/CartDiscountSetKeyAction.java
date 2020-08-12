package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionImpl;

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
@JsonDeserialize(as = CartDiscountSetKeyActionImpl.class)
public interface CartDiscountSetKeyAction extends CartDiscountUpdateAction {

   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static CartDiscountSetKeyActionImpl of(){
      return new CartDiscountSetKeyActionImpl();
   }
   

   public static CartDiscountSetKeyActionImpl of(final CartDiscountSetKeyAction template) {
      CartDiscountSetKeyActionImpl instance = new CartDiscountSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}
