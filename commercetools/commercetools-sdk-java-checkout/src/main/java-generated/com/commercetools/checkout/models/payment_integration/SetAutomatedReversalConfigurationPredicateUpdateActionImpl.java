
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
 *  <p>Sets the automated reversal configuration predicate of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAutomatedReversalConfigurationPredicateUpdateActionImpl
        implements SetAutomatedReversalConfigurationPredicateUpdateAction, ModelBase {

    private String action;

    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAutomatedReversalConfigurationPredicateUpdateActionImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.action = SET_AUTOMATED_REVERSAL_CONFIGURATION_PREDICATE;
    }

    /**
     * create empty instance
     */
    public SetAutomatedReversalConfigurationPredicateUpdateActionImpl() {
        this.action = SET_AUTOMATED_REVERSAL_CONFIGURATION_PREDICATE;
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

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAutomatedReversalConfigurationPredicateUpdateActionImpl that = (SetAutomatedReversalConfigurationPredicateUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(predicate, that.predicate)
                .append(action, that.action)
                .append(predicate, that.predicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(predicate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("predicate", predicate)
                .build();
    }

    @Override
    public SetAutomatedReversalConfigurationPredicateUpdateAction copyDeep() {
        return SetAutomatedReversalConfigurationPredicateUpdateAction.deepCopy(this);
    }
}
