package com.commercetools.models.order;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.ProductVariantImportDraft;
import com.commercetools.models.tax_category.TaxRate;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order.LineItemImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemImportDraftBuilder {
   
   @Nullable
   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   @Nullable
   private java.lang.String productId;
   
   
   private com.commercetools.models.common.PriceDraft price;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.order.ProductVariantImportDraft variant;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   public LineItemImportDraftBuilder taxRate(@Nullable final com.commercetools.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public LineItemImportDraftBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemImportDraftBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public LineItemImportDraftBuilder productId(@Nullable final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public LineItemImportDraftBuilder price( final com.commercetools.models.common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public LineItemImportDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public LineItemImportDraftBuilder variant( final com.commercetools.models.order.ProductVariantImportDraft variant) {
      this.variant = variant;
      return this;
   }
   
   public LineItemImportDraftBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public LineItemImportDraftBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public LineItemImportDraftBuilder state(@Nullable final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public LineItemImportDraftBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   @Nullable
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public LineItemImportDraft build() {
       return new LineItemImportDraftImpl(taxRate, quantity, shippingDetails, productId, price, custom, variant, name, supplyChannel, state, distributionChannel);
   }
   
   public static LineItemImportDraftBuilder of() {
      return new LineItemImportDraftBuilder();
   }
   
   public static LineItemImportDraftBuilder of(final LineItemImportDraft template) {
      LineItemImportDraftBuilder builder = new LineItemImportDraftBuilder();
      builder.taxRate = template.getTaxRate();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.productId = template.getProductId();
      builder.price = template.getPrice();
      builder.custom = template.getCustom();
      builder.variant = template.getVariant();
      builder.name = template.getName();
      builder.supplyChannel = template.getSupplyChannel();
      builder.state = template.getState();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}