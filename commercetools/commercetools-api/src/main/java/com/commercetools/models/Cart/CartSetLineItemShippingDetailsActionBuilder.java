package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private java.lang.String lineItemId;
   
   public CartSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CartSetLineItemShippingDetailsActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public CartSetLineItemShippingDetailsAction build() {
       return new CartSetLineItemShippingDetailsActionImpl(shippingDetails, lineItemId);
   }
   
   public static CartSetLineItemShippingDetailsActionBuilder of() {
      return new CartSetLineItemShippingDetailsActionBuilder();
   }
   
   public static CartSetLineItemShippingDetailsActionBuilder of(final CartSetLineItemShippingDetailsAction template) {
      CartSetLineItemShippingDetailsActionBuilder builder = new CartSetLineItemShippingDetailsActionBuilder();
      builder.shippingDetails = template.getShippingDetails();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}