package com.commercetools.models.message;

import com.commercetools.models.category.Category;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CategoryCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.category.Category category;
   
   public CategoryCreatedMessagePayloadBuilder category( final com.commercetools.models.category.Category category) {
      this.category = category;
      return this;
   }
   
   
   public com.commercetools.models.category.Category getCategory(){
      return this.category;
   }

   public CategoryCreatedMessagePayload build() {
       return new CategoryCreatedMessagePayloadImpl(category);
   }
   
   public static CategoryCreatedMessagePayloadBuilder of() {
      return new CategoryCreatedMessagePayloadBuilder();
   }
   
   public static CategoryCreatedMessagePayloadBuilder of(final CategoryCreatedMessagePayload template) {
      CategoryCreatedMessagePayloadBuilder builder = new CategoryCreatedMessagePayloadBuilder();
      builder.category = template.getCategory();
      return builder;
   }
   
}