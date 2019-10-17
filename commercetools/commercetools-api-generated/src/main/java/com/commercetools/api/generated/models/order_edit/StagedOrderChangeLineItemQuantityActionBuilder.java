package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeLineItemQuantityActionBuilder {
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money externalPrice;
   
   public StagedOrderChangeLineItemQuantityActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.api.generated.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getExternalPrice(){
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