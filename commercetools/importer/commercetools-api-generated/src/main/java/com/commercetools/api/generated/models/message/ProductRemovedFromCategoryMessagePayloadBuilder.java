package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductRemovedFromCategoryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRemovedFromCategoryMessagePayloadBuilder {
   
   
   private Boolean staged;
   
   
   private com.commercetools.api.generated.models.category.CategoryReference category;
   
   public ProductRemovedFromCategoryMessagePayloadBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemovedFromCategoryMessagePayloadBuilder category( final com.commercetools.api.generated.models.category.CategoryReference category) {
      this.category = category;
      return this;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryReference getCategory(){
      return this.category;
   }

   public ProductRemovedFromCategoryMessagePayload build() {
       return new ProductRemovedFromCategoryMessagePayloadImpl(staged, category);
   }
   
   public static ProductRemovedFromCategoryMessagePayloadBuilder of() {
      return new ProductRemovedFromCategoryMessagePayloadBuilder();
   }
   
   public static ProductRemovedFromCategoryMessagePayloadBuilder of(final ProductRemovedFromCategoryMessagePayload template) {
      ProductRemovedFromCategoryMessagePayloadBuilder builder = new ProductRemovedFromCategoryMessagePayloadBuilder();
      builder.staged = template.getStaged();
      builder.category = template.getCategory();
      return builder;
   }
   
}