package com.commercetools.api.generated.models.review;


import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
   
   private Object ratingsDistribution;
   
   private Integer lowestRating;

   @JsonCreator
   ReviewRatingStatisticsImpl(@JsonProperty("highestRating") final Integer highestRating, @JsonProperty("averageRating") final Integer averageRating, @JsonProperty("count") final Integer count, @JsonProperty("ratingsDistribution") final Object ratingsDistribution, @JsonProperty("lowestRating") final Integer lowestRating) {
      this.highestRating = highestRating;
      this.averageRating = averageRating;
      this.count = count;
      this.ratingsDistribution = ratingsDistribution;
      this.lowestRating = lowestRating;
   }
   public ReviewRatingStatisticsImpl() {
      
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
   
   
   public Object getRatingsDistribution(){
      return this.ratingsDistribution;
   }
   
   
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
   
   public void setRatingsDistribution(final Object ratingsDistribution){
      this.ratingsDistribution = ratingsDistribution;
   }
   
   public void setLowestRating(final Integer lowestRating){
      this.lowestRating = lowestRating;
   }

}