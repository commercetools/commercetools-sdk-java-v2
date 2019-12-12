package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountLineItemsTargetImpl implements CartDiscountLineItemsTarget {

   private String type;
   
   private String predicate;

   @JsonCreator
   CartDiscountLineItemsTargetImpl(@JsonProperty("predicate") final String predicate) {
      this.predicate = predicate;
      this.type = "lineItems";
   }
   public CartDiscountLineItemsTargetImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getPredicate(){
      return this.predicate;
   }

   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }

}