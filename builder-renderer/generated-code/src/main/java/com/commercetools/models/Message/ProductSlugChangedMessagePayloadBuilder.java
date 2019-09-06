package com.commercetools.models.Message;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.ProductSlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSlugChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   public ProductSlugChangedMessagePayloadBuilder slug( final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
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