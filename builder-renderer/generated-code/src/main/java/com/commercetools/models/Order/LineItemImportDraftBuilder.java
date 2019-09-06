package com.commercetools.models.Order;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.ProductVariantImportDraft;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Order.LineItemImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemImportDraftBuilder {
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   @Nullable
   private java.lang.String productId;
   
   
   private com.commercetools.models.Common.PriceDraft price;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Order.ProductVariantImportDraft variant;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;
   
   public LineItemImportDraftBuilder taxRate(@Nullable final com.commercetools.models.TaxCategory.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public LineItemImportDraftBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemImportDraftBuilder shippingDetails(@Nullable final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public LineItemImportDraftBuilder productId(@Nullable final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public LineItemImportDraftBuilder price( final com.commercetools.models.Common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public LineItemImportDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public LineItemImportDraftBuilder variant( final com.commercetools.models.Order.ProductVariantImportDraft variant) {
      this.variant = variant;
      return this;
   }
   
   public LineItemImportDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public LineItemImportDraftBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public LineItemImportDraftBuilder state(@Nullable final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public LineItemImportDraftBuilder distributionChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   @Nullable
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.Common.PriceDraft getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getDistributionChannel(){
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