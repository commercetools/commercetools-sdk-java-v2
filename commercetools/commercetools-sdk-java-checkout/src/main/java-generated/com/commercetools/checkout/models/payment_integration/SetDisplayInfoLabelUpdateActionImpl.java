
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
 *  <p>Sets the display info label of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoLabelUpdateActionImpl implements SetDisplayInfoLabelUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDisplayInfoLabelUpdateActionImpl(
            @JsonProperty("label") final com.commercetools.checkout.models.common.LocalizedString label) {
        this.label = label;
        this.action = SET_DISPLAY_INFO_LABEL;
    }

    /**
     * create empty instance
     */
    public SetDisplayInfoLabelUpdateActionImpl() {
        this.action = SET_DISPLAY_INFO_LABEL;
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

    public com.commercetools.checkout.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setLabel(final com.commercetools.checkout.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDisplayInfoLabelUpdateActionImpl that = (SetDisplayInfoLabelUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(label, that.label)
                .append(action, that.action)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("label", label)
                .build();
    }

    @Override
    public SetDisplayInfoLabelUpdateAction copyDeep() {
        return SetDisplayInfoLabelUpdateAction.deepCopy(this);
    }
}
