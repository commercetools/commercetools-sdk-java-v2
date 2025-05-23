
package com.commercetools.api.models.project;

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
 * ProjectSetShippingRateInputTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetShippingRateInputTypeActionImpl implements ProjectSetShippingRateInputTypeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetShippingRateInputTypeActionImpl(
            @JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        this.action = SET_SHIPPING_RATE_INPUT_TYPE;
    }

    /**
     * create empty instance
     */
    public ProjectSetShippingRateInputTypeActionImpl() {
        this.action = SET_SHIPPING_RATE_INPUT_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    public void setShippingRateInputType(
            final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetShippingRateInputTypeActionImpl that = (ProjectSetShippingRateInputTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingRateInputType, that.shippingRateInputType)
                .append(action, that.action)
                .append(shippingRateInputType, that.shippingRateInputType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingRateInputType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingRateInputType", shippingRateInputType)
                .build();
    }

    @Override
    public ProjectSetShippingRateInputTypeAction copyDeep() {
        return ProjectSetShippingRateInputTypeAction.deepCopy(this);
    }
}
