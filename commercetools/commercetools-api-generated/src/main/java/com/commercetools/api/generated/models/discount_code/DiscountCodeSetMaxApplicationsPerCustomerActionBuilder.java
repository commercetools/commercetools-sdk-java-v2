package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetMaxApplicationsPerCustomerActionBuilder {
   
   @Nullable
   private Long maxApplicationsPerCustomer;
   
   public DiscountCodeSetMaxApplicationsPerCustomerActionBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      return this;
   }
   
   @Nullable
   public Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }

   public DiscountCodeSetMaxApplicationsPerCustomerAction build() {
       return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl(maxApplicationsPerCustomer);
   }
   
   public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of() {
      return new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
   }
   
   public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of(final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
      DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder = new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
      builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
      return builder;
   }
   
}