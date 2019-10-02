package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductChangeSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangeSlugActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public ProductChangeSlugActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangeSlugActionBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public ProductChangeSlugAction build() {
       return new ProductChangeSlugActionImpl(staged, slug);
   }
   
   public static ProductChangeSlugActionBuilder of() {
      return new ProductChangeSlugActionBuilder();
   }
   
   public static ProductChangeSlugActionBuilder of(final ProductChangeSlugAction template) {
      ProductChangeSlugActionBuilder builder = new ProductChangeSlugActionBuilder();
      builder.staged = template.getStaged();
      builder.slug = template.getSlug();
      return builder;
   }
   
}