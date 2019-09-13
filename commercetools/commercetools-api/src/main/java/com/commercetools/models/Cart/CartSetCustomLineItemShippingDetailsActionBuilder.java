package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemShippingDetailsActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   public CartSetCustomLineItemShippingDetailsActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   public CartSetCustomLineItemShippingDetailsAction build() {
       return new CartSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
   }
   
   public static CartSetCustomLineItemShippingDetailsActionBuilder of() {
      return new CartSetCustomLineItemShippingDetailsActionBuilder();
   }
   
   public static CartSetCustomLineItemShippingDetailsActionBuilder of(final CartSetCustomLineItemShippingDetailsAction template) {
      CartSetCustomLineItemShippingDetailsActionBuilder builder = new CartSetCustomLineItemShippingDetailsActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.shippingDetails = template.getShippingDetails();
      return builder;
   }
   
}