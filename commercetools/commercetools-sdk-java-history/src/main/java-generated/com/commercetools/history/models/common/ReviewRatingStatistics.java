
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ReviewRatingStatistics
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingStatistics reviewRatingStatistics = ReviewRatingStatistics.builder()
 *             .averageRating(1)
 *             .highestRating(1)
 *             .lowestRating(1)
 *             .count(1)
 *             .ratingsDistribution(ratingsDistributionBuilder -> ratingsDistributionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewRatingStatisticsImpl.class)
public interface ReviewRatingStatistics {

    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     * @return averageRating
     */
    @NotNull
    @JsonProperty("averageRating")
    public Integer getAverageRating();

    /**
     *  <p>Highest rating of one target</p>
     * @return highestRating
     */
    @NotNull
    @JsonProperty("highestRating")
    public Integer getHighestRating();

    /**
     *  <p>Lowest rating of one target</p>
     * @return lowestRating
     */
    @NotNull
    @JsonProperty("lowestRating")
    public Integer getLowestRating();

    /**
     *  <p>Number of ratings taken into account</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>The full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     * @return ratingsDistribution
     */
    @NotNull
    @Valid
    @JsonProperty("ratingsDistribution")
    public Object getRatingsDistribution();

    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     * @param averageRating value to be set
     */

    public void setAverageRating(final Integer averageRating);

    /**
     *  <p>Highest rating of one target</p>
     * @param highestRating value to be set
     */

    public void setHighestRating(final Integer highestRating);

    /**
     *  <p>Lowest rating of one target</p>
     * @param lowestRating value to be set
     */

    public void setLowestRating(final Integer lowestRating);

    /**
     *  <p>Number of ratings taken into account</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>The full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     * @param ratingsDistribution value to be set
     */

    public void setRatingsDistribution(final Object ratingsDistribution);

    /**
     * factory method
     * @return instance of ReviewRatingStatistics
     */
    public static ReviewRatingStatistics of() {
        return new ReviewRatingStatisticsImpl();
    }

    /**
     * factory method to create a shallow copy ReviewRatingStatistics
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewRatingStatistics of(final ReviewRatingStatistics template) {
        ReviewRatingStatisticsImpl instance = new ReviewRatingStatisticsImpl();
        instance.setAverageRating(template.getAverageRating());
        instance.setHighestRating(template.getHighestRating());
        instance.setLowestRating(template.getLowestRating());
        instance.setCount(template.getCount());
        instance.setRatingsDistribution(template.getRatingsDistribution());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewRatingStatistics
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewRatingStatistics deepCopy(@Nullable final ReviewRatingStatistics template) {
        if (template == null) {
            return null;
        }
        ReviewRatingStatisticsImpl instance = new ReviewRatingStatisticsImpl();
        instance.setAverageRating(template.getAverageRating());
        instance.setHighestRating(template.getHighestRating());
        instance.setLowestRating(template.getLowestRating());
        instance.setCount(template.getCount());
        instance.setRatingsDistribution(template.getRatingsDistribution());
        return instance;
    }

    /**
     * builder factory method for ReviewRatingStatistics
     * @return builder
     */
    public static ReviewRatingStatisticsBuilder builder() {
        return ReviewRatingStatisticsBuilder.of();
    }

    /**
     * create builder for ReviewRatingStatistics instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewRatingStatisticsBuilder builder(final ReviewRatingStatistics template) {
        return ReviewRatingStatisticsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewRatingStatistics(Function<ReviewRatingStatistics, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingStatistics> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingStatistics>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingStatistics>";
            }
        };
    }
}
