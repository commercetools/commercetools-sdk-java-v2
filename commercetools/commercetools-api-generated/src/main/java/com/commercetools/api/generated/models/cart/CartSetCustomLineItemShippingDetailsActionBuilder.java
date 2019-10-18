package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomLineItemShippingDetailsActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   public CartSetCustomLineItemShippingDetailsActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
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