package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.CartDiscount.CartDiscountValue;
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
public final class CartDiscountChangeValueActionImpl implements CartDiscountChangeValueAction {

   private java.lang.String action;
   
   private com.commercetools.models.CartDiscount.CartDiscountValue value;

   @JsonCreator
   CartDiscountChangeValueActionImpl(@JsonProperty("value") final com.commercetools.models.CartDiscount.CartDiscountValue value) {
      this.value = value;
      this.action = "changeValue";
   }
   public CartDiscountChangeValueActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountValue getValue(){
      return this.value;
   }

   public void setValue(final com.commercetools.models.CartDiscount.CartDiscountValue value){
      this.value = value;
   }

}