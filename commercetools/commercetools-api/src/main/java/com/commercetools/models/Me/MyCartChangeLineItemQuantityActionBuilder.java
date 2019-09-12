package com.commercetools.models.Me;

import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Me.MyCartChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartChangeLineItemQuantityActionBuilder {
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Common.Money externalPrice;
   
   public MyCartChangeLineItemQuantityActionBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyCartChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public MyCartChangeLineItemQuantityActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.models.Common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
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
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public MyCartChangeLineItemQuantityAction build() {
       return new MyCartChangeLineItemQuantityActionImpl(quantity, externalTotalPrice, lineItemId, externalPrice);
   }
   
   public static MyCartChangeLineItemQuantityActionBuilder of() {
      return new MyCartChangeLineItemQuantityActionBuilder();
   }
   
   public static MyCartChangeLineItemQuantityActionBuilder of(final MyCartChangeLineItemQuantityAction template) {
      MyCartChangeLineItemQuantityActionBuilder builder = new MyCartChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}