package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.review.ReviewSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ReviewSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ReviewSetKeyAction build() {
       return new ReviewSetKeyActionImpl(key);
   }
   
   public static ReviewSetKeyActionBuilder of() {
      return new ReviewSetKeyActionBuilder();
   }
   
   public static ReviewSetKeyActionBuilder of(final ReviewSetKeyAction template) {
      ReviewSetKeyActionBuilder builder = new ReviewSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}