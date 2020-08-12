package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.message.MessagePayload;
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
public final class OrderCustomLineItemDiscountSetMessagePayloadImpl implements OrderCustomLineItemDiscountSetMessagePayload {

   private String type;
   
   private String customLineItemId;
   
   private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

   @JsonCreator
   OrderCustomLineItemDiscountSetMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
      this.customLineItemId = customLineItemId;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.taxedPrice = taxedPrice;
      this.type = "OrderCustomLineItemDiscountSet";
   }
   public OrderCustomLineItemDiscountSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }

}
