package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ReviewSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
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