package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewSetAuthorNameAction;
import com.commercetools.api.generated.models.review.ReviewSetCustomFieldAction;
import com.commercetools.api.generated.models.review.ReviewSetCustomTypeAction;
import com.commercetools.api.generated.models.review.ReviewSetCustomerAction;
import com.commercetools.api.generated.models.review.ReviewSetKeyAction;
import com.commercetools.api.generated.models.review.ReviewSetLocaleAction;
import com.commercetools.api.generated.models.review.ReviewSetRatingAction;
import com.commercetools.api.generated.models.review.ReviewSetTargetAction;
import com.commercetools.api.generated.models.review.ReviewSetTextAction;
import com.commercetools.api.generated.models.review.ReviewSetTitleAction;
import com.commercetools.api.generated.models.review.ReviewTransitionStateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewUpdateActionImpl implements ReviewUpdateAction {

   private String action;

   @JsonCreator
   ReviewUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}