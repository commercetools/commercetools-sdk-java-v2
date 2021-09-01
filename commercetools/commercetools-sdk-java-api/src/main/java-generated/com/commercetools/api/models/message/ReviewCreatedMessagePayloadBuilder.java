
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewCreatedMessagePayloadBuilder implements Builder<ReviewCreatedMessagePayload> {

    private com.commercetools.api.models.review.Review review;

    public ReviewCreatedMessagePayloadBuilder review(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.review = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build();
        return this;
    }

    public ReviewCreatedMessagePayloadBuilder review(final com.commercetools.api.models.review.Review review) {
        this.review = review;
        return this;
    }

    public com.commercetools.api.models.review.Review getReview() {
        return this.review;
    }

    public ReviewCreatedMessagePayload build() {
        Objects.requireNonNull(review, ReviewCreatedMessagePayload.class + ": review is missing");
        return new ReviewCreatedMessagePayloadImpl(review);
    }

    /**
     * builds ReviewCreatedMessagePayload without checking for non null required values
     */
    public ReviewCreatedMessagePayload buildUnchecked() {
        return new ReviewCreatedMessagePayloadImpl(review);
    }

    public static ReviewCreatedMessagePayloadBuilder of() {
        return new ReviewCreatedMessagePayloadBuilder();
    }

    public static ReviewCreatedMessagePayloadBuilder of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadBuilder builder = new ReviewCreatedMessagePayloadBuilder();
        builder.review = template.getReview();
        return builder;
    }

}
