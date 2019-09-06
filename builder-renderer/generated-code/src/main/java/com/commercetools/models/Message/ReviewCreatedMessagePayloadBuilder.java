package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Review.Review;
import java.lang.String;
import com.commercetools.models.Message.ReviewCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Review.Review review;
   
   public ReviewCreatedMessagePayloadBuilder review( final com.commercetools.models.Review.Review review) {
      this.review = review;
      return this;
   }
   
   
   public com.commercetools.models.Review.Review getReview(){
      return this.review;
   }

   public ReviewCreatedMessagePayload build() {
       return new ReviewCreatedMessagePayloadImpl(review);
   }
   
   public static ReviewCreatedMessagePayloadBuilder of() {
      return new ReviewCreatedMessagePayloadBuilder();
   }
   
   public static ReviewCreatedMessagePayloadBuilder of(final ReviewCreatedMessagePayload template) {
      ReviewCreatedMessagePayloadBuilder builder = new ReviewCreatedMessagePayloadBuilder();
      builder.review = template.getReview();
      return builder;
   }
   
}