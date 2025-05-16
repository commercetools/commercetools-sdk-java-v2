
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
 *  <p>Generated after a successful Transition State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductStateTransitionMessagePayloadImpl implements ProductStateTransitionMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductStateTransitionMessagePayloadImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.type = PRODUCT_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public ProductStateTransitionMessagePayloadImpl() {
        this.type = PRODUCT_STATE_TRANSITION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Product State after the Transition State update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */

    public Boolean getForce() {
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
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

        ProductStateTransitionMessagePayloadImpl that = (ProductStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(state, that.state)
                .append(force, that.force)
                .append(type, that.type)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(state).append(force).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("state", state)
                .append("force", force)
                .build();
    }

    @Override
    public ProductStateTransitionMessagePayload copyDeep() {
        return ProductStateTransitionMessagePayload.deepCopy(this);
    }
}
