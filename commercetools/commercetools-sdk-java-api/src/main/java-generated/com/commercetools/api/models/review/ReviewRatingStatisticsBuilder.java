
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingStatisticsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingStatistics reviewRatingStatistics = ReviewRatingStatistics.builder()
 *             .averageRating(0.3)
 *             .highestRating(0.3)
 *             .lowestRating(0.3)
 *             .count(1)
 *             .ratingsDistribution(ratingsDistributionBuilder -> ratingsDistributionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewRatingStatisticsBuilder implements Builder<ReviewRatingStatistics> {

    private Double averageRating;

    private Double highestRating;

    private Double lowestRating;

    private Integer count;

    private java.lang.Object ratingsDistribution;

    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     */

    public ReviewRatingStatisticsBuilder averageRating(final Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    /**
     *  <p>Highest rating of one target</p>
     */

    public ReviewRatingStatisticsBuilder highestRating(final Double highestRating) {
        this.highestRating = highestRating;
        return this;
    }

    /**
     *  <p>Lowest rating of one target</p>
     */

    public ReviewRatingStatisticsBuilder lowestRating(final Double lowestRating) {
        this.lowestRating = lowestRating;
        return this;
    }

    /**
     *  <p>Number of ratings taken into account</p>
     */

    public ReviewRatingStatisticsBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     */

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
