package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private Boolean staged;
   
   public ProductSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductSetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public Boolean getStaged(){
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