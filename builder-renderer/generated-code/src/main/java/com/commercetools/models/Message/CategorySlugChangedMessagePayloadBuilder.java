package com.commercetools.models.Message;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CategorySlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySlugChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   public CategorySlugChangedMessagePayloadBuilder slug( final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
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