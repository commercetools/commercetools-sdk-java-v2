package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetAuthorNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetAuthorNameActionBuilder {
   
   @Nullable
   private String authorName;
   
   public ReviewSetAuthorNameActionBuilder authorName(@Nullable final String authorName) {
      this.authorName = authorName;
      return this;
   }
   
   @Nullable
   public String getAuthorName(){
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