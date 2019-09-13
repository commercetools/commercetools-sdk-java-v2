package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.review.ReviewSetRatingAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewSetRatingActionBuilder {
   
   @Nullable
   private java.lang.Integer rating;
   
   public ReviewSetRatingActionBuilder rating(@Nullable final java.lang.Integer rating) {
      this.rating = rating;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getRating(){
      return this.rating;
   }

   public ReviewSetRatingAction build() {
       return new ReviewSetRatingActionImpl(rating);
   }
   
   public static ReviewSetRatingActionBuilder of() {
      return new ReviewSetRatingActionBuilder();
   }
   
   public static ReviewSetRatingActionBuilder of(final ReviewSetRatingAction template) {
      ReviewSetRatingActionBuilder builder = new ReviewSetRatingActionBuilder();
      builder.rating = template.getRating();
      return builder;
   }
   
}