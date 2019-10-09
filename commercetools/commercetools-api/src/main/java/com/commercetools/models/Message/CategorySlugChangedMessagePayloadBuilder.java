package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CategorySlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySlugChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public CategorySlugChangedMessagePayloadBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public CategorySlugChangedMessagePayload build() {
       return new CategorySlugChangedMessagePayloadImpl(slug);
   }
   
   public static CategorySlugChangedMessagePayloadBuilder of() {
      return new CategorySlugChangedMessagePayloadBuilder();
   }
   
   public static CategorySlugChangedMessagePayloadBuilder of(final CategorySlugChangedMessagePayload template) {
      CategorySlugChangedMessagePayloadBuilder builder = new CategorySlugChangedMessagePayloadBuilder();
      builder.slug = template.getSlug();
      return builder;
   }
   
}