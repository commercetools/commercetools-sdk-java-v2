
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StateSetNameActionImpl implements StateSetNameAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    StateSetNameActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.action = SET_NAME;
    }

    public StateSetNameActionImpl() {
        this.action = SET_NAME;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Value to set.
    *  If empty, any existing value will be removed.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateSetNameActionImpl that = (StateSetNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}
