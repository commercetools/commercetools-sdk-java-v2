package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.ShippingMethodState;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.Delivery;
import com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import io.vrap.rmf.base.client.utils.Generated;
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

   private com.commercetools.api.generated.models.tax_category.TaxRate taxRate;
   
   private com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate;
   
   private com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft discountedPrice;
   
   private com.commercetools.api.generated.models.cart.ShippingMethodState shippingMethodState;
   
   private com.commercetools.api.generated.models.common.Money price;
   
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   private String shippingMethodName;
   
   private java.util.List<com.commercetools.api.generated.models.order.Delivery> deliveries;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   ShippingInfoImportDraftImpl(@JsonProperty("taxRate") final com.commercetools.api.generated.models.tax_category.TaxRate taxRate, @JsonProperty("shippingRate") final com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("discountedPrice") final com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.api.generated.models.cart.ShippingMethodState shippingMethodState, @JsonProperty("price") final com.commercetools.api.generated.models.common.Money price, @JsonProperty("shippingMethod") final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("deliveries") final java.util.List<com.commercetools.api.generated.models.order.Delivery> deliveries, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
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
   
   /**
   	
   */
   public com.commercetools.api.generated.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   /**
   	<p>The shipping rate used to determine the price.</p>
   */
   public com.commercetools.api.generated.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   /**
   	<p>Indicates whether the ShippingMethod referenced is allowed for the cart or not.</p>
   */
   public com.commercetools.api.generated.models.cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.Money getPrice(){
      return this.price;
   }
   
   /**
   	<p>Not set if custom shipping method is used.</p>
   */
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   /**
   	
   */
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   /**
   	<p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.api.generated.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingRate(final com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setDiscountedPrice(final com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft discountedPrice){
      this.discountedPrice = discountedPrice;
   }
   
   public void setShippingMethodState(final com.commercetools.api.generated.models.cart.ShippingMethodState shippingMethodState){
      this.shippingMethodState = shippingMethodState;
   }
   
   public void setPrice(final com.commercetools.api.generated.models.common.Money price){
      this.price = price;
   }
   
   public void setShippingMethod(final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setShippingMethodName(final String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setDeliveries(final java.util.List<com.commercetools.api.generated.models.order.Delivery> deliveries){
      this.deliveries = deliveries;
   }
   
   public void setTaxCategory(final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}