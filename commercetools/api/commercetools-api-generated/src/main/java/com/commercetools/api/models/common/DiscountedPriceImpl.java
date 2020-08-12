package com.commercetools.api.models.common;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountedPriceImpl implements DiscountedPrice {

   private com.commercetools.api.models.common.Money value;
   
   private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

   @JsonCreator
   DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value, @JsonProperty("discount") final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
      this.value = value;
      this.discount = discount;
   }
   public DiscountedPriceImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.Money getValue(){
      return this.value;
   }
   
   
   public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount(){
      return this.discount;
   }

   public void setValue(final com.commercetools.api.models.common.Money value){
      this.value = value;
   }
   
   public void setDiscount(final com.commercetools.api.models.product_discount.ProductDiscountReference discount){
      this.discount = discount;
   }

}
