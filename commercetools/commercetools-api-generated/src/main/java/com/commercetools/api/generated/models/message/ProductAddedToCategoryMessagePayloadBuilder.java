package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductAddedToCategoryMessagePayload;
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
public final class ProductAddedToCategoryMessagePayloadBuilder {
   
   
   private Boolean staged;
   
   
   private com.commercetools.api.generated.models.category.CategoryReference category;
   
   public ProductAddedToCategoryMessagePayloadBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddedToCategoryMessagePayloadBuilder category( final com.commercetools.api.generated.models.category.CategoryReference category) {
      this.category = category;
      return this;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryReference getCategory(){
      return this.category;
   }

   public ProductAddedToCategoryMessagePayload build() {
       return new ProductAddedToCategoryMessagePayloadImpl(staged, category);
   }
   
   public static ProductAddedToCategoryMessagePayloadBuilder of() {
      return new ProductAddedToCategoryMessagePayloadBuilder();
   }
   
   public static ProductAddedToCategoryMessagePayloadBuilder of(final ProductAddedToCategoryMessagePayload template) {
      ProductAddedToCategoryMessagePayloadBuilder builder = new ProductAddedToCategoryMessagePayloadBuilder();
      builder.staged = template.getStaged();
      builder.category = template.getCategory();
      return builder;
   }
   
}