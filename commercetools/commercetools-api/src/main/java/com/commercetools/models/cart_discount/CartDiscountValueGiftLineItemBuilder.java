package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountValue;
import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.product.ProductReference;
import com.commercetools.models.cart_discount.CartDiscountValueGiftLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueGiftLineItemBuilder {
   
   
   private com.commercetools.models.product.ProductReference product;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference supplyChannel;
   
   
   private Long variantId;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference distributionChannel;
   
   public CartDiscountValueGiftLineItemBuilder product( final com.commercetools.models.product.ProductReference product) {
      this.product = product;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public CartDiscountValueGiftLineItemBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public com.commercetools.models.product.ProductReference getProduct(){
      return this.product;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getDistributionChannel(){
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