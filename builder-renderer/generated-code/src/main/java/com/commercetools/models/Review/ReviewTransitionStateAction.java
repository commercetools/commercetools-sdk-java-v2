package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Review.ReviewTransitionStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewTransitionStateActionImpl.class)
public interface ReviewTransitionStateAction extends ReviewUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   
   
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateResourceIdentifier state);
   
   public void setForce(final Boolean force);
   
   public static ReviewTransitionStateActionImpl of(){
      return new ReviewTransitionStateActionImpl();
   }
   

   public static ReviewTransitionStateActionImpl of(final ReviewTransitionStateAction template) {
      ReviewTransitionStateActionImpl instance = new ReviewTransitionStateActionImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}