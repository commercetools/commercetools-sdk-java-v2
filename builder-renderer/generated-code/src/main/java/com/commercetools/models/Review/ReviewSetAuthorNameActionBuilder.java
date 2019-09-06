package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetAuthorNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetAuthorNameActionBuilder {
   
   @Nullable
   private java.lang.String authorName;
   
   public ReviewSetAuthorNameActionBuilder authorName(@Nullable final java.lang.String authorName) {
      this.authorName = authorName;
      return this;
   }
   
   @Nullable
   public java.lang.String getAuthorName(){
      return this.authorName;
   }

   public ReviewSetAuthorNameAction build() {
       return new ReviewSetAuthorNameActionImpl(authorName);
   }
   
   public static ReviewSetAuthorNameActionBuilder of() {
      return new ReviewSetAuthorNameActionBuilder();
   }
   
   public static ReviewSetAuthorNameActionBuilder of(final ReviewSetAuthorNameAction template) {
      ReviewSetAuthorNameActionBuilder builder = new ReviewSetAuthorNameActionBuilder();
      builder.authorName = template.getAuthorName();
      return builder;
   }
   
}