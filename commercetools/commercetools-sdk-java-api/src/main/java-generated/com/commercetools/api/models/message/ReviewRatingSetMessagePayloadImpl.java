
package com.commercetools.api.models.message;

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
public class ReviewRatingSetMessagePayloadImpl implements ReviewRatingSetMessagePayload, ModelBase {

    private String type;

    private Double oldRating;

    private Double newRating;

    private Boolean includedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    @JsonCreator
    ReviewRatingSetMessagePayloadImpl(@JsonProperty("oldRating") final Double oldRating,
            @JsonProperty("newRating") final Double newRating,
            @JsonProperty("includedInStatistics") final Boolean includedInStatistics,
            @JsonProperty("target") final com.commercetools.api.models.common.Reference target) {
        this.oldRating = oldRating;
        this.newRating = newRating;
        this.includedInStatistics = includedInStatistics;
        this.target = target;
        this.type = REVIEW_RATING_SET;
    }

    public ReviewRatingSetMessagePayloadImpl() {
        this.type = REVIEW_RATING_SET;
    }

    public String getType() {
        return this.type;
    }

    public Double getOldRating() {
        return this.oldRating;
    }

    public Double getNewRating() {
        return this.newRating;
    }

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public void setOldRating(final Double oldRating) {
        this.oldRating = oldRating;
    }

    public void setNewRating(final Double newRating) {
        this.newRating = newRating;
    }

    public void setIncludedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
    }

    public void setTarget(final com.commercetools.api.models.common.Reference target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewRatingSetMessagePayloadImpl that = (ReviewRatingSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldRating, that.oldRating)
                .append(newRating, that.newRating)
                .append(includedInStatistics, that.includedInStatistics)
                .append(target, that.target)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(oldRating)
                .append(newRating)
                .append(includedInStatistics)
                .append(target)
                .toHashCode();
    }

}
