package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import java.lang.Object;
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
public final class ReviewSetTargetActionImpl implements ReviewSetTargetAction {

   private java.lang.String action;
   
   private java.lang.Object target;

   @JsonCreator
   ReviewSetTargetActionImpl(@JsonProperty("target") final java.lang.Object target) {
      this.target = target;
      this.action = "setTarget";
   }
   public ReviewSetTargetActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Object getTarget(){
      return this.target;
   }

   public void setTarget(final java.lang.Object target){
      this.target = target;
   }

}