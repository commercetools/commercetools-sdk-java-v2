package com.commercetools.api.generated.models.review;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewRatingStatisticsImpl implements ReviewRatingStatistics {

   private Integer highestRating;
   
   private Integer averageRating;
   
   private Integer count;
   
   private JsonNode ratingsDistribution;
   
   private Integer lowestRating;

   @JsonCreator
   ReviewRatingStatisticsImpl(@JsonProperty("highestRating") final Integer highestRating, @JsonProperty("averageRating") final Integer averageRating, @JsonProperty("count") final Integer count, @JsonProperty("ratingsDistribution") final JsonNode ratingsDistribution, @JsonProperty("lowestRating") final Integer lowestRating) {
      this.highestRating = highestRating;
      this.averageRating = averageRating;
      this.count = count;
      this.ratingsDistribution = ratingsDistribution;
      this.lowestRating = lowestRating;
   }
   public ReviewRatingStatisticsImpl() {
      
   }
   
   /**
   *  <p>Highest rating of one target</p>
   */
   public Integer getHighestRating(){
      return this.highestRating;
   }
   
   /**
   *  <p>Average rating of one target
   *  This number is rounded with 5 decimals.</p>
   */
   public Integer getAverageRating(){
      return this.averageRating;
   }
   
   /**
   *  <p>Number of ratings taken into account</p>
   */
   public Integer getCount(){
      return this.count;
   }
   
   /**
   *  <p>The full distribution of the ratings.
   *  The keys are the different ratings and the values are the count of reviews having this rating.
   *  Only the used ratings appear in this object.</p>
   */
   public JsonNode getRatingsDistribution(){
      return this.ratingsDistribution;
   }
   
   /**
   *  <p>Lowest rating of one target</p>
   */
   public Integer getLowestRating(){
      return this.lowestRating;
   }

   public void setHighestRating(final Integer highestRating){
      this.highestRating = highestRating;
   }
   
   public void setAverageRating(final Integer averageRating){
      this.averageRating = averageRating;
   }
   
   public void setCount(final Integer count){
      this.count = count;
   }
   
   public void setRatingsDistribution(final JsonNode ratingsDistribution){
      this.ratingsDistribution = ratingsDistribution;
   }
   
   public void setLowestRating(final Integer lowestRating){
      this.lowestRating = lowestRating;
   }

}