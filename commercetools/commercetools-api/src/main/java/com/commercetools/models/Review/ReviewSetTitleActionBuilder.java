package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.review.ReviewSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetTitleActionBuilder {
   
   @Nullable
   private java.lang.String title;
   
   public ReviewSetTitleActionBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }

   public ReviewSetTitleAction build() {
       return new ReviewSetTitleActionImpl(title);
   }
   
   public static ReviewSetTitleActionBuilder of() {
      return new ReviewSetTitleActionBuilder();
   }
   
   public static ReviewSetTitleActionBuilder of(final ReviewSetTitleAction template) {
      ReviewSetTitleActionBuilder builder = new ReviewSetTitleActionBuilder();
      builder.title = template.getTitle();
      return builder;
   }
   
}