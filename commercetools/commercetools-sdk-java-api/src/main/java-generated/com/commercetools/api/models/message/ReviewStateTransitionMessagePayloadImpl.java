
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
public class ReviewStateTransitionMessagePayloadImpl implements ReviewStateTransitionMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

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

    public ReviewStateTransitionMessagePayloadImpl() {
        this.type = REVIEW_STATE_TRANSITION;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    public com.commercetools.api.models.state.StateReference getNewState() {
        return this.newState;
    }

    public Boolean getOldIncludedInStatistics() {
        return this.oldIncludedInStatistics;
    }

    public Boolean getNewIncludedInStatistics() {
        return this.newIncludedInStatistics;
    }

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

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

}
