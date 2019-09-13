package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetMetaKeywordsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetMetaKeywordsActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private java.lang.Boolean staged;
   
   public ProductSetMetaKeywordsActionBuilder metaKeywords(@Nullable final com.commercetools.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductSetMetaKeywordsActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public ProductSetMetaKeywordsAction build() {
       return new ProductSetMetaKeywordsActionImpl(metaKeywords, staged);
   }
   
   public static ProductSetMetaKeywordsActionBuilder of() {
      return new ProductSetMetaKeywordsActionBuilder();
   }
   
   public static ProductSetMetaKeywordsActionBuilder of(final ProductSetMetaKeywordsAction template) {
      ProductSetMetaKeywordsActionBuilder builder = new ProductSetMetaKeywordsActionBuilder();
      builder.metaKeywords = template.getMetaKeywords();
      builder.staged = template.getStaged();
      return builder;
   }
   
}