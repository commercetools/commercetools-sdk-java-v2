package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Review.Review;
import java.lang.String;
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

   private java.lang.String type;
   
   private com.commercetools.models.Review.Review review;

   @JsonCreator
   ReviewCreatedMessagePayloadImpl(@JsonProperty("review") final com.commercetools.models.Review.Review review) {
      this.review = review;
      this.type = "ReviewCreated";
   }
   public ReviewCreatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Review.Review getReview(){
      return this.review;
   }

   public void setReview(final com.commercetools.models.Review.Review review){
      this.review = review;
   }

}