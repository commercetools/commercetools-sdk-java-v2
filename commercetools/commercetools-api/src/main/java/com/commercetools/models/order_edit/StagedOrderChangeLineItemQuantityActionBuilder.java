package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeLineItemQuantityActionBuilder {
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.common.Money externalPrice;
   
   public StagedOrderChangeLineItemQuantityActionBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
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
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public StagedOrderChangeLineItemQuantityAction build() {
       return new StagedOrderChangeLineItemQuantityActionImpl(quantity, externalTotalPrice, lineItemId, externalPrice);
   }
   
   public static StagedOrderChangeLineItemQuantityActionBuilder of() {
      return new StagedOrderChangeLineItemQuantityActionBuilder();
   }
   
   public static StagedOrderChangeLineItemQuantityActionBuilder of(final StagedOrderChangeLineItemQuantityAction template) {
      StagedOrderChangeLineItemQuantityActionBuilder builder = new StagedOrderChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}