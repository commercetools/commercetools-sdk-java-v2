package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetMetaDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetMetaDescriptionActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   public ProductSetMetaDescriptionActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetMetaDescriptionActionBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
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