package com.commercetools.models.cart;

import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.TypedMoney;
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
public final class DiscountedLineItemPortionImpl implements DiscountedLineItemPortion {

   private com.commercetools.models.common.TypedMoney discountedAmount;
   
   private com.commercetools.models.cart_discount.CartDiscountReference discount;

   @JsonCreator
   DiscountedLineItemPortionImpl(@JsonProperty("discountedAmount") final com.commercetools.models.common.TypedMoney discountedAmount, @JsonProperty("discount") final com.commercetools.models.cart_discount.CartDiscountReference discount) {
      this.discountedAmount = discountedAmount;
      this.discount = discount;
   }
   public DiscountedLineItemPortionImpl() {
      
   }
   
   
   public com.commercetools.models.common.TypedMoney getDiscountedAmount(){
      return this.discountedAmount;
   }
   
   
   public com.commercetools.models.cart_discount.CartDiscountReference getDiscount(){
      return this.discount;
   }

   public void setDiscountedAmount(final com.commercetools.models.common.TypedMoney discountedAmount){
      this.discountedAmount = discountedAmount;
   }
   
   public void setDiscount(final com.commercetools.models.cart_discount.CartDiscountReference discount){
      this.discount = discount;
   }

}