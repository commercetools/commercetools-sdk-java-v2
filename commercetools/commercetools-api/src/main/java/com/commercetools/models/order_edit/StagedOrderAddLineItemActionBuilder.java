package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddLineItemActionBuilder {
   
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
   
   public StagedOrderAddLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder productId(@Nullable final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public StagedOrderAddLineItemActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
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

   public StagedOrderAddLineItemAction build() {
       return new StagedOrderAddLineItemActionImpl(quantity, externalTaxRate, shippingDetails, productId, externalTotalPrice, custom, supplyChannel, variantId, sku, distributionChannel, externalPrice);
   }
   
   public static StagedOrderAddLineItemActionBuilder of() {
      return new StagedOrderAddLineItemActionBuilder();
   }
   
   public static StagedOrderAddLineItemActionBuilder of(final StagedOrderAddLineItemAction template) {
      StagedOrderAddLineItemActionBuilder builder = new StagedOrderAddLineItemActionBuilder();
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