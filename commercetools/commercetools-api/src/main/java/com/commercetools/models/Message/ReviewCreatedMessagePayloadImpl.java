package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.review.Review;
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
public final class ReviewCreatedMessagePayloadImpl implements ReviewCreatedMessagePayload {

   private String type;
   
   private com.commercetools.models.review.Review review;

   @JsonCreator
   ReviewCreatedMessagePayloadImpl(@JsonProperty("review") final com.commercetools.models.review.Review review) {
      this.review = review;
      this.type = "ReviewCreated";
   }
   public ReviewCreatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.review.Review getReview(){
      return this.review;
   }

   public void setReview(final com.commercetools.models.review.Review review){
      this.review = review;
   }

}