package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetMaxApplicationsActionBuilder {
   
   @Nullable
   private java.lang.Long maxApplications;
   
   public DiscountCodeSetMaxApplicationsActionBuilder maxApplications(@Nullable final java.lang.Long maxApplications) {
      this.maxApplications = maxApplications;
      return this;
   }
   
   @Nullable
   public java.lang.Long getMaxApplications(){
      return this.maxApplications;
   }

   public DiscountCodeSetMaxApplicationsAction build() {
       return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
   }
   
   public static DiscountCodeSetMaxApplicationsActionBuilder of() {
      return new DiscountCodeSetMaxApplicationsActionBuilder();
   }
   
   public static DiscountCodeSetMaxApplicationsActionBuilder of(final DiscountCodeSetMaxApplicationsAction template) {
      DiscountCodeSetMaxApplicationsActionBuilder builder = new DiscountCodeSetMaxApplicationsActionBuilder();
      builder.maxApplications = template.getMaxApplications();
      return builder;
   }
   
}