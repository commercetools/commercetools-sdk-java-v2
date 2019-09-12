package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Message.ReviewRatingSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewRatingSetMessagePayloadBuilder {
   
   @Nullable
   private java.lang.Integer oldRating;
   
   
   private java.lang.Boolean includedInStatistics;
   
   @Nullable
   private java.lang.Integer newRating;
   
   @Nullable
   private com.commercetools.models.Common.Reference target;
   
   public ReviewRatingSetMessagePayloadBuilder oldRating(@Nullable final java.lang.Integer oldRating) {
      this.oldRating = oldRating;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder includedInStatistics( final java.lang.Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder newRating(@Nullable final java.lang.Integer newRating) {
      this.newRating = newRating;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder target(@Nullable final com.commercetools.models.Common.Reference target) {
      this.target = target;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public java.lang.Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   @Nullable
   public java.lang.Integer getNewRating(){
      return this.newRating;
   }
   
   @Nullable
   public com.commercetools.models.Common.Reference getTarget(){
      return this.target;
   }

   public ReviewRatingSetMessagePayload build() {
       return new ReviewRatingSetMessagePayloadImpl(oldRating, includedInStatistics, newRating, target);
   }
   
   public static ReviewRatingSetMessagePayloadBuilder of() {
      return new ReviewRatingSetMessagePayloadBuilder();
   }
   
   public static ReviewRatingSetMessagePayloadBuilder of(final ReviewRatingSetMessagePayload template) {
      ReviewRatingSetMessagePayloadBuilder builder = new ReviewRatingSetMessagePayloadBuilder();
      builder.oldRating = template.getOldRating();
      builder.includedInStatistics = template.getIncludedInStatistics();
      builder.newRating = template.getNewRating();
      builder.target = template.getTarget();
      return builder;
   }
   
}