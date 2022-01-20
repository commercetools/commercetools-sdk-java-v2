
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReviewRatingStatisticsImpl implements ReviewRatingStatistics, ModelBase {

    private Double averageRating;

    private Double highestRating;

    private Double lowestRating;

    private Integer count;

    private java.lang.Object ratingsDistribution;

    @JsonCreator
    ReviewRatingStatisticsImpl(@JsonProperty("averageRating") final Double averageRating,
            @JsonProperty("highestRating") final Double highestRating,
            @JsonProperty("lowestRating") final Double lowestRating, @JsonProperty("count") final Integer count,
            @JsonProperty("ratingsDistribution") final java.lang.Object ratingsDistribution) {
        this.averageRating = averageRating;
        this.highestRating = highestRating;
        this.lowestRating = lowestRating;
        this.count = count;
        this.ratingsDistribution = ratingsDistribution;
    }

    public ReviewRatingStatisticsImpl() {
    }

    /**
    *  <p>Average rating of one target
    *  This number is rounded with 5 decimals.</p>
    */
    public Double getAverageRating() {
        return this.averageRating;
    }

    /**
    *  <p>Highest rating of one target</p>
    */
    public Double getHighestRating() {
        return this.highestRating;
    }

    /**
    *  <p>Lowest rating of one target</p>
    */
    public Double getLowestRating() {
        return this.lowestRating;
    }

    /**
    *  <p>Number of ratings taken into account</p>
    */
    public Integer getCount() {
        return this.count;
    }

    /**
    *  <p>The full distribution of the ratings.
    *  The keys are the different ratings and the values are the count of reviews having this rating.
    *  Only the used ratings appear in this object.</p>
    */
    public java.lang.Object getRatingsDistribution() {
        return this.ratingsDistribution;
    }

    public void setAverageRating(final Double averageRating) {
        this.averageRating = averageRating;
    }

    public void setHighestRating(final Double highestRating) {
        this.highestRating = highestRating;
    }

    public void setLowestRating(final Double lowestRating) {
        this.lowestRating = lowestRating;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public void setRatingsDistribution(final java.lang.Object ratingsDistribution) {
        this.ratingsDistribution = ratingsDistribution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewRatingStatisticsImpl that = (ReviewRatingStatisticsImpl) o;

        return new EqualsBuilder().append(averageRating, that.averageRating)
                .append(highestRating, that.highestRating)
                .append(lowestRating, that.lowestRating)
                .append(count, that.count)
                .append(ratingsDistribution, that.ratingsDistribution)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(averageRating)
                .append(highestRating)
                .append(lowestRating)
                .append(count)
                .append(ratingsDistribution)
                .toHashCode();
    }

}
