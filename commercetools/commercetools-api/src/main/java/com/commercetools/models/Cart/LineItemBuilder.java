package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.ItemShippingDetails;
import com.commercetools.models.cart.LineItemMode;
import com.commercetools.models.cart.LineItemPriceMode;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.Money;
import com.commercetools.models.common.Price;
import com.commercetools.models.order.ItemState;
import com.commercetools.models.product.ProductVariant;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.tax_category.TaxRate;
import com.commercetools.models.type.CustomFields;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.cart.LineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private com.commercetools.models.cart.LineItemPriceMode priceMode;
   
   
   private java.lang.String productId;
   
   
   private com.commercetools.models.common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString productSlug;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetails shippingDetails;
   
   
   private com.commercetools.models.common.Price price;
   
   
   private com.commercetools.models.product.ProductVariant variant;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference supplyChannel;
   
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference distributionChannel;
   
   
   private com.commercetools.models.cart.LineItemMode lineItemMode;
   
   
   private com.commercetools.models.product_type.ProductTypeReference productType;
   
   public LineItemBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemBuilder priceMode( final com.commercetools.models.cart.LineItemPriceMode priceMode) {
      this.priceMode = priceMode;
      return this;
   }
   
   public LineItemBuilder productId( final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public LineItemBuilder totalPrice( final com.commercetools.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public LineItemBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public LineItemBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public LineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   public LineItemBuilder productSlug(@Nullable final com.commercetools.models.common.LocalizedString productSlug) {
      this.productSlug = productSlug;
      return this;
   }
   
   public LineItemBuilder taxRate(@Nullable final com.commercetools.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public LineItemBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public LineItemBuilder price( final com.commercetools.models.common.Price price) {
      this.price = price;
      return this;
   }
   
   public LineItemBuilder variant( final com.commercetools.models.product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   public LineItemBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public LineItemBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public LineItemBuilder state( final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public LineItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public LineItemBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public LineItemBuilder lineItemMode( final com.commercetools.models.cart.LineItemMode lineItemMode) {
      this.lineItemMode = lineItemMode;
      return this;
   }
   
   public LineItemBuilder productType( final com.commercetools.models.product_type.ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.LineItemPriceMode getPriceMode(){
      return this.priceMode;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.models.cart.LineItemMode getLineItemMode(){
      return this.lineItemMode;
   }
   
   
   public com.commercetools.models.product_type.ProductTypeReference getProductType(){
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