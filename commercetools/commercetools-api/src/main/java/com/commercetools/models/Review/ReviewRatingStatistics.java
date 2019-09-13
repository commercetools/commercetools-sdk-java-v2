package com.commercetools.models.review;

import java.lang.Integer;
import java.lang.Object;
import com.commercetools.models.review.ReviewRatingStatisticsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewRatingStatisticsImpl.class)
public interface ReviewRatingStatistics  {

   
   @NotNull
   @JsonProperty("averageRating")
   public Integer getAverageRating();
   
   @NotNull
   @JsonProperty("highestRating")
   public Integer getHighestRating();
   
   @NotNull
   @JsonProperty("lowestRating")
   public Integer getLowestRating();
   
   @NotNull
   @JsonProperty("count")
   public Integer getCount();
   
   @NotNull
   @Valid
   @JsonProperty("ratingsDistribution")
   public Object getRatingsDistribution();

   public void setAverageRating(final Integer averageRating);
   
   public void setHighestRating(final Integer highestRating);
   
   public void setLowestRating(final Integer lowestRating);
   
   public void setCount(final Integer count);
   
   public void setRatingsDistribution(final Object ratingsDistribution);
   
   public static ReviewRatingStatisticsImpl of(){
      return new ReviewRatingStatisticsImpl();
   }
   

   public static ReviewRatingStatisticsImpl of(final ReviewRatingStatistics template) {
      ReviewRatingStatisticsImpl instance = new ReviewRatingStatisticsImpl();
      instance.setHighestRating(template.getHighestRating());
      instance.setAverageRating(template.getAverageRating());
      instance.setCount(template.getCount());
      instance.setRatingsDistribution(template.getRatingsDistribution());
      instance.setLowestRating(template.getLowestRating());
      return instance;
   }

}