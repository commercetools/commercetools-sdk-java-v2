package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.lang.Boolean staged;
   
   public ProductChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductChangeNameActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public ProductChangeNameAction build() {
       return new ProductChangeNameActionImpl(name, staged);
   }
   
   public static ProductChangeNameActionBuilder of() {
      return new ProductChangeNameActionBuilder();
   }
   
   public static ProductChangeNameActionBuilder of(final ProductChangeNameAction template) {
      ProductChangeNameActionBuilder builder = new ProductChangeNameActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      return builder;
   }
   
}