
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentStatusStateTransitionMessagePayloadImpl
        implements PaymentStatusStateTransitionMessagePayload {

    private String type;

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    @JsonCreator
    PaymentStatusStateTransitionMessagePayloadImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.type = PAYMENT_STATUS_STATE_TRANSITION;
    }

    public PaymentStatusStateTransitionMessagePayloadImpl() {
        this.type = PAYMENT_STATUS_STATE_TRANSITION;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public Boolean getForce() {
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setForce(final Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentStatusStateTransitionMessagePayloadImpl that = (PaymentStatusStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(state).append(force).toHashCode();
    }

}
