
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Transition to a new State. This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewStateTransitionMessage" rel="nofollow">Review State Transition</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewTransitionStateActionImpl implements ReviewTransitionStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewTransitionStateActionImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = TRANSITION_STATE;
    }

    /**
     * create empty instance
     */
    public ReviewTransitionStateActionImpl() {
        this.action = TRANSITION_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the <a href="https://docs.commercetools.com/apis/ctp:api:type:StateRoleEnum" rel="nofollow">role</a> <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Switch validations on or off.</p>
     */

    public Boolean getForce() {
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
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

        ReviewTransitionStateActionImpl that = (ReviewTransitionStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(state, that.state)
                .append(force, that.force)
                .append(action, that.action)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(state).append(force).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("state", state)
                .append("force", force)
                .build();
    }

    @Override
    public ReviewTransitionStateAction copyDeep() {
        return ReviewTransitionStateAction.deepCopy(this);
    }
}
