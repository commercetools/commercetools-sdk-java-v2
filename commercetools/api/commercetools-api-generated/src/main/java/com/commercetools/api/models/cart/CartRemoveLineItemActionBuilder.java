package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemoveLineItemActionBuilder {

   @Nullable
   private Integer quantity;

   @Nullable
   private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;


   private String lineItemId;

   @Nullable
   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

   @Nullable
   private com.commercetools.api.models.common.Money externalPrice;

   public CartRemoveLineItemActionBuilder quantity(@Nullable final Integer quantity) {
      this.quantity = quantity;
      return this;
   }

   public CartRemoveLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }

   public CartRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }

   public CartRemoveLineItemActionBuilder shippingDetailsToRemove(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      return this;
   }

   public CartRemoveLineItemActionBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }

   @Nullable
   public Integer getQuantity(){
      return this.quantity;
   }

   @Nullable
   public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }

   @Nullable
   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }

   @Nullable
   public com.commercetools.api.models.common.Money getExternalPrice(){
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
