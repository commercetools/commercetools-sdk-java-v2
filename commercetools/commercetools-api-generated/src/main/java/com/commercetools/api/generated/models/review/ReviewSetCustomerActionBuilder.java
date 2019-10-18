package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   public ReviewSetCustomerActionBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public ReviewSetCustomerAction build() {
       return new ReviewSetCustomerActionImpl(customer);
   }
   
   public static ReviewSetCustomerActionBuilder of() {
      return new ReviewSetCustomerActionBuilder();
   }
   
   public static ReviewSetCustomerActionBuilder of(final ReviewSetCustomerAction template) {
      ReviewSetCustomerActionBuilder builder = new ReviewSetCustomerActionBuilder();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}