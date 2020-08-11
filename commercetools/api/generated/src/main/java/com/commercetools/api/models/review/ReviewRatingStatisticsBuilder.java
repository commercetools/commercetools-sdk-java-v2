package com.commercetools.api.models.review;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewRatingStatisticsBuilder {
   
   
   private Integer highestRating;
   
   
   private Integer averageRating;
   
   
   private Integer count;
   
   
   private com.fasterxml.jackson.databind.JsonNode ratingsDistribution;
   
   
   private Integer lowestRating;
   
   public ReviewRatingStatisticsBuilder highestRating( final Integer highestRating) {
      this.highestRating = highestRating;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder averageRating( final Integer averageRating) {
      this.averageRating = averageRating;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder count( final Integer count) {
      this.count = count;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder ratingsDistribution( final com.fasterxml.jackson.databind.JsonNode ratingsDistribution) {
      this.ratingsDistribution = ratingsDistribution;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder lowestRating( final Integer lowestRating) {
      this.lowestRating = lowestRating;
      return this;
   }
   
   
   public Integer getHighestRating(){
      return this.highestRating;
   }
   
   
   public Integer getAverageRating(){
      return this.averageRating;
   }
   
   
   public Integer getCount(){
      return this.count;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getRatingsDistribution(){
      return this.ratingsDistribution;
   }
   
   
   public Integer getLowestRating(){
      return this.lowestRating;
   }

   public ReviewRatingStatistics build() {
       return new ReviewRatingStatisticsImpl(highestRating, averageRating, count, ratingsDistribution, lowestRating);
   }
   
   public static ReviewRatingStatisticsBuilder of() {
      return new ReviewRatingStatisticsBuilder();
   }
   
   public static ReviewRatingStatisticsBuilder of(final ReviewRatingStatistics template) {
      ReviewRatingStatisticsBuilder builder = new ReviewRatingStatisticsBuilder();
      builder.highestRating = template.getHighestRating();
      builder.averageRating = template.getAverageRating();
      builder.count = template.getCount();
      builder.ratingsDistribution = template.getRatingsDistribution();
      builder.lowestRating = template.getLowestRating();
      return builder;
   }
   
}
