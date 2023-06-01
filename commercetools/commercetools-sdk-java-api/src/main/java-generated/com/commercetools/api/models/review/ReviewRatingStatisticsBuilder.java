package com.commercetools.api.models.review;

import java.lang.Object;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewRatingStatisticsBuilder implements Builder<ReviewRatingStatistics> {

    
    
    private Double averageRating;
    
    
    
    private Double highestRating;
    
    
    
    private Double lowestRating;
    
    
    
    private Integer count;
    
    
    
    private java.lang.Object ratingsDistribution;

    
    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     * @param averageRating value to be set
     * @return Builder
     */
    
    public ReviewRatingStatisticsBuilder averageRating( final Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }
    
    
    
    
    /**
     *  <p>Highest rating of one target</p>
     * @param highestRating value to be set
     * @return Builder
     */
    
    public ReviewRatingStatisticsBuilder highestRating( final Double highestRating) {
        this.highestRating = highestRating;
        return this;
    }
    
    
    
    
    /**
     *  <p>Lowest rating of one target</p>
     * @param lowestRating value to be set
     * @return Builder
     */
    
    public ReviewRatingStatisticsBuilder lowestRating( final Double lowestRating) {
        this.lowestRating = lowestRating;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of ratings taken into account</p>
     * @param count value to be set
     * @return Builder
     */
    
    public ReviewRatingStatisticsBuilder count( final Integer count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>Full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     * @param ratingsDistribution value to be set
     * @return Builder
     */
    
    public ReviewRatingStatisticsBuilder ratingsDistribution( final java.lang.Object ratingsDistribution) {
        this.ratingsDistribution = ratingsDistribution;
        return this;
    }
    
    

    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     * @return averageRating
     */
    
    
    public Double getAverageRating(){
        return this.averageRating;
    }
    
    /**
     *  <p>Highest rating of one target</p>
     * @return highestRating
     */
    
    
    public Double getHighestRating(){
        return this.highestRating;
    }
    
    /**
     *  <p>Lowest rating of one target</p>
     * @return lowestRating
     */
    
    
    public Double getLowestRating(){
        return this.lowestRating;
    }
    
    /**
     *  <p>Number of ratings taken into account</p>
     * @return count
     */
    
    
    public Integer getCount(){
        return this.count;
    }
    
    /**
     *  <p>Full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     * @return ratingsDistribution
     */
    
    
    public java.lang.Object getRatingsDistribution(){
        return this.ratingsDistribution;
    }

    /**
     * builds ReviewRatingStatistics with checking for non-null required values
     * @return ReviewRatingStatistics
     */
    public ReviewRatingStatistics build() {
        Objects.requireNonNull(averageRating, ReviewRatingStatistics.class + ": averageRating is missing");
        Objects.requireNonNull(highestRating, ReviewRatingStatistics.class + ": highestRating is missing");
        Objects.requireNonNull(lowestRating, ReviewRatingStatistics.class + ": lowestRating is missing");
        Objects.requireNonNull(count, ReviewRatingStatistics.class + ": count is missing");
        Objects.requireNonNull(ratingsDistribution, ReviewRatingStatistics.class + ": ratingsDistribution is missing");
        return new ReviewRatingStatisticsImpl(averageRating, highestRating, lowestRating, count, ratingsDistribution);
    }
    
    /**
     * builds ReviewRatingStatistics without checking for non-null required values
     * @return ReviewRatingStatistics
     */
    public ReviewRatingStatistics buildUnchecked() {
        return new ReviewRatingStatisticsImpl(averageRating, highestRating, lowestRating, count, ratingsDistribution);
    }

    /**
     * factory method for an instance of ReviewRatingStatisticsBuilder
     * @return builder 
     */
    public static ReviewRatingStatisticsBuilder of() {
        return new ReviewRatingStatisticsBuilder();
    }

    /**
     * create builder for ReviewRatingStatistics instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
