package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.Money;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.cart.CartAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddLineItemActionBuilder {
   
   @Nullable
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   @Nullable
   private java.lang.String productId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   @Nullable
   private com.commercetools.models.common.Money externalPrice;
   
   public CartAddLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartAddLineItemActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CartAddLineItemActionBuilder productId(@Nullable final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartAddLineItemActionBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CartAddLineItemActionBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartAddLineItemActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public CartAddLineItemActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public CartAddLineItemActionBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   @Nullable
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartAddLineItemAction build() {
       return new CartAddLineItemActionImpl(quantity, externalTaxRate, shippingDetails, productId, externalTotalPrice, custom, supplyChannel, variantId, sku, distributionChannel, externalPrice);
   }
   
   public static CartAddLineItemActionBuilder of() {
      return new CartAddLineItemActionBuilder();
   }
   
   public static CartAddLineItemActionBuilder of(final CartAddLineItemAction template) {
      CartAddLineItemActionBuilder builder = new CartAddLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingDetails = template.getShippingDetails();
      builder.productId = template.getProductId();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.custom = template.getCustom();
      builder.supplyChannel = template.getSupplyChannel();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.distributionChannel = template.getDistributionChannel();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}