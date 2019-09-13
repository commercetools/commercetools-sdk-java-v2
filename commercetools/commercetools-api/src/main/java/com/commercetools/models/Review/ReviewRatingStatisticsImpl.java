package com.commercetools.models.review;

import java.lang.Integer;
import java.lang.Object;
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

   private java.lang.Integer highestRating;
   
   private java.lang.Integer averageRating;
   
   private java.lang.Integer count;
   
   private java.lang.Object ratingsDistribution;
   
   private java.lang.Integer lowestRating;

   @JsonCreator
   ReviewRatingStatisticsImpl(@JsonProperty("highestRating") final java.lang.Integer highestRating, @JsonProperty("averageRating") final java.lang.Integer averageRating, @JsonProperty("count") final java.lang.Integer count, @JsonProperty("ratingsDistribution") final java.lang.Object ratingsDistribution, @JsonProperty("lowestRating") final java.lang.Integer lowestRating) {
      this.highestRating = highestRating;
      this.averageRating = averageRating;
      this.count = count;
      this.ratingsDistribution = ratingsDistribution;
      this.lowestRating = lowestRating;
   }
   public ReviewRatingStatisticsImpl() {
      
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

   public void setHighestRating(final java.lang.Integer highestRating){
      this.highestRating = highestRating;
   }
   
   public void setAverageRating(final java.lang.Integer averageRating){
      this.averageRating = averageRating;
   }
   
   public void setCount(final java.lang.Integer count){
      this.count = count;
   }
   
   public void setRatingsDistribution(final java.lang.Object ratingsDistribution){
      this.ratingsDistribution = ratingsDistribution;
   }
   
   public void setLowestRating(final java.lang.Integer lowestRating){
      this.lowestRating = lowestRating;
   }

}