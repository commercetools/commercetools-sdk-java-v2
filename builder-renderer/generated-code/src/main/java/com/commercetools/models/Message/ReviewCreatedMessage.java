package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Review.Review;
import com.commercetools.models.Message.ReviewCreatedMessageImpl;

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
@JsonDeserialize(as = ReviewCreatedMessageImpl.class)
public interface ReviewCreatedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("review")
   public Review getReview();

   public void setReview(final Review review);
   
   public static ReviewCreatedMessageImpl of(){
      return new ReviewCreatedMessageImpl();
   }
   

   public static ReviewCreatedMessageImpl of(final ReviewCreatedMessage template) {
      ReviewCreatedMessageImpl instance = new ReviewCreatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setReview(template.getReview());
      return instance;
   }

}