package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveLineItemActionBuilder {
   
   @Nullable
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money externalPrice;
   
   public MyCartRemoveLineItemActionBuilder quantity(@Nullable final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyCartRemoveLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public MyCartRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartRemoveLineItemActionBuilder shippingDetailsToRemove(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      return this;
   }
   
   public MyCartRemoveLineItemActionBuilder externalPrice(@Nullable final com.commercetools.api.generated.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   @Nullable
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
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public MyCartRemoveLineItemAction build() {
       return new MyCartRemoveLineItemActionImpl(quantity, externalTotalPrice, lineItemId, shippingDetailsToRemove, externalPrice);
   }
   
   public static MyCartRemoveLineItemActionBuilder of() {
      return new MyCartRemoveLineItemActionBuilder();
   }
   
   public static MyCartRemoveLineItemActionBuilder of(final MyCartRemoveLineItemAction template) {
      MyCartRemoveLineItemActionBuilder builder = new MyCartRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}