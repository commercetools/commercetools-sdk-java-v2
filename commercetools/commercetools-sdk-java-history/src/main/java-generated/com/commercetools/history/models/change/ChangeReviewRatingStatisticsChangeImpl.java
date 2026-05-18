
package com.commercetools.history.models.change;

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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetRatingAction" rel="nofollow">Set Rating</a> update action is performed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeReviewRatingStatisticsChangeImpl implements ChangeReviewRatingStatisticsChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ReviewRatingStatistics previousValue;

    private com.commercetools.history.models.common.ReviewRatingStatistics nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeReviewRatingStatisticsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ReviewRatingStatistics previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ReviewRatingStatistics nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_REVIEW_RATING_STATISTICS_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeReviewRatingStatisticsChangeImpl() {
        this.type = CHANGE_REVIEW_RATING_STATISTICS_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.ReviewRatingStatistics getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ReviewRatingStatistics getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ReviewRatingStatistics previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ReviewRatingStatistics nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeReviewRatingStatisticsChangeImpl that = (ChangeReviewRatingStatisticsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ChangeReviewRatingStatisticsChange copyDeep() {
        return ChangeReviewRatingStatisticsChange.deepCopy(this);
    }
}
