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
import com.commercetools.api.generated.models.cart.LineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemBuilder {
   
   
   private Long quantity;
   
   
   private com.commercetools.api.generated.models.cart.LineItemPriceMode priceMode;
   
   
   private String productId;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString productSlug;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxRate taxRate;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails;
   
   
   private com.commercetools.api.generated.models.common.Price price;
   
   
   private com.commercetools.api.generated.models.product.ProductVariant variant;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference supplyChannel;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference distributionChannel;
   
   
   private com.commercetools.api.generated.models.cart.LineItemMode lineItemMode;
   
   
   private com.commercetools.api.generated.models.product_type.ProductTypeReference productType;
   
   public LineItemBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemBuilder priceMode( final com.commercetools.api.generated.models.cart.LineItemPriceMode priceMode) {
      this.priceMode = priceMode;
      return this;
   }
   
   public LineItemBuilder productId( final String productId) {
      this.productId = productId;
      return this;
   }
   
   public LineItemBuilder totalPrice( final com.commercetools.api.generated.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public LineItemBuilder taxedPrice(@Nullable final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public LineItemBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public LineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   public LineItemBuilder productSlug(@Nullable final com.commercetools.api.generated.models.common.LocalizedString productSlug) {
      this.productSlug = productSlug;
      return this;
   }
   
   public LineItemBuilder taxRate(@Nullable final com.commercetools.api.generated.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public LineItemBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public LineItemBuilder price( final com.commercetools.api.generated.models.common.Price price) {
      this.price = price;
      return this;
   }
   
   public LineItemBuilder variant( final com.commercetools.api.generated.models.product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   public LineItemBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public LineItemBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public LineItemBuilder state( final java.util.List<com.commercetools.api.generated.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public LineItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public LineItemBuilder distributionChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public LineItemBuilder lineItemMode( final com.commercetools.api.generated.models.cart.LineItemMode lineItemMode) {
      this.lineItemMode = lineItemMode;
      return this;
   }
   
   public LineItemBuilder productType( final com.commercetools.api.generated.models.product_type.ProductTypeReference productType) {
      this.productType = productType;
      return this;
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
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   @Nullable
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
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.api.generated.models.cart.LineItemMode getLineItemMode(){
      return this.lineItemMode;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeReference getProductType(){
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