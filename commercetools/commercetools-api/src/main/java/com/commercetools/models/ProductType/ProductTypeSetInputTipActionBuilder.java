package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeSetInputTipAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeSetInputTipActionBuilder {
   
   
   private java.lang.String attributeName;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString inputTip;
   
   public ProductTypeSetInputTipActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeSetInputTipActionBuilder inputTip(@Nullable final com.commercetools.models.Common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public ProductTypeSetInputTipAction build() {
       return new ProductTypeSetInputTipActionImpl(attributeName, inputTip);
   }
   
   public static ProductTypeSetInputTipActionBuilder of() {
      return new ProductTypeSetInputTipActionBuilder();
   }
   
   public static ProductTypeSetInputTipActionBuilder of(final ProductTypeSetInputTipAction template) {
      ProductTypeSetInputTipActionBuilder builder = new ProductTypeSetInputTipActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.inputTip = template.getInputTip();
      return builder;
   }
   
}