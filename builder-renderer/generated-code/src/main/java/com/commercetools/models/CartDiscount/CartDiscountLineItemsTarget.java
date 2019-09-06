package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountLineItemsTargetImpl;

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
@JsonDeserialize(as = CartDiscountLineItemsTargetImpl.class)
public interface CartDiscountLineItemsTarget extends CartDiscountTarget {

   
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();

   public void setPredicate(final String predicate);
   
   public static CartDiscountLineItemsTargetImpl of(){
      return new CartDiscountLineItemsTargetImpl();
   }
   

   public static CartDiscountLineItemsTargetImpl of(final CartDiscountLineItemsTarget template) {
      CartDiscountLineItemsTargetImpl instance = new CartDiscountLineItemsTargetImpl();
      instance.setPredicate(template.getPredicate());
      return instance;
   }

}