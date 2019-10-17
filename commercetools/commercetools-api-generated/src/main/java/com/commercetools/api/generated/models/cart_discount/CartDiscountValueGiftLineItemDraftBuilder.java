package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.product.ProductReference;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueGiftLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueGiftLineItemDraftBuilder {
   
   
   private com.commercetools.api.generated.models.product.ProductReference product;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference supplyChannel;
   
   
   private Long variantId;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference distributionChannel;
   
   public CartDiscountValueGiftLineItemDraftBuilder product( final com.commercetools.api.generated.models.product.ProductReference product) {
      this.product = product;
      return this;
   }
   
   public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartDiscountValueGiftLineItemDraftBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductReference getProduct(){
      return this.product;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }

   public CartDiscountValueGiftLineItemDraft build() {
       return new CartDiscountValueGiftLineItemDraftImpl(product, supplyChannel, variantId, distributionChannel);
   }
   
   public static CartDiscountValueGiftLineItemDraftBuilder of() {
      return new CartDiscountValueGiftLineItemDraftBuilder();
   }
   
   public static CartDiscountValueGiftLineItemDraftBuilder of(final CartDiscountValueGiftLineItemDraft template) {
      CartDiscountValueGiftLineItemDraftBuilder builder = new CartDiscountValueGiftLineItemDraftBuilder();
      builder.product = template.getProduct();
      builder.supplyChannel = template.getSupplyChannel();
      builder.variantId = template.getVariantId();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}