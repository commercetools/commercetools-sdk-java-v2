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
import com.commercetools.models.Cart.LineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private com.commercetools.models.Cart.LineItemPriceMode priceMode;
   
   
   private java.lang.String productId;
   
   
   private com.commercetools.models.Common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString productSlug;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetails shippingDetails;
   
   
   private com.commercetools.models.Common.Price price;
   
   
   private com.commercetools.models.Product.ProductVariant variant;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelReference supplyChannel;
   
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelReference distributionChannel;
   
   
   private com.commercetools.models.Cart.LineItemMode lineItemMode;
   
   
   private com.commercetools.models.ProductType.ProductTypeReference productType;
   
   public LineItemBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemBuilder priceMode( final com.commercetools.models.Cart.LineItemPriceMode priceMode) {
      this.priceMode = priceMode;
      return this;
   }
   
   public LineItemBuilder productId( final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public LineItemBuilder totalPrice( final com.commercetools.models.Common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public LineItemBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public LineItemBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public LineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   public LineItemBuilder productSlug(@Nullable final com.commercetools.models.Common.LocalizedString productSlug) {
      this.productSlug = productSlug;
      return this;
   }
   
   public LineItemBuilder taxRate(@Nullable final com.commercetools.models.TaxCategory.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public LineItemBuilder shippingDetails(@Nullable final com.commercetools.models.Cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public LineItemBuilder price( final com.commercetools.models.Common.Price price) {
      this.price = price;
      return this;
   }
   
   public LineItemBuilder variant( final com.commercetools.models.Product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   public LineItemBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public LineItemBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public LineItemBuilder state( final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public LineItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public LineItemBuilder distributionChannel(@Nullable final com.commercetools.models.Channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public LineItemBuilder lineItemMode( final com.commercetools.models.Cart.LineItemMode lineItemMode) {
      this.lineItemMode = lineItemMode;
      return this;
   }
   
   public LineItemBuilder productType( final com.commercetools.models.ProductType.ProductTypeReference productType) {
      this.productType = productType;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   @Nullable
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
   
   @Nullable
   public com.commercetools.models.Channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.models.Cart.LineItemMode getLineItemMode(){
      return this.lineItemMode;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeReference getProductType(){
      return this.productType;
   }

   public LineItem build() {
       return new LineItemImpl(quantity, priceMode, productId, totalPrice, taxedPrice, custom, discountedPricePerQuantity, productSlug, taxRate, shippingDetails, price, variant, name, supplyChannel, state, id, distributionChannel, lineItemMode, productType);
   }
   
   public static LineItemBuilder of() {
      return new LineItemBuilder();
   }
   
   public static LineItemBuilder of(final LineItem template) {
      LineItemBuilder builder = new LineItemBuilder();
      builder.quantity = template.getQuantity();
      builder.priceMode = template.getPriceMode();
      builder.productId = template.getProductId();
      builder.totalPrice = template.getTotalPrice();
      builder.taxedPrice = template.getTaxedPrice();
      builder.custom = template.getCustom();
      builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
      builder.productSlug = template.getProductSlug();
      builder.taxRate = template.getTaxRate();
      builder.shippingDetails = template.getShippingDetails();
      builder.price = template.getPrice();
      builder.variant = template.getVariant();
      builder.name = template.getName();
      builder.supplyChannel = template.getSupplyChannel();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.distributionChannel = template.getDistributionChannel();
      builder.lineItemMode = template.getLineItemMode();
      builder.productType = template.getProductType();
      return builder;
   }
   
}