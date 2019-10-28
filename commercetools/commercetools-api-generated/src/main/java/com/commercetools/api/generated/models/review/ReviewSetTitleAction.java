package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetTitleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ReviewSetTitleActionImpl.class)
public interface ReviewSetTitleAction extends ReviewUpdateAction {

   
   
   @JsonProperty("title")
   public String getTitle();

   public void setTitle(final String title);
   
   public static ReviewSetTitleActionImpl of(){
      return new ReviewSetTitleActionImpl();
   }
   

   public static ReviewSetTitleActionImpl of(final ReviewSetTitleAction template) {
      ReviewSetTitleActionImpl instance = new ReviewSetTitleActionImpl();
      instance.setTitle(template.getTitle());
      return instance;
   }

}