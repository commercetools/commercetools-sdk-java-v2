
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
 *  <p>Sets the automated reversal configuration status of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAutomatedReversalConfigurationStatusUpdateActionImpl
        implements SetAutomatedReversalConfigurationStatusUpdateAction, ModelBase {

    private String action;

    private String status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAutomatedReversalConfigurationStatusUpdateActionImpl(@JsonProperty("status") final String status) {
        this.status = status;
        this.action = SET_AUTOMATED_REVERSAL_CONFIGURATION_STATUS;
    }

    /**
     * create empty instance
     */
    public SetAutomatedReversalConfigurationStatusUpdateActionImpl() {
        this.action = SET_AUTOMATED_REVERSAL_CONFIGURATION_STATUS;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set as the automated reversal configuration status of the PaymentIntegration.</p>
     */

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAutomatedReversalConfigurationStatusUpdateActionImpl that = (SetAutomatedReversalConfigurationStatusUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(status, that.status)
                .append(action, that.action)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("status", status)
                .build();
    }

    @Override
    public SetAutomatedReversalConfigurationStatusUpdateAction copyDeep() {
        return SetAutomatedReversalConfigurationStatusUpdateAction.deepCopy(this);
    }
}
