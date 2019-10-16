package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPrice;
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
public final class DiscountedLineItemPriceForQuantityImpl implements DiscountedLineItemPriceForQuantity {

   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.DiscountedLineItemPrice discountedPrice;

   @JsonCreator
   DiscountedLineItemPriceForQuantityImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("discountedPrice") final com.commercetools.api.generated.models.cart.DiscountedLineItemPrice discountedPrice) {
      this.quantity = quantity;
      this.discountedPrice = discountedPrice;
   }
   public DiscountedLineItemPriceForQuantityImpl() {
      
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setDiscountedPrice(final com.commercetools.api.generated.models.cart.DiscountedLineItemPrice discountedPrice){
      this.discountedPrice = discountedPrice;
   }

}