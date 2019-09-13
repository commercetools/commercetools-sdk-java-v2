package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.cart.CartRemoveCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveCustomLineItemActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   public CartRemoveCustomLineItemActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public CartRemoveCustomLineItemAction build() {
       return new CartRemoveCustomLineItemActionImpl(customLineItemId);
   }
   
   public static CartRemoveCustomLineItemActionBuilder of() {
      return new CartRemoveCustomLineItemActionBuilder();
   }
   
   public static CartRemoveCustomLineItemActionBuilder of(final CartRemoveCustomLineItemAction template) {
      CartRemoveCustomLineItemActionBuilder builder = new CartRemoveCustomLineItemActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      return builder;
   }
   
}