package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderLineItemDiscountSetMessagePayloadBuilder {


   private com.commercetools.api.models.common.Money totalPrice;


   private String lineItemId;

   @Nullable
   private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;


   private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

   public OrderLineItemDiscountSetMessagePayloadBuilder totalPrice( final com.commercetools.api.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }

   public OrderLineItemDiscountSetMessagePayloadBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }

   public OrderLineItemDiscountSetMessagePayloadBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }

   public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }


   public com.commercetools.api.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }

   @Nullable
   public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }


   public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
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
