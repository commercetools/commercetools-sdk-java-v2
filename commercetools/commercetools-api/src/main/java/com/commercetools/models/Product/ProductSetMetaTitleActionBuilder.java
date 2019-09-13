package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetMetaTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetMetaTitleActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   @Nullable
   private java.lang.Boolean staged;
   
   public ProductSetMetaTitleActionBuilder metaTitle(@Nullable final com.commercetools.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductSetMetaTitleActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public ProductSetMetaTitleAction build() {
       return new ProductSetMetaTitleActionImpl(metaTitle, staged);
   }
   
   public static ProductSetMetaTitleActionBuilder of() {
      return new ProductSetMetaTitleActionBuilder();
   }
   
   public static ProductSetMetaTitleActionBuilder of(final ProductSetMetaTitleAction template) {
      ProductSetMetaTitleActionBuilder builder = new ProductSetMetaTitleActionBuilder();
      builder.metaTitle = template.getMetaTitle();
      builder.staged = template.getStaged();
      return builder;
   }
   
}