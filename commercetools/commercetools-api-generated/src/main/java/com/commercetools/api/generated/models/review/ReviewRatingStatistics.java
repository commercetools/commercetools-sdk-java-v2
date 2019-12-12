package com.commercetools.api.generated.models.review;


import com.commercetools.api.generated.models.review.ReviewRatingStatisticsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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

   /**
   *  <p>Average rating of one target
   *  This number is rounded with 5 decimals.</p>
   */
   @NotNull
   @JsonProperty("averageRating")
   public Integer getAverageRating();
   /**
   *  <p>Highest rating of one target</p>
   */
   @NotNull
   @JsonProperty("highestRating")
   public Integer getHighestRating();
   /**
   *  <p>Lowest rating of one target</p>
   */
   @NotNull
   @JsonProperty("lowestRating")
   public Integer getLowestRating();
   /**
   *  <p>Number of ratings taken into account</p>
   */
   @NotNull
   @JsonProperty("count")
   public Integer getCount();
   /**
   *  <p>The full distribution of the ratings.
   *  The keys are the different ratings and the values are the count of reviews having this rating.
   *  Only the used ratings appear in this object.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("ratingsDistribution")
   public JsonNode getRatingsDistribution();

   public void setAverageRating(final Integer averageRating);
   
   public void setHighestRating(final Integer highestRating);
   
   public void setLowestRating(final Integer lowestRating);
   
   public void setCount(final Integer count);
   
   public void setRatingsDistribution(final JsonNode ratingsDistribution);
   
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