
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.review.Review;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create Review request.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ReviewCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewCreatedMessagePayloadImpl.class)
public interface ReviewCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ReviewCreatedMessagePayload
     */
    String REVIEW_CREATED = "ReviewCreated";

    /**
     *  <p>Review that was created.</p>
     * @return review
     */
    @NotNull
    @Valid
    @JsonProperty("review")
    public Review getReview();

    /**
     *  <p>Review that was created.</p>
     * @param review value to be set
     */

    public void setReview(final Review review);

    /**
     * factory method
     * @return instance of ReviewCreatedMessagePayload
     */
    public static ReviewCreatedMessagePayload of() {
        return new ReviewCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ReviewCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewCreatedMessagePayload of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadImpl instance = new ReviewCreatedMessagePayloadImpl();
        instance.setReview(template.getReview());
        return instance;
    }

    public ReviewCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ReviewCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewCreatedMessagePayload deepCopy(@Nullable final ReviewCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ReviewCreatedMessagePayloadImpl instance = new ReviewCreatedMessagePayloadImpl();
        instance.setReview(com.commercetools.api.models.review.Review.deepCopy(template.getReview()));
        return instance;
    }

    /**
     * builder factory method for ReviewCreatedMessagePayload
     * @return builder
     */
    public static ReviewCreatedMessagePayloadBuilder builder() {
        return ReviewCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ReviewCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewCreatedMessagePayloadBuilder builder(final ReviewCreatedMessagePayload template) {
        return ReviewCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewCreatedMessagePayload(Function<ReviewCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewCreatedMessagePayload>";
            }
        };
    }
}
