package com.commercetools.models.Message;

import com.commercetools.models.Category.Category;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CategoryCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Category.Category category;
   
   public CategoryCreatedMessagePayloadBuilder category( final com.commercetools.models.Category.Category category) {
      this.category = category;
      return this;
   }
   
   
   public com.commercetools.models.Category.Category getCategory(){
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