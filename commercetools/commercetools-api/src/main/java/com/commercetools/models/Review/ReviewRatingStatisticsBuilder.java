package com.commercetools.models.Review;

import java.lang.Integer;
import java.lang.Object;
import com.commercetools.models.Review.ReviewRatingStatistics;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewRatingStatisticsBuilder {
   
   
   private java.lang.Integer highestRating;
   
   
   private java.lang.Integer averageRating;
   
   
   private java.lang.Integer count;
   
   
   private java.lang.Object ratingsDistribution;
   
   
   private java.lang.Integer lowestRating;
   
   public ReviewRatingStatisticsBuilder highestRating( final java.lang.Integer highestRating) {
      this.highestRating = highestRating;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder averageRating( final java.lang.Integer averageRating) {
      this.averageRating = averageRating;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder count( final java.lang.Integer count) {
      this.count = count;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder ratingsDistribution( final java.lang.Object ratingsDistribution) {
      this.ratingsDistribution = ratingsDistribution;
      return this;
   }
   
   public ReviewRatingStatisticsBuilder lowestRating( final java.lang.Integer lowestRating) {
      this.lowestRating = lowestRating;
      return this;
   }
   
   
   public java.lang.Integer getHighestRating(){
      return this.highestRating;
   }
   
   
   public java.lang.Integer getAverageRating(){
      return this.averageRating;
   }
   
   
   public java.lang.Integer getCount(){
      return this.count;
   }
   
   
   public java.lang.Object getRatingsDistribution(){
      return this.ratingsDistribution;
   }
   
   
   public java.lang.Integer getLowestRating(){
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