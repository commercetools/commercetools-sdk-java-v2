package com.commercetools.models.review;

import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.review.ReviewSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.models.customer.CustomerResourceIdentifier customer;
   
   public ReviewSetCustomerActionBuilder customer(@Nullable final com.commercetools.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerResourceIdentifier getCustomer(){
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