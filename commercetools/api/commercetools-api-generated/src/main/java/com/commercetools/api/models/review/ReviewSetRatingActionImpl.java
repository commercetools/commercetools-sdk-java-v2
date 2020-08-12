package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetRatingActionImpl implements ReviewSetRatingAction {

   private String action;
   
   private Integer rating;

   @JsonCreator
   ReviewSetRatingActionImpl(@JsonProperty("rating") final Integer rating) {
      this.rating = rating;
      this.action = "setRating";
   }
   public ReviewSetRatingActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>Number between -100 and 100 included.
   *  If <code>rating</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   public Integer getRating(){
      return this.rating;
   }

   public void setRating(final Integer rating){
      this.rating = rating;
   }

}
