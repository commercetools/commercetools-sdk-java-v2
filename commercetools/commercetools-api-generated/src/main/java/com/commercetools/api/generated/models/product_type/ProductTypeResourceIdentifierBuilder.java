package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier;
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
public final class ProductTypeResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public ProductTypeResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public ProductTypeResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductTypeResourceIdentifier build() {
       return new ProductTypeResourceIdentifierImpl(id, key);
   }
   
   public static ProductTypeResourceIdentifierBuilder of() {
      return new ProductTypeResourceIdentifierBuilder();
   }
   
   public static ProductTypeResourceIdentifierBuilder of(final ProductTypeResourceIdentifier template) {
      ProductTypeResourceIdentifierBuilder builder = new ProductTypeResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}