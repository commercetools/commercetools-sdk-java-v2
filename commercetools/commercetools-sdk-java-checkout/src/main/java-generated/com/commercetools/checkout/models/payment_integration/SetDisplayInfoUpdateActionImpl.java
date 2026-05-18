
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
 * SetDisplayInfoUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoUpdateActionImpl implements SetDisplayInfoUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDisplayInfoUpdateActionImpl(
            @JsonProperty("displayInfo") final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        this.action = SET_DISPLAY_INFO;
    }

    /**
     * create empty instance
     */
    public SetDisplayInfoUpdateActionImpl() {
        this.action = SET_DISPLAY_INFO;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.checkout.models.payment_integration.DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public void setDisplayInfo(final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDisplayInfoUpdateActionImpl that = (SetDisplayInfoUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(displayInfo, that.displayInfo)
                .append(action, that.action)
                .append(displayInfo, that.displayInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(displayInfo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("displayInfo", displayInfo)
                .build();
    }

    @Override
    public SetDisplayInfoUpdateAction copyDeep() {
        return SetDisplayInfoUpdateAction.deepCopy(this);
    }
}
