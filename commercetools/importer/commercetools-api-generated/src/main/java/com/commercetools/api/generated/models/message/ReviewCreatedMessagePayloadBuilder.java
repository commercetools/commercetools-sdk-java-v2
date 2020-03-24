package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.message.ReviewCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.review.Review review;
   
   public ReviewCreatedMessagePayloadBuilder review( final com.commercetools.api.generated.models.review.Review review) {
      this.review = review;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.review.Review getReview(){
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