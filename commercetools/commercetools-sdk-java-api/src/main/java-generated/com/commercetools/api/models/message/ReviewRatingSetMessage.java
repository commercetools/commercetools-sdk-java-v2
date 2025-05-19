
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Rating update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingSetMessage reviewRatingSetMessage = ReviewRatingSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ReviewRatingSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewRatingSetMessageImpl.class)
public interface ReviewRatingSetMessage extends Message {

    /**
     * discriminator value for ReviewRatingSetMessage
     */
    String REVIEW_RATING_SET = "ReviewRatingSet";

    /**
     *  <p>The <code>rating</code> of the Review before the Set Rating update action.</p>
     * @return oldRating
     */

    @JsonProperty("oldRating")
    public Double getOldRating();

    /**
     *  <p>The <code>rating</code> of the Review after the Set Rating update action.</p>
     * @return newRating
     */

    @JsonProperty("newRating")
    public Double getNewRating();

    /**
     *  <p>Whether the Review was taken into account in the ratings statistics of the target.</p>
     * @return includedInStatistics
     */
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    /**
     *  <p>The <code>rating</code> of the Review before the Set Rating update action.</p>
     * @param oldRating value to be set
     */

    public void setOldRating(final Double oldRating);

    /**
     *  <p>The <code>rating</code> of the Review after the Set Rating update action.</p>
     * @param newRating value to be set
     */

    public void setNewRating(final Double newRating);

    /**
     *  <p>Whether the Review was taken into account in the ratings statistics of the target.</p>
     * @param includedInStatistics value to be set
     */

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @param target value to be set
     */

    public void setTarget(final Reference target);

    /**
     * factory method
     * @return instance of ReviewRatingSetMessage
     */
    public static ReviewRatingSetMessage of() {
        return new ReviewRatingSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ReviewRatingSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    public ReviewRatingSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ReviewRatingSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewRatingSetMessage deepCopy(@Nullable final ReviewRatingSetMessage template) {
        if (template == null) {
            return null;
        }
        ReviewRatingSetMessageImpl instance = new ReviewRatingSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setOldRating(template.getOldRating());
        instance.setNewRating(template.getNewRating());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setTarget(com.commercetools.api.models.common.Reference.deepCopy(template.getTarget()));
        return instance;
    }

    /**
     * builder factory method for ReviewRatingSetMessage
     * @return builder
     */
    public static ReviewRatingSetMessageBuilder builder() {
        return ReviewRatingSetMessageBuilder.of();
    }

    /**
     * create builder for ReviewRatingSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewRatingSetMessageBuilder builder(final ReviewRatingSetMessage template) {
        return ReviewRatingSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewRatingSetMessage(Function<ReviewRatingSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingSetMessage>";
            }
        };
    }
}
