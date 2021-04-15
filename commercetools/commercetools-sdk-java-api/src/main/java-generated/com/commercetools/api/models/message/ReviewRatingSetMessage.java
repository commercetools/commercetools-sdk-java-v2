
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewRatingSetMessageImpl.class)
public interface ReviewRatingSetMessage extends Message {

    String REVIEW_RATING_SET = "ReviewRatingSet";

    @JsonProperty("oldRating")
    public Double getOldRating();

    @JsonProperty("newRating")
    public Double getNewRating();

    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    public void setOldRating(final Double oldRating);

    public void setNewRating(final Double newRating);

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    public void setTarget(final Reference target);

    public static ReviewRatingSetMessage of() {
        return new ReviewRatingSetMessageImpl();
    }

    public static ReviewRatingSetMessage of(final ReviewRatingSetMessage template) {
        ReviewRatingSetMessageImpl instance = new ReviewRatingSetMessageImpl();
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
        instance.setOldRating(template.getOldRating());
        instance.setNewRating(template.getNewRating());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static ReviewRatingSetMessageBuilder builder() {
        return ReviewRatingSetMessageBuilder.of();
    }

    public static ReviewRatingSetMessageBuilder builder(final ReviewRatingSetMessage template) {
        return ReviewRatingSetMessageBuilder.of(template);
    }

    default <T> T withReviewRatingSetMessage(Function<ReviewRatingSetMessage, T> helper) {
        return helper.apply(this);
    }
}
