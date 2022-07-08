
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingStatistics
 *
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
@JsonDeserialize(as = ReviewRatingStatisticsImpl.class)
public interface ReviewRatingStatistics {

    /**
     *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
     */
    @NotNull
    @JsonProperty("averageRating")
    public Double getAverageRating();

    /**
     *  <p>Highest rating of one target</p>
     */
    @NotNull
    @JsonProperty("highestRating")
    public Double getHighestRating();

    /**
     *  <p>Lowest rating of one target</p>
     */
    @NotNull
    @JsonProperty("lowestRating")
    public Double getLowestRating();

    /**
     *  <p>Number of ratings taken into account</p>
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("ratingsDistribution")
    public Object getRatingsDistribution();

    public void setAverageRating(final Double averageRating);

    public void setHighestRating(final Double highestRating);

    public void setLowestRating(final Double lowestRating);

    public void setCount(final Integer count);

    public void setRatingsDistribution(final Object ratingsDistribution);

    public static ReviewRatingStatistics of() {
        return new ReviewRatingStatisticsImpl();
    }

    public static ReviewRatingStatistics of(final ReviewRatingStatistics template) {
        ReviewRatingStatisticsImpl instance = new ReviewRatingStatisticsImpl();
        instance.setAverageRating(template.getAverageRating());
        instance.setHighestRating(template.getHighestRating());
        instance.setLowestRating(template.getLowestRating());
        instance.setCount(template.getCount());
        instance.setRatingsDistribution(template.getRatingsDistribution());
        return instance;
    }

    public static ReviewRatingStatisticsBuilder builder() {
        return ReviewRatingStatisticsBuilder.of();
    }

    public static ReviewRatingStatisticsBuilder builder(final ReviewRatingStatistics template) {
        return ReviewRatingStatisticsBuilder.of(template);
    }

    default <T> T withReviewRatingStatistics(Function<ReviewRatingStatistics, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingStatistics> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingStatistics>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingStatistics>";
            }
        };
    }
}
