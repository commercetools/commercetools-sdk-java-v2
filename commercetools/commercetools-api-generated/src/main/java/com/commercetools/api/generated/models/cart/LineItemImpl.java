package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.ItemShippingDetails;
import com.commercetools.api.generated.models.cart.LineItemMode;
import com.commercetools.api.generated.models.cart.LineItemPriceMode;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Price;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import com.commercetools.api.generated.models.type.CustomFields;
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
public final class LineItemImpl implements LineItem {

   private Long quantity;
   
   private com.commercetools.api.generated.models.cart.LineItemPriceMode priceMode;
   
   private String productId;
   
   private com.commercetools.api.generated.models.common.TypedMoney totalPrice;
   
   private com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private com.commercetools.api.generated.models.common.LocalizedString productSlug;
   
   private com.commercetools.api.generated.models.tax_category.TaxRate taxRate;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails;
   
   private com.commercetools.api.generated.models.common.Price price;
   
   private com.commercetools.api.generated.models.product.ProductVariant variant;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.channel.ChannelReference supplyChannel;
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   private String id;
   
   private com.commercetools.api.generated.models.channel.ChannelReference distributionChannel;
   
   private com.commercetools.api.generated.models.cart.LineItemMode lineItemMode;
   
   private com.commercetools.api.generated.models.product_type.ProductTypeReference productType;

   @JsonCreator
   LineItemImpl(@JsonProperty("quantity") final Long quantity, @JsonProperty("priceMode") final com.commercetools.api.generated.models.cart.LineItemPriceMode priceMode, @JsonProperty("productId") final String productId, @JsonProperty("totalPrice") final com.commercetools.api.generated.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("productSlug") final com.commercetools.api.generated.models.common.LocalizedString productSlug, @JsonProperty("taxRate") final com.commercetools.api.generated.models.tax_category.TaxRate taxRate, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails, @JsonProperty("price") final com.commercetools.api.generated.models.common.Price price, @JsonProperty("variant") final com.commercetools.api.generated.models.product.ProductVariant variant, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("supplyChannel") final com.commercetools.api.generated.models.channel.ChannelReference supplyChannel, @JsonProperty("state") final java.util.List<com.commercetools.api.generated.models.order.ItemState> state, @JsonProperty("id") final String id, @JsonProperty("distributionChannel") final com.commercetools.api.generated.models.channel.ChannelReference distributionChannel, @JsonProperty("lineItemMode") final com.commercetools.api.generated.models.cart.LineItemMode lineItemMode, @JsonProperty("productType") final com.commercetools.api.generated.models.product_type.ProductTypeReference productType) {
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
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.cart.LineItemPriceMode getPriceMode(){
      return this.priceMode;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.api.generated.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.api.generated.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.api.generated.models.cart.LineItemMode getLineItemMode(){
      return this.lineItemMode;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setPriceMode(final com.commercetools.api.generated.models.cart.LineItemPriceMode priceMode){
      this.priceMode = priceMode;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setTotalPrice(final com.commercetools.api.generated.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setProductSlug(final com.commercetools.api.generated.models.common.LocalizedString productSlug){
      this.productSlug = productSlug;
   }
   
   public void setTaxRate(final com.commercetools.api.generated.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setPrice(final com.commercetools.api.generated.models.common.Price price){
      this.price = price;
   }
   
   public void setVariant(final com.commercetools.api.generated.models.product.ProductVariant variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSupplyChannel(final com.commercetools.api.generated.models.channel.ChannelReference supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setState(final java.util.List<com.commercetools.api.generated.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setDistributionChannel(final com.commercetools.api.generated.models.channel.ChannelReference distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setLineItemMode(final com.commercetools.api.generated.models.cart.LineItemMode lineItemMode){
      this.lineItemMode = lineItemMode;
   }
   
   public void setProductType(final com.commercetools.api.generated.models.product_type.ProductTypeReference productType){
      this.productType = productType;
   }

}