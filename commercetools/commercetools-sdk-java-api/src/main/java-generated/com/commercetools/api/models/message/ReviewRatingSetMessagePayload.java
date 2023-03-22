
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

/**
 *  <p>Generated after a successful Set Rating update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingSetMessagePayload reviewRatingSetMessagePayload = ReviewRatingSetMessagePayload.builder()
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewRatingSetMessagePayloadImpl.class)
public interface ReviewRatingSetMessagePayload extends MessagePayload {

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

    public void setOldRating(final Double oldRating);

    public void setNewRating(final Double newRating);

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    public void setTarget(final Reference target);

    public static ReviewRatingSetMessagePayload of() {
        return new ReviewRatingSetMessagePayloadImpl();
    }

    public static ReviewRatingSetMessagePayload of(final ReviewRatingSetMessagePayload template) {
        ReviewRatingSetMessagePayloadImpl instance = new ReviewRatingSetMessagePayloadImpl();
        instance.setOldRating(template.getOldRating());
        instance.setNewRating(template.getNewRating());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static ReviewRatingSetMessagePayloadBuilder builder() {
        return ReviewRatingSetMessagePayloadBuilder.of();
    }

    public static ReviewRatingSetMessagePayloadBuilder builder(final ReviewRatingSetMessagePayload template) {
        return ReviewRatingSetMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewRatingSetMessagePayload(Function<ReviewRatingSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingSetMessagePayload>";
            }
        };
    }
}
