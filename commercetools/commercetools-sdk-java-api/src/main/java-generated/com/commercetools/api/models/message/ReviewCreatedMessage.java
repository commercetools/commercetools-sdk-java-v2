
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.review.Review;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewCreatedMessageImpl.class)
public interface ReviewCreatedMessage extends Message {

    String REVIEW_CREATED = "ReviewCreated";

    @NotNull
    @Valid
    @JsonProperty("review")
    public Review getReview();

    public void setReview(final Review review);

    public static ReviewCreatedMessage of() {
        return new ReviewCreatedMessageImpl();
    }

    public static ReviewCreatedMessage of(final ReviewCreatedMessage template) {
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

    public static ReviewCreatedMessageBuilder builder() {
        return ReviewCreatedMessageBuilder.of();
    }

    public static ReviewCreatedMessageBuilder builder(final ReviewCreatedMessage template) {
        return ReviewCreatedMessageBuilder.of(template);
    }

    default <T> T withReviewCreatedMessage(Function<ReviewCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewCreatedMessage>";
            }
        };
    }
}
