package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.product_discount.ProductDiscountReference;
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
public final class DiscountedPriceImpl implements DiscountedPrice {

   private com.commercetools.api.generated.models.product_discount.ProductDiscountReference discount;
   
   private com.commercetools.api.generated.models.common.Money value;

   @JsonCreator
   DiscountedPriceImpl(@JsonProperty("discount") final com.commercetools.api.generated.models.product_discount.ProductDiscountReference discount, @JsonProperty("value") final com.commercetools.api.generated.models.common.Money value) {
      this.discount = discount;
      this.value = value;
   }
   public DiscountedPriceImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.product_discount.ProductDiscountReference getDiscount(){
      return this.discount;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
      return this.value;
   }

   public void setDiscount(final com.commercetools.api.generated.models.product_discount.ProductDiscountReference discount){
      this.discount = discount;
   }
   
   public void setValue(final com.commercetools.api.generated.models.common.Money value){
      this.value = value;
   }

}