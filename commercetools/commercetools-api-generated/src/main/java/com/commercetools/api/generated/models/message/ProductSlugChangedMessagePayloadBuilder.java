package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductSlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSlugChangedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   public ProductSlugChangedMessagePayloadBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public ProductSlugChangedMessagePayload build() {
       return new ProductSlugChangedMessagePayloadImpl(slug);
   }
   
   public static ProductSlugChangedMessagePayloadBuilder of() {
      return new ProductSlugChangedMessagePayloadBuilder();
   }
   
   public static ProductSlugChangedMessagePayloadBuilder of(final ProductSlugChangedMessagePayload template) {
      ProductSlugChangedMessagePayloadBuilder builder = new ProductSlugChangedMessagePayloadBuilder();
      builder.slug = template.getSlug();
      return builder;
   }
   
}