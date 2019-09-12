package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetRatingActionImpl;

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
@JsonDeserialize(as = ReviewSetRatingActionImpl.class)
public interface ReviewSetRatingAction extends ReviewUpdateAction {

   
   
   @JsonProperty("rating")
   public Integer getRating();

   public void setRating(final Integer rating);
   
   public static ReviewSetRatingActionImpl of(){
      return new ReviewSetRatingActionImpl();
   }
   

   public static ReviewSetRatingActionImpl of(final ReviewSetRatingAction template) {
      ReviewSetRatingActionImpl instance = new ReviewSetRatingActionImpl();
      instance.setRating(template.getRating());
      return instance;
   }

}