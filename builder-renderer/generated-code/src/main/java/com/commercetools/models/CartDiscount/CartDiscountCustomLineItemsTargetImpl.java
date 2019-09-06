package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountCustomLineItemsTargetImpl implements CartDiscountCustomLineItemsTarget {

   private java.lang.String type;
   
   private java.lang.String predicate;

   @JsonCreator
   CartDiscountCustomLineItemsTargetImpl(@JsonProperty("predicate") final java.lang.String predicate) {
      this.predicate = predicate;
      this.type = "customLineItems";
   }
   public CartDiscountCustomLineItemsTargetImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }

}