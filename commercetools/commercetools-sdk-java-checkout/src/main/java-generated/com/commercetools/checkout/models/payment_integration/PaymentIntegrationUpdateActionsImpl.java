
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
 *  <p>PaymentIntegrationUpdateActions</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationUpdateActionsImpl implements PaymentIntegrationUpdateActions, ModelBase {

    private Integer version;

    private java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntegrationUpdateActionsImpl(@JsonProperty("version") final Integer version,
            @JsonProperty("actions") final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    /**
     * create empty instance
     */
    public PaymentIntegrationUpdateActionsImpl() {
    }

    /**
     *  <p>Expected version of the PaymentIntegration on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     */

    public java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    public void setActions(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntegrationUpdateActionsImpl that = (PaymentIntegrationUpdateActionsImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(actions, that.actions)
                .append(version, that.version)
                .append(actions, that.actions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("actions", actions)
                .build();
    }

    @Override
    public PaymentIntegrationUpdateActions copyDeep() {
        return PaymentIntegrationUpdateActions.deepCopy(this);
    }
}
