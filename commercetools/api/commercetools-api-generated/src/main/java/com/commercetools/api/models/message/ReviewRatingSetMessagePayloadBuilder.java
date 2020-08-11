package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewRatingSetMessagePayloadBuilder {
   
   @Nullable
   private Integer oldRating;
   
   
   private Boolean includedInStatistics;
   
   @Nullable
   private Integer newRating;
   
   @Nullable
   private com.commercetools.api.models.common.Reference target;
   
   public ReviewRatingSetMessagePayloadBuilder oldRating(@Nullable final Integer oldRating) {
      this.oldRating = oldRating;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder includedInStatistics( final Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder newRating(@Nullable final Integer newRating) {
      this.newRating = newRating;
      return this;
   }
   
   public ReviewRatingSetMessagePayloadBuilder target(@Nullable final com.commercetools.api.models.common.Reference target) {
      this.target = target;
      return this;
   }
   
   @Nullable
   public Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   @Nullable
   public Integer getNewRating(){
      return this.newRating;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Reference getTarget(){
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
