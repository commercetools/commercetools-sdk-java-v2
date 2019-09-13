package com.commercetools.models.message;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.message.MessagePayload;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderLineItemDiscountSetMessagePayloadImpl implements OrderLineItemDiscountSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.common.Money totalPrice;
   
   private java.lang.String lineItemId;
   
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

   @JsonCreator
   OrderLineItemDiscountSetMessagePayloadImpl(@JsonProperty("totalPrice") final com.commercetools.models.common.Money totalPrice, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.totalPrice = totalPrice;
      this.lineItemId = lineItemId;
      this.taxedPrice = taxedPrice;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.type = "OrderLineItemDiscountSet";
   }
   public OrderLineItemDiscountSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }

   public void setTotalPrice(final com.commercetools.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }

}