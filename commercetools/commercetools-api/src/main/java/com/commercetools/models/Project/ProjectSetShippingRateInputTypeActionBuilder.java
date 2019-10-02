package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ShippingRateInputType;
import com.commercetools.models.project.ProjectSetShippingRateInputTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectSetShippingRateInputTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.project.ShippingRateInputType shippingRateInputType;
   
   public ProjectSetShippingRateInputTypeActionBuilder shippingRateInputType(@Nullable final com.commercetools.models.project.ShippingRateInputType shippingRateInputType) {
      this.shippingRateInputType = shippingRateInputType;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }

   public ProjectSetShippingRateInputTypeAction build() {
       return new ProjectSetShippingRateInputTypeActionImpl(shippingRateInputType);
   }
   
   public static ProjectSetShippingRateInputTypeActionBuilder of() {
      return new ProjectSetShippingRateInputTypeActionBuilder();
   }
   
   public static ProjectSetShippingRateInputTypeActionBuilder of(final ProjectSetShippingRateInputTypeAction template) {
      ProjectSetShippingRateInputTypeActionBuilder builder = new ProjectSetShippingRateInputTypeActionBuilder();
      builder.shippingRateInputType = template.getShippingRateInputType();
      return builder;
   }
   
}