
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Sets the name of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetNameUpdateActionImpl implements SetNameUpdateAction, ModelBase {

    private String action;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetNameUpdateActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = SET_NAME;
    }

    /**
     * create empty instance
     */
    public SetNameUpdateActionImpl() {
        this.action = SET_NAME;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set as the name of the PaymentIntegration.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetNameUpdateActionImpl that = (SetNameUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(action, that.action)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("name", name)
                .build();
    }

    @Override
    public SetNameUpdateAction copyDeep() {
        return SetNameUpdateAction.deepCopy(this);
    }
}
