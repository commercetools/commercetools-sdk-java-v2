package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Me.MyCartRecalculateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRecalculateActionBuilder {
   
   @Nullable
   private java.lang.Boolean updateProductData;
   
   public MyCartRecalculateActionBuilder updateProductData(@Nullable final java.lang.Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getUpdateProductData(){
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