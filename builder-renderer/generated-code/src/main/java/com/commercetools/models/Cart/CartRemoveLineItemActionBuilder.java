package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Common.Money;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.CartRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveLineItemActionBuilder {
   
   @Nullable
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetailsToRemove;
   
   @Nullable
   private com.commercetools.models.Common.Money externalPrice;
   
   public CartRemoveLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartRemoveLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartRemoveLineItemActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartRemoveLineItemActionBuilder shippingDetailsToRemove(@Nullable final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      return this;
   }
   
   public CartRemoveLineItemActionBuilder externalPrice(@Nullable final com.commercetools.models.Common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartRemoveLineItemAction build() {
       return new CartRemoveLineItemActionImpl(quantity, externalTotalPrice, lineItemId, shippingDetailsToRemove, externalPrice);
   }
   
   public static CartRemoveLineItemActionBuilder of() {
      return new CartRemoveLineItemActionBuilder();
   }
   
   public static CartRemoveLineItemActionBuilder of(final CartRemoveLineItemAction template) {
      CartRemoveLineItemActionBuilder builder = new CartRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}