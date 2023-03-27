
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

/**
 *  <p>Generated after a successful Create Review request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewCreatedMessage reviewCreatedMessage = ReviewCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .review(reviewBuilder -> reviewBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewCreatedMessageImpl.class)
public interface ReviewCreatedMessage extends Message {

    /**
     * discriminator value for ReviewCreatedMessage
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
     * @return instance of ReviewCreatedMessage
     */
    public static ReviewCreatedMessage of() {
        return new ReviewCreatedMessageImpl();
    }

    /**
     * factory method to copy an instance of ReviewCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * builder factory method for ReviewCreatedMessage
     * @return builder
     */
    public static ReviewCreatedMessageBuilder builder() {
        return ReviewCreatedMessageBuilder.of();
    }

    /**
     * create builder for ReviewCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewCreatedMessageBuilder builder(final ReviewCreatedMessage template) {
        return ReviewCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewCreatedMessage(Function<ReviewCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewCreatedMessage>";
            }
        };
    }
}
