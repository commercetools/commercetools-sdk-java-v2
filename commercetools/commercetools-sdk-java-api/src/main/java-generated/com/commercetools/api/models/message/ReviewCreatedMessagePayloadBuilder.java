
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewCreatedMessagePayload reviewCreatedMessagePayload = ReviewCreatedMessagePayload.builder()
 *             .review(reviewBuilder -> reviewBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewCreatedMessagePayloadBuilder implements Builder<ReviewCreatedMessagePayload> {

    private com.commercetools.api.models.review.Review review;

    /**
     *  <p>Review that was created.</p>
     */

    public ReviewCreatedMessagePayloadBuilder review(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.review = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Review that was created.</p>
     */

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
