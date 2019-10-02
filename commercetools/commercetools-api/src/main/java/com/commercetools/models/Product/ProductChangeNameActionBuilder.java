package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private Boolean staged;
   
   public ProductChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductChangeNameActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public Boolean getStaged(){
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