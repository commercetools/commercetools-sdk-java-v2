
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Set Rating update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewRatingSetMessagePayloadImpl implements ReviewRatingSetMessagePayload, ModelBase {

    private String type;

    private Double oldRating;

    private Double newRating;

    private Boolean includedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public ReviewRatingSetMessagePayloadImpl() {
        this.type = REVIEW_RATING_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>rating</code> of the Review before the Set Rating update action.</p>
     */

    public Double getOldRating() {
        return this.oldRating;
    }

    /**
     *  <p>The <code>rating</code> of the Review after the Set Rating update action.</p>
     */

    public Double getNewRating() {
        return this.newRating;
    }

    /**
     *  <p>Whether the Review was taken into account in the ratings statistics of the target.</p>
     */

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     */

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
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("oldRating", oldRating)
                .append("newRating", newRating)
                .append("includedInStatistics", includedInStatistics)
                .append("target", target)
                .build();
    }

}
