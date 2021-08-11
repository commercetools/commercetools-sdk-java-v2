
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewRatingSetMessagePayloadBuilder implements Builder<ReviewRatingSetMessagePayload> {

    @Nullable
    private Double oldRating;

    @Nullable
    private Double newRating;

    private Boolean includedInStatistics;

    @Nullable
    private com.commercetools.api.models.common.Reference target;

    public ReviewRatingSetMessagePayloadBuilder oldRating(@Nullable final Double oldRating) {
        this.oldRating = oldRating;
        return this;
    }

    public ReviewRatingSetMessagePayloadBuilder newRating(@Nullable final Double newRating) {
        this.newRating = newRating;
        return this;
    }

    public ReviewRatingSetMessagePayloadBuilder includedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }

    public ReviewRatingSetMessagePayloadBuilder target(
            @Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    @Nullable
    public Double getOldRating() {
        return this.oldRating;
    }

    @Nullable
    public Double getNewRating() {
        return this.newRating;
    }

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    @Nullable
    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public ReviewRatingSetMessagePayload build() {
        Objects.requireNonNull(includedInStatistics,
            ReviewRatingSetMessagePayload.class + ": includedInStatistics is missing");
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    /**
     * builds ReviewRatingSetMessagePayload without checking for non null required values
     */
    public ReviewRatingSetMessagePayload buildUnchecked() {
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    public static ReviewRatingSetMessagePayloadBuilder of() {
        return new ReviewRatingSetMessagePayloadBuilder();
    }

    public static ReviewRatingSetMessagePayloadBuilder of(final ReviewRatingSetMessagePayload template) {
        ReviewRatingSetMessagePayloadBuilder builder = new ReviewRatingSetMessagePayloadBuilder();
        builder.oldRating = template.getOldRating();
        builder.newRating = template.getNewRating();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.target = template.getTarget();
        return builder;
    }

}
