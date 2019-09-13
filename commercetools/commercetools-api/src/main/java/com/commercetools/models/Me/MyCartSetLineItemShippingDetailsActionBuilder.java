package com.commercetools.models.me;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private java.lang.String lineItemId;
   
   public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public MyCartSetLineItemShippingDetailsActionBuilder lineItemId( final java.lang.String lineItemId) {
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

   public MyCartSetLineItemShippingDetailsAction build() {
       return new MyCartSetLineItemShippingDetailsActionImpl(shippingDetails, lineItemId);
   }
   
   public static MyCartSetLineItemShippingDetailsActionBuilder of() {
      return new MyCartSetLineItemShippingDetailsActionBuilder();
   }
   
   public static MyCartSetLineItemShippingDetailsActionBuilder of(final MyCartSetLineItemShippingDetailsAction template) {
      MyCartSetLineItemShippingDetailsActionBuilder builder = new MyCartSetLineItemShippingDetailsActionBuilder();
      builder.shippingDetails = template.getShippingDetails();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}