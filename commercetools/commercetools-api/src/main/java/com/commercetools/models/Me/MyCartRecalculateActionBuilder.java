package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartRecalculateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRecalculateActionBuilder {
   
   @Nullable
   private Boolean updateProductData;
   
   public MyCartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }
   
   @Nullable
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public MyCartRecalculateAction build() {
       return new MyCartRecalculateActionImpl(updateProductData);
   }
   
   public static MyCartRecalculateActionBuilder of() {
      return new MyCartRecalculateActionBuilder();
   }
   
   public static MyCartRecalculateActionBuilder of(final MyCartRecalculateAction template) {
      MyCartRecalculateActionBuilder builder = new MyCartRecalculateActionBuilder();
      builder.updateProductData = template.getUpdateProductData();
      return builder;
   }
   
}