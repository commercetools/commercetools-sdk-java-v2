
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
@JsonDeserialize(as = ReviewCreatedMessagePayloadImpl.class)
public interface ReviewCreatedMessagePayload extends MessagePayload {

    String REVIEW_CREATED = "ReviewCreated";

    @NotNull
    @Valid
    @JsonProperty("review")
    public Review getReview();

    public void setReview(final Review review);

    public static ReviewCreatedMessagePayload of() {
        return new ReviewCreatedMessagePayloadImpl();
    }

    public static ReviewCreatedMessagePayload of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadImpl instance = new ReviewCreatedMessagePayloadImpl();
        instance.setReview(template.getReview());
        return instance;
    }

    public static ReviewCreatedMessagePayloadBuilder builder() {
        return ReviewCreatedMessagePayloadBuilder.of();
    }

    public static ReviewCreatedMessagePayloadBuilder builder(final ReviewCreatedMessagePayload template) {
        return ReviewCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewCreatedMessagePayload(Function<ReviewCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
