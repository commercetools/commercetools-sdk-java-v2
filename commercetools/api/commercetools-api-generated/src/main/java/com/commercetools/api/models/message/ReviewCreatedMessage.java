package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.message.ReviewCreatedMessageImpl;

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
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setReview(template.getReview());
      return instance;
   }

}
