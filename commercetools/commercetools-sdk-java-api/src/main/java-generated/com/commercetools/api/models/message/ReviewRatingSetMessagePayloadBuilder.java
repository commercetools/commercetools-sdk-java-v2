
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingSetMessagePayloadBuilder
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
public class ReviewRatingSetMessagePayloadBuilder implements Builder<ReviewRatingSetMessagePayload> {

    @Nullable
    private Double oldRating;

    @Nullable
    private Double newRating;

    private Boolean includedInStatistics;

    @Nullable
    private com.commercetools.api.models.common.Reference target;

    /**
     *  <p>The <code>rating</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetRatingAction" rel="nofollow">Set Rating</a> update action.</p>
     * @param oldRating value to be set
     * @return Builder
     */

    public ReviewRatingSetMessagePayloadBuilder oldRating(@Nullable final Double oldRating) {
        this.oldRating = oldRating;
        return this;
    }

    /**
     *  <p>The <code>rating</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetRatingAction" rel="nofollow">Set Rating</a> update action.</p>
     * @param newRating value to be set
     * @return Builder
     */

    public ReviewRatingSetMessagePayloadBuilder newRating(@Nullable final Double newRating) {
        this.newRating = newRating;
        return this;
    }

    /**
     *  <p>Whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the ratings statistics of the target.</p>
     * @param includedInStatistics value to be set
     * @return Builder
     */

    public ReviewRatingSetMessagePayloadBuilder includedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     * @param target value to be set
     * @return Builder
     */

    public ReviewRatingSetMessagePayloadBuilder target(
            @Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public ReviewRatingSetMessagePayloadBuilder target(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <code>rating</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetRatingAction" rel="nofollow">Set Rating</a> update action.</p>
     * @return oldRating
     */

    @Nullable
    public Double getOldRating() {
        return this.oldRating;
    }

    /**
     *  <p>The <code>rating</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetRatingAction" rel="nofollow">Set Rating</a> update action.</p>
     * @return newRating
     */

    @Nullable
    public Double getNewRating() {
        return this.newRating;
    }

    /**
     *  <p>Whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the ratings statistics of the target.</p>
     * @return includedInStatistics
     */

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     * @return target
     */

    @Nullable
    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    /**
     * builds ReviewRatingSetMessagePayload with checking for non-null required values
     * @return ReviewRatingSetMessagePayload
     */
    public ReviewRatingSetMessagePayload build() {
        Objects.requireNonNull(includedInStatistics,
            ReviewRatingSetMessagePayload.class + ": includedInStatistics is missing");
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    /**
     * builds ReviewRatingSetMessagePayload without checking for non-null required values
     * @return ReviewRatingSetMessagePayload
     */
    public ReviewRatingSetMessagePayload buildUnchecked() {
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    /**
     * factory method for an instance of ReviewRatingSetMessagePayloadBuilder
     * @return builder
     */
    public static ReviewRatingSetMessagePayloadBuilder of() {
        return new ReviewRatingSetMessagePayloadBuilder();
    }

    /**
     * create builder for ReviewRatingSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewRatingSetMessagePayloadBuilder of(final ReviewRatingSetMessagePayload template) {
        ReviewRatingSetMessagePayloadBuilder builder = new ReviewRatingSetMessagePayloadBuilder();
        builder.oldRating = template.getOldRating();
        builder.newRating = template.getNewRating();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.target = template.getTarget();
        return builder;
    }

}
