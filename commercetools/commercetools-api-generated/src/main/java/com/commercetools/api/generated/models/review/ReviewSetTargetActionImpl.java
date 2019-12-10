package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String action;
   
   private Object target;

   @JsonCreator
   ReviewSetTargetActionImpl(@JsonProperty("target") final Object target) {
      this.target = target;
      this.action = "setTarget";
   }
   public ReviewSetTargetActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>Identifies the target of the review.
   *  Can be a Product or a Channel.
   *  If <code>target</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   public Object getTarget(){
      return this.target;
   }

   public void setTarget(final Object target){
      this.target = target;
   }

}