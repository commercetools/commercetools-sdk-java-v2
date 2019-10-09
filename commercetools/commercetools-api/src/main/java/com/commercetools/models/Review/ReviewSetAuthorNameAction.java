package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.review.ReviewSetAuthorNameActionImpl;

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
@JsonDeserialize(as = ReviewSetAuthorNameActionImpl.class)
public interface ReviewSetAuthorNameAction extends ReviewUpdateAction {

   
   
   @JsonProperty("authorName")
   public String getAuthorName();

   public void setAuthorName(final String authorName);
   
   public static ReviewSetAuthorNameActionImpl of(){
      return new ReviewSetAuthorNameActionImpl();
   }
   

   public static ReviewSetAuthorNameActionImpl of(final ReviewSetAuthorNameAction template) {
      ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
      instance.setAuthorName(template.getAuthorName());
      return instance;
   }

}