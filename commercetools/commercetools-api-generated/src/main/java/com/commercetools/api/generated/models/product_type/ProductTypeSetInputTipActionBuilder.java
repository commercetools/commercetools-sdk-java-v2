package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeSetInputTipAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeSetInputTipActionBuilder {
   
   
   private String attributeName;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString inputTip;
   
   public ProductTypeSetInputTipActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeSetInputTipActionBuilder inputTip(@Nullable final com.commercetools.api.generated.models.common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getInputTip(){
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