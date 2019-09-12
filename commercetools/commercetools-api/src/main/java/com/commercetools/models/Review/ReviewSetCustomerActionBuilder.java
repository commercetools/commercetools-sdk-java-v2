package com.commercetools.models.Review;

import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;
   
   public ReviewSetCustomerActionBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
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