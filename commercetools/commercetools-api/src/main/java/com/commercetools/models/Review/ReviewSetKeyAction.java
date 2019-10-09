package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.review.ReviewSetKeyActionImpl;

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
@JsonDeserialize(as = ReviewSetKeyActionImpl.class)
public interface ReviewSetKeyAction extends ReviewUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ReviewSetKeyActionImpl of(){
      return new ReviewSetKeyActionImpl();
   }
   

   public static ReviewSetKeyActionImpl of(final ReviewSetKeyAction template) {
      ReviewSetKeyActionImpl instance = new ReviewSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}