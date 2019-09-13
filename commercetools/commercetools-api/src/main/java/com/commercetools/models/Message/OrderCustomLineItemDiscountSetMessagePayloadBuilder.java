package com.commercetools.models.message;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCustomLineItemDiscountSetMessagePayloadBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }

   public OrderCustomLineItemDiscountSetMessagePayload build() {
       return new OrderCustomLineItemDiscountSetMessagePayloadImpl(customLineItemId, taxedPrice, discountedPricePerQuantity);
   }
   
   public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of() {
      return new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
   }
   
   public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of(final OrderCustomLineItemDiscountSetMessagePayload template) {
      OrderCustomLineItemDiscountSetMessagePayloadBuilder builder = new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.taxedPrice = template.getTaxedPrice();
      builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
      return builder;
   }
   
}