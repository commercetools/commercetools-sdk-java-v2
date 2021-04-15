
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentStatusImpl implements PaymentStatus {

    private String interfaceCode;

    private String interfaceText;

    private com.commercetools.api.models.state.StateReference state;

    @JsonCreator
    PaymentStatusImpl(@JsonProperty("interfaceCode") final String interfaceCode,
            @JsonProperty("interfaceText") final String interfaceText,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state) {
        this.interfaceCode = interfaceCode;
        this.interfaceText = interfaceText;
        this.state = state;
    }

    public PaymentStatusImpl() {
    }

    /**
    *  <p>A code describing the current status returned by the interface that processes the payment.</p>
    */
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
    *  <p>A text describing the current status returned by the interface that processes the payment.</p>
    */
    public String getInterfaceText() {
        return this.interfaceText;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public void setInterfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public void setInterfaceText(final String interfaceText) {
        this.interfaceText = interfaceText;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentStatusImpl that = (PaymentStatusImpl) o;

        return new EqualsBuilder().append(interfaceCode, that.interfaceCode)
                .append(interfaceText, that.interfaceText)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(interfaceCode).append(interfaceText).append(state).toHashCode();
    }

}
