package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.models.product_discount.ProductDiscountValueDraft;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountChangeValueActionImpl implements ProductDiscountChangeValueAction {

   private String action;
   
   private com.commercetools.models.product_discount.ProductDiscountValueDraft value;

   @JsonCreator
   ProductDiscountChangeValueActionImpl(@JsonProperty("value") final com.commercetools.models.product_discount.ProductDiscountValueDraft value) {
      this.value = value;
      this.action = "changeValue";
   }
   public ProductDiscountChangeValueActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.product_discount.ProductDiscountValueDraft getValue(){
      return this.value;
   }

   public void setValue(final com.commercetools.models.product_discount.ProductDiscountValueDraft value){
      this.value = value;
   }

}