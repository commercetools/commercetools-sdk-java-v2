package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.Cart.ItemShippingDetails;
import com.commercetools.models.Cart.LineItemMode;
import com.commercetools.models.Cart.LineItemPriceMode;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.Price;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Product.ProductVariant;
import com.commercetools.models.ProductType.ProductTypeReference;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
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
public final class LineItemImpl implements LineItem {

   private java.lang.Long quantity;
   
   private com.commercetools.models.Cart.LineItemPriceMode priceMode;
   
   private java.lang.String productId;
   
   private com.commercetools.models.Common.Money totalPrice;
   
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private com.commercetools.models.Common.LocalizedString productSlug;
   
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   private com.commercetools.models.Cart.ItemShippingDetails shippingDetails;
   
   private com.commercetools.models.Common.Price price;
   
   private com.commercetools.models.Product.ProductVariant variant;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Channel.ChannelReference supplyChannel;
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   private java.lang.String id;
   
   private com.commercetools.models.Channel.ChannelReference distributionChannel;
   
   private com.commercetools.models.Cart.LineItemMode lineItemMode;
   
   private com.commercetools.models.ProductType.ProductTypeReference productType;

   @JsonCreator
   LineItemImpl(@JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("priceMode") final com.commercetools.models.Cart.LineItemPriceMode priceMode, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("totalPrice") final com.commercetools.models.Common.Money totalPrice, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedItemPrice taxedPrice, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("productSlug") final com.commercetools.models.Common.LocalizedString productSlug, @JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRate taxRate, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetails shippingDetails, @JsonProperty("price") final com.commercetools.models.Common.Price price, @JsonProperty("variant") final com.commercetools.models.Product.ProductVariant variant, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelReference supplyChannel, @JsonProperty("state") final java.util.List<com.commercetools.models.Order.ItemState> state, @JsonProperty("id") final java.lang.String id, @JsonProperty("distributionChannel") final com.commercetools.models.Channel.ChannelReference distributionChannel, @JsonProperty("lineItemMode") final com.commercetools.models.Cart.LineItemMode lineItemMode, @JsonProperty("productType") final com.commercetools.models.ProductType.ProductTypeReference productType) {
      this.quantity = quantity;
      this.priceMode = priceMode;
      this.productId = productId;
      this.totalPrice = totalPrice;
      this.taxedPrice = taxedPrice;
      this.custom = custom;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.productSlug = productSlug;
      this.taxRate = taxRate;
      this.shippingDetails = shippingDetails;
      this.price = price;
      this.variant = variant;
      this.name = name;
      this.supplyChannel = supplyChannel;
      this.state = state;
      this.id = id;
      this.distributionChannel = distributionChannel;
      this.lineItemMode = lineItemMode;
      this.productType = productType;
   }
   public LineItemImpl() {
      
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.LineItemPriceMode getPriceMode(){
      return this.priceMode;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.Common.Price getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.Product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.models.Cart.LineItemMode getLineItemMode(){
      return this.lineItemMode;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeReference getProductType(){
      return this.productType;
   }

   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setPriceMode(final com.commercetools.models.Cart.LineItemPriceMode priceMode){
      this.priceMode = priceMode;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setTotalPrice(final com.commercetools.models.Common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setProductSlug(final com.commercetools.models.Common.LocalizedString productSlug){
      this.productSlug = productSlug;
   }
   
   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setPrice(final com.commercetools.models.Common.Price price){
      this.price = price;
   }
   
   public void setVariant(final com.commercetools.models.Product.ProductVariant variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelReference supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setState(final java.util.List<com.commercetools.models.Order.ItemState> state){
      this.state = state;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setDistributionChannel(final com.commercetools.models.Channel.ChannelReference distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setLineItemMode(final com.commercetools.models.Cart.LineItemMode lineItemMode){
      this.lineItemMode = lineItemMode;
   }
   
   public void setProductType(final com.commercetools.models.ProductType.ProductTypeReference productType){
      this.productType = productType;
   }

}