package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetTargetActionImpl;

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
@JsonDeserialize(as = ReviewSetTargetActionImpl.class)
public interface ReviewSetTargetAction extends ReviewUpdateAction {

   
   @NotNull
   @JsonProperty("target")
   public Object getTarget();

   public void setTarget(final Object target);
   
   public static ReviewSetTargetActionImpl of(){
      return new ReviewSetTargetActionImpl();
   }
   

   public static ReviewSetTargetActionImpl of(final ReviewSetTargetAction template) {
      ReviewSetTargetActionImpl instance = new ReviewSetTargetActionImpl();
      instance.setTarget(template.getTarget());
      return instance;
   }

}