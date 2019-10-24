package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomLineItemDiscountSetMessagePayloadBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(@Nullable final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
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