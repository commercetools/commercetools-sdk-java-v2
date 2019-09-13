package com.commercetools.models.message;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.OrderLineItemDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderLineItemDiscountSetMessagePayloadBuilder {
   
   
   private com.commercetools.models.common.Money totalPrice;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   public OrderLineItemDiscountSetMessagePayloadBuilder totalPrice( final com.commercetools.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderLineItemDiscountSetMessagePayloadBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderLineItemDiscountSetMessagePayloadBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }

   public OrderLineItemDiscountSetMessagePayload build() {
       return new OrderLineItemDiscountSetMessagePayloadImpl(totalPrice, lineItemId, taxedPrice, discountedPricePerQuantity);
   }
   
   public static OrderLineItemDiscountSetMessagePayloadBuilder of() {
      return new OrderLineItemDiscountSetMessagePayloadBuilder();
   }
   
   public static OrderLineItemDiscountSetMessagePayloadBuilder of(final OrderLineItemDiscountSetMessagePayload template) {
      OrderLineItemDiscountSetMessagePayloadBuilder builder = new OrderLineItemDiscountSetMessagePayloadBuilder();
      builder.totalPrice = template.getTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.taxedPrice = template.getTaxedPrice();
      builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
      return builder;
   }
   
}