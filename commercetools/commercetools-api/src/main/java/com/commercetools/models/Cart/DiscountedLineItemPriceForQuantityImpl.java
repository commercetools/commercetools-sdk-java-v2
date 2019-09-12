package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPrice;
import java.lang.Integer;
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

   private java.lang.Integer quantity;
   
   private com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice;

   @JsonCreator
   DiscountedLineItemPriceForQuantityImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("discountedPrice") final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice) {
      this.quantity = quantity;
      this.discountedPrice = discountedPrice;
   }
   public DiscountedLineItemPriceForQuantityImpl() {
      
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setDiscountedPrice(final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice){
      this.discountedPrice = discountedPrice;
   }

}