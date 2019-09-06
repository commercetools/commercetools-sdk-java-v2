package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetMetaDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetMetaDescriptionActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   public ProductSetMetaDescriptionActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetMetaDescriptionActionBuilder metaDescription(@Nullable final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }

   public ProductSetMetaDescriptionAction build() {
       return new ProductSetMetaDescriptionActionImpl(staged, metaDescription);
   }
   
   public static ProductSetMetaDescriptionActionBuilder of() {
      return new ProductSetMetaDescriptionActionBuilder();
   }
   
   public static ProductSetMetaDescriptionActionBuilder of(final ProductSetMetaDescriptionAction template) {
      ProductSetMetaDescriptionActionBuilder builder = new ProductSetMetaDescriptionActionBuilder();
      builder.staged = template.getStaged();
      builder.metaDescription = template.getMetaDescription();
      return builder;
   }
   
}