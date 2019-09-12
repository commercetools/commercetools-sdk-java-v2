package com.commercetools.models.Order;

import com.commercetools.models.Cart.ShippingMethodState;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.Order.DiscountedLineItemPriceDraft;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxRate;
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
public final class ShippingInfoImportDraftImpl implements ShippingInfoImportDraft {

   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   private com.commercetools.models.Order.DiscountedLineItemPriceDraft discountedPrice;
   
   private com.commercetools.models.Cart.ShippingMethodState shippingMethodState;
   
   private com.commercetools.models.Common.Money price;
   
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   private java.lang.String shippingMethodName;
   
   private java.util.List<com.commercetools.models.Order.Delivery> deliveries;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   ShippingInfoImportDraftImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRate taxRate, @JsonProperty("shippingRate") final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate, @JsonProperty("discountedPrice") final com.commercetools.models.Order.DiscountedLineItemPriceDraft discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.models.Cart.ShippingMethodState shippingMethodState, @JsonProperty("price") final com.commercetools.models.Common.Money price, @JsonProperty("shippingMethod") final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("shippingMethodName") final java.lang.String shippingMethodName, @JsonProperty("deliveries") final java.util.List<com.commercetools.models.Order.Delivery> deliveries, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxRate = taxRate;
      this.shippingRate = shippingRate;
      this.discountedPrice = discountedPrice;
      this.shippingMethodState = shippingMethodState;
      this.price = price;
      this.shippingMethod = shippingMethod;
      this.shippingMethodName = shippingMethodName;
      this.deliveries = deliveries;
      this.taxCategory = taxCategory;
   }
   public ShippingInfoImportDraftImpl() {
      
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Order.DiscountedLineItemPriceDraft getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   
   public com.commercetools.models.Cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public java.util.List<com.commercetools.models.Order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingRate(final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setDiscountedPrice(final com.commercetools.models.Order.DiscountedLineItemPriceDraft discountedPrice){
      this.discountedPrice = discountedPrice;
   }
   
   public void setShippingMethodState(final com.commercetools.models.Cart.ShippingMethodState shippingMethodState){
      this.shippingMethodState = shippingMethodState;
   }
   
   public void setPrice(final com.commercetools.models.Common.Money price){
      this.price = price;
   }
   
   public void setShippingMethod(final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setShippingMethodName(final java.lang.String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setDeliveries(final java.util.List<com.commercetools.models.Order.Delivery> deliveries){
      this.deliveries = deliveries;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}