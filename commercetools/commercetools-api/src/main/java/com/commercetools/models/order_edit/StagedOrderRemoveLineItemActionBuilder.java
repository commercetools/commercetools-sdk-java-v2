package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveLineItemActionBuilder {
   
   @Nullable
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;
   
   @Nullable
   private com.commercetools.models.common.Money externalPrice;
   
   public StagedOrderRemoveLineItemActionBuilder quantity(@Nullable final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderRemoveLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderRemoveLineItemActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderRemoveLineItemActionBuilder shippingDetailsToRemove(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      return this;
   }
   
   public StagedOrderRemoveLineItemActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public StagedOrderRemoveLineItemAction build() {
       return new StagedOrderRemoveLineItemActionImpl(quantity, externalTotalPrice, lineItemId, shippingDetailsToRemove, externalPrice);
   }
   
   public static StagedOrderRemoveLineItemActionBuilder of() {
      return new StagedOrderRemoveLineItemActionBuilder();
   }
   
   public static StagedOrderRemoveLineItemActionBuilder of(final StagedOrderRemoveLineItemAction template) {
      StagedOrderRemoveLineItemActionBuilder builder = new StagedOrderRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}