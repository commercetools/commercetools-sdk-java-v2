
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewRatingStatisticsBuilder implements Builder<ReviewRatingStatistics> {

    private Double averageRating;

    private Double highestRating;

    private Double lowestRating;

    private Integer count;

    private java.lang.Object ratingsDistribution;

    public ReviewRatingStatisticsBuilder averageRating(final Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public ReviewRatingStatisticsBuilder highestRating(final Double highestRating) {
        this.highestRating = highestRating;
        return this;
    }

    public ReviewRatingStatisticsBuilder lowestRating(final Double lowestRating) {
        this.lowestRating = lowestRating;
        return this;
    }

    public ReviewRatingStatisticsBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    public ReviewRatingStatisticsBuilder ratingsDistribution(final java.lang.Object ratingsDistribution) {
        this.ratingsDistribution = ratingsDistribution;
        return this;
    }

    public Double getAverageRating() {
        return this.averageRating;
    }

    public Double getHighestRating() {
        return this.highestRating;
    }

    public Double getLowestRating() {
        return this.lowestRating;
    }

    public Integer getCount() {
        return this.count;
    }

    public java.lang.Object getRatingsDistribution() {
        return this.ratingsDistribution;
    }

    public ReviewRatingStatistics build() {
        Objects.requireNonNull(averageRating, ReviewRatingStatistics.class + ": averageRating is missing");
        Objects.requireNonNull(highestRating, ReviewRatingStatistics.class + ": highestRating is missing");
        Objects.requireNonNull(lowestRating, ReviewRatingStatistics.class + ": lowestRating is missing");
        Objects.requireNonNull(count, ReviewRatingStatistics.class + ": count is missing");
        Objects.requireNonNull(ratingsDistribution, ReviewRatingStatistics.class + ": ratingsDistribution is missing");
        return new ReviewRatingStatisticsImpl(averageRating, highestRating, lowestRating, count, ratingsDistribution);
    }

    /**
     * builds ReviewRatingStatistics without checking for non null required values
     */
    public ReviewRatingStatistics buildUnchecked() {
        return new ReviewRatingStatisticsImpl(averageRating, highestRating, lowestRating, count, ratingsDistribution);
    }

    public static ReviewRatingStatisticsBuilder of() {
        return new ReviewRatingStatisticsBuilder();
    }

    public static ReviewRatingStatisticsBuilder of(final ReviewRatingStatistics template) {
        ReviewRatingStatisticsBuilder builder = new ReviewRatingStatisticsBuilder();
        builder.averageRating = template.getAverageRating();
        builder.highestRating = template.getHighestRating();
        builder.lowestRating = template.getLowestRating();
        builder.count = template.getCount();
        builder.ratingsDistribution = template.getRatingsDistribution();
        return builder;
    }

}
