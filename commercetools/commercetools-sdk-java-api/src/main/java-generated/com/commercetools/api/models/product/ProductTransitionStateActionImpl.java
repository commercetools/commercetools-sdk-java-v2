
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. Produces the ProductStateTransitionMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTransitionStateActionImpl implements ProductTransitionStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Boolean force;

    @JsonCreator
    ProductTransitionStateActionImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = TRANSITION_STATE;
    }

    public ProductTransitionStateActionImpl() {
        this.action = TRANSITION_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The State to transition to. If there is no existing State, this must be an initial State.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>If <code>true</code>, validations are disabled.</p>
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

        ProductTransitionStateActionImpl that = (ProductTransitionStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(state).append(force).toHashCode();
    }

}
