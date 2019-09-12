package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.lang.Boolean staged;
   
   public ProductSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductSetDescriptionActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public ProductSetDescriptionAction build() {
       return new ProductSetDescriptionActionImpl(description, staged);
   }
   
   public static ProductSetDescriptionActionBuilder of() {
      return new ProductSetDescriptionActionBuilder();
   }
   
   public static ProductSetDescriptionActionBuilder of(final ProductSetDescriptionAction template) {
      ProductSetDescriptionActionBuilder builder = new ProductSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      builder.staged = template.getStaged();
      return builder;
   }
   
}