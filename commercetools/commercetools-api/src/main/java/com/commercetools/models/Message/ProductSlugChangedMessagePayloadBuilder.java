package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.ProductSlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSlugChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public ProductSlugChangedMessagePayloadBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
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