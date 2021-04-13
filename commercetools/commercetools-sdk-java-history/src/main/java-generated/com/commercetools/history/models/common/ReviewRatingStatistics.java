
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewRatingStatisticsImpl.class)
public interface ReviewRatingStatistics {

    /**
    *  <p>Average rating of one target This number is rounded with 5 decimals.</p>
    */
    @NotNull
    @JsonProperty("averageRating")
    public Integer getAverageRating();

    /**
    *  <p>Highest rating of one target</p>
    */
    @NotNull
    @JsonProperty("highestRating")
    public Integer getHighestRating();

    /**
    *  <p>Lowest rating of one target</p>
    */
    @NotNull
    @JsonProperty("lowestRating")
    public Integer getLowestRating();

    /**
    *  <p>Number of ratings taken into account</p>
    */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
    *  <p>The full distribution of the ratings. The keys are the different ratings and the values are the count of reviews having this rating. Only the used ratings appear in this object.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("ratingsDistribution")
    public Object getRatingsDistribution();

    public void setAverageRating(final Integer averageRating);

    public void setHighestRating(final Integer highestRating);

    public void setLowestRating(final Integer lowestRating);

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
}
