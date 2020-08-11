package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ReviewRatingSetMessageImpl;

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
@JsonDeserialize(as = ReviewRatingSetMessageImpl.class)
public interface ReviewRatingSetMessage extends Message {



   @JsonProperty("oldRating")
   public Integer getOldRating();


   @JsonProperty("newRating")
   public Integer getNewRating();

   @NotNull
   @JsonProperty("includedInStatistics")
   public Boolean getIncludedInStatistics();

   @Valid
   @JsonProperty("target")
   public Reference getTarget();

   public void setOldRating(final Integer oldRating);

   public void setNewRating(final Integer newRating);

   public void setIncludedInStatistics(final Boolean includedInStatistics);

   public void setTarget(final Reference target);

   public static ReviewRatingSetMessageImpl of(){
      return new ReviewRatingSetMessageImpl();
   }


   public static ReviewRatingSetMessageImpl of(final ReviewRatingSetMessage template) {
      ReviewRatingSetMessageImpl instance = new ReviewRatingSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setOldRating(template.getOldRating());
      instance.setIncludedInStatistics(template.getIncludedInStatistics());
      instance.setNewRating(template.getNewRating());
      instance.setTarget(template.getTarget());
      return instance;
   }

}
