
package com.commercetools.api.models.state;

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
 * StateChangeTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateChangeTypeActionImpl implements StateChangeTypeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.state.StateTypeEnum type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StateChangeTypeActionImpl(@JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        this.action = CHANGE_TYPE;
    }

    /**
     * create empty instance
     */
    public StateChangeTypeActionImpl() {
        this.action = CHANGE_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Resource or object types the State shall be assigned to. Must not be empty.</p>
     */

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    public void setType(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateChangeTypeActionImpl that = (StateChangeTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(type, that.type)
                .append(action, that.action)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("type", type)
                .build();
    }

    @Override
    public StateChangeTypeAction copyDeep() {
        return StateChangeTypeAction.deepCopy(this);
    }
}
