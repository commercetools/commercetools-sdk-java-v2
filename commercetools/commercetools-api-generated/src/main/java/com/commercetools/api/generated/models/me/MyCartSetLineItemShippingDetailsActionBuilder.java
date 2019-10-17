package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private String lineItemId;
   
   public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public MyCartSetLineItemShippingDetailsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getLineItemId(){
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