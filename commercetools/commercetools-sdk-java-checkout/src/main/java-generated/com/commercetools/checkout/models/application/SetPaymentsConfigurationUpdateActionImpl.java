
package com.commercetools.checkout.models.application;

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
 * SetPaymentsConfigurationUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPaymentsConfigurationUpdateActionImpl implements SetPaymentsConfigurationUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetPaymentsConfigurationUpdateActionImpl(
            @JsonProperty("paymentsConfiguration") final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
        this.action = SET_PAYMENTS_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public SetPaymentsConfigurationUpdateActionImpl() {
        this.action = SET_PAYMENTS_CONFIGURATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New payments configuration for the Application.</p>
     */

    public com.commercetools.checkout.models.application.PaymentsConfiguration getPaymentsConfiguration() {
        return this.paymentsConfiguration;
    }

    public void setPaymentsConfiguration(
            final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetPaymentsConfigurationUpdateActionImpl that = (SetPaymentsConfigurationUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentsConfiguration, that.paymentsConfiguration)
                .append(action, that.action)
                .append(paymentsConfiguration, that.paymentsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentsConfiguration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentsConfiguration", paymentsConfiguration)
                .build();
    }

    @Override
    public SetPaymentsConfigurationUpdateAction copyDeep() {
        return SetPaymentsConfigurationUpdateAction.deepCopy(this);
    }
}
