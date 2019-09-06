package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Product.ProductReference;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountValueGiftLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueGiftLineItemBuilder {
   
   
   private com.commercetools.models.Product.ProductReference product;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelReference supplyChannel;
   
   
   private java.lang.Long variantId;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelReference distributionChannel;
   
   public CartDiscountValueGiftLineItemBuilder product( final com.commercetools.models.Product.ProductReference product) {
      this.product = product;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder distributionChannel(@Nullable final com.commercetools.models.Channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public com.commercetools.models.Product.ProductReference getProduct(){
      return this.product;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }

   public CartDiscountValueGiftLineItem build() {
       return new CartDiscountValueGiftLineItemImpl(product, supplyChannel, variantId, distributionChannel);
   }
   
   public static CartDiscountValueGiftLineItemBuilder of() {
      return new CartDiscountValueGiftLineItemBuilder();
   }
   
   public static CartDiscountValueGiftLineItemBuilder of(final CartDiscountValueGiftLineItem template) {
      CartDiscountValueGiftLineItemBuilder builder = new CartDiscountValueGiftLineItemBuilder();
      builder.product = template.getProduct();
      builder.supplyChannel = template.getSupplyChannel();
      builder.variantId = template.getVariantId();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}