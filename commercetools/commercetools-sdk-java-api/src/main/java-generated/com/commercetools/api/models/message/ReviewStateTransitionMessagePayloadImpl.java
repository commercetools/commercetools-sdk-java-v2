
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewStateTransitionMessagePayloadImpl implements ReviewStateTransitionMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewStateTransitionMessagePayloadImpl(
            @JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState,
            @JsonProperty("newState") final com.commercetools.api.models.state.StateReference newState,
            @JsonProperty("oldIncludedInStatistics") final Boolean oldIncludedInStatistics,
            @JsonProperty("newIncludedInStatistics") final Boolean newIncludedInStatistics,
            @JsonProperty("target") final com.commercetools.api.models.common.Reference target,
            @JsonProperty("force") final Boolean force) {
        this.oldState = oldState;
        this.newState = newState;
        this.oldIncludedInStatistics = oldIncludedInStatistics;
        this.newIncludedInStatistics = newIncludedInStatistics;
        this.target = target;
        this.force = force;
        this.type = REVIEW_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public ReviewStateTransitionMessagePayloadImpl() {
        this.type = REVIEW_STATE_TRANSITION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getNewState() {
        return this.newState;
    }

    /**
     *  <p>Whether the old <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target before the state transition.</p>
     */

    public Boolean getOldIncludedInStatistics() {
        return this.oldIncludedInStatistics;
    }

    /**
     *  <p>Whether the new <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target after the state transition.</p>
     */

    public Boolean getNewIncludedInStatistics() {
        return this.newIncludedInStatistics;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     */

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

    public Boolean getForce() {
        return this.force;
    }

    public void setOldState(final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
    }

    public void setNewState(final com.commercetools.api.models.state.StateReference newState) {
        this.newState = newState;
    }

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics) {
        this.oldIncludedInStatistics = oldIncludedInStatistics;
    }

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics) {
        this.newIncludedInStatistics = newIncludedInStatistics;
    }

    public void setTarget(final com.commercetools.api.models.common.Reference target) {
        this.target = target;
    }

    public void setForce(final Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewStateTransitionMessagePayloadImpl that = (ReviewStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldState, that.oldState)
                .append(newState, that.newState)
                .append(oldIncludedInStatistics, that.oldIncludedInStatistics)
                .append(newIncludedInStatistics, that.newIncludedInStatistics)
                .append(target, that.target)
                .append(force, that.force)
                .append(type, that.type)
                .append(oldState, that.oldState)
                .append(newState, that.newState)
                .append(oldIncludedInStatistics, that.oldIncludedInStatistics)
                .append(newIncludedInStatistics, that.newIncludedInStatistics)
                .append(target, that.target)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(oldState)
                .append(newState)
                .append(oldIncludedInStatistics)
                .append(newIncludedInStatistics)
                .append(target)
                .append(force)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("oldState", oldState)
                .append("newState", newState)
                .append("oldIncludedInStatistics", oldIncludedInStatistics)
                .append("newIncludedInStatistics", newIncludedInStatistics)
                .append("target", target)
                .append("force", force)
                .build();
    }

    @Override
    public ReviewStateTransitionMessagePayload copyDeep() {
        return ReviewStateTransitionMessagePayload.deepCopy(this);
    }
}
