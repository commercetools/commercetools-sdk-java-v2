package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
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
public final class ReviewSetAuthorNameActionImpl implements ReviewSetAuthorNameAction {

   private String action;
   
   private String authorName;

   @JsonCreator
   ReviewSetAuthorNameActionImpl(@JsonProperty("authorName") final String authorName) {
      this.authorName = authorName;
      this.action = "setAuthorName";
   }
   public ReviewSetAuthorNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAuthorName(){
      return this.authorName;
   }

   public void setAuthorName(final String authorName){
      this.authorName = authorName;
   }

}