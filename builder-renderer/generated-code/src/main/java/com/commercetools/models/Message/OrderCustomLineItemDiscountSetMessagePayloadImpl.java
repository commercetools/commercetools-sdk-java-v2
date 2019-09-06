package com.commercetools.models.Message;

import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Message.MessagePayload;
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
public final class OrderCustomLineItemDiscountSetMessagePayloadImpl implements OrderCustomLineItemDiscountSetMessagePayload {

   private java.lang.String type;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

   @JsonCreator
   OrderCustomLineItemDiscountSetMessagePayloadImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedItemPrice taxedPrice, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.customLineItemId = customLineItemId;
      this.taxedPrice = taxedPrice;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.type = "OrderCustomLineItemDiscountSet";
   }
   public OrderCustomLineItemDiscountSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }

}