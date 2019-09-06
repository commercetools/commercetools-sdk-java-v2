package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import com.commercetools.models.Project.ShippingRateInputType;
import java.lang.String;
import com.commercetools.models.Project.ProjectSetShippingRateInputTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectSetShippingRateInputTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Project.ShippingRateInputType shippingRateInputType;
   
   public ProjectSetShippingRateInputTypeActionBuilder shippingRateInputType(@Nullable final com.commercetools.models.Project.ShippingRateInputType shippingRateInputType) {
      this.shippingRateInputType = shippingRateInputType;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Project.ShippingRateInputType getShippingRateInputType(){
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