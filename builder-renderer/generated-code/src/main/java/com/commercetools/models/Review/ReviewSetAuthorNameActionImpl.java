package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetAuthorNameActionImpl implements ReviewSetAuthorNameAction {

   private java.lang.String action;
   
   private java.lang.String authorName;

   @JsonCreator
   ReviewSetAuthorNameActionImpl(@JsonProperty("authorName") final java.lang.String authorName) {
      this.authorName = authorName;
      this.action = "setAuthorName";
   }
   public ReviewSetAuthorNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAuthorName(){
      return this.authorName;
   }

   public void setAuthorName(final java.lang.String authorName){
      this.authorName = authorName;
   }

}