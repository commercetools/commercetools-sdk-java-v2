package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductUnpublishAction;
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
public final class ProductUnpublishActionBuilder {
   
   
   

   public ProductUnpublishAction build() {
       return new ProductUnpublishActionImpl();
   }
   
   public static ProductUnpublishActionBuilder of() {
      return new ProductUnpublishActionBuilder();
   }
   
   public static ProductUnpublishActionBuilder of(final ProductUnpublishAction template) {
      ProductUnpublishActionBuilder builder = new ProductUnpublishActionBuilder();
      return builder;
   }
   
}