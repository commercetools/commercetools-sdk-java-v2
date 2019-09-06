package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.CartDiscount.CartDiscountSetValidFromAndUntilActionImpl;

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
@JsonDeserialize(as = CartDiscountSetValidFromAndUntilActionImpl.class)
public interface CartDiscountSetValidFromAndUntilAction extends CartDiscountUpdateAction {

   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static CartDiscountSetValidFromAndUntilActionImpl of(){
      return new CartDiscountSetValidFromAndUntilActionImpl();
   }
   

   public static CartDiscountSetValidFromAndUntilActionImpl of(final CartDiscountSetValidFromAndUntilAction template) {
      CartDiscountSetValidFromAndUntilActionImpl instance = new CartDiscountSetValidFromAndUntilActionImpl();
      instance.setValidUntil(template.getValidUntil());
      instance.setValidFrom(template.getValidFrom());
      return instance;
   }

}