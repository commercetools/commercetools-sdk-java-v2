
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveBillingAddressIdChangeImpl implements RemoveBillingAddressIdChange {

    private String type;

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.common.Address address;

    @JsonCreator
    RemoveBillingAddressIdChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final java.util.List<String> nextValue,
            @JsonProperty("previousValue") final java.util.List<String> previousValue,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.address = address;
        this.type = REMOVE_BILLING_ADDRESS_ID_CHANGE;
    }

    public RemoveBillingAddressIdChangeImpl() {
        this.type = REMOVE_BILLING_ADDRESS_ID_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>removeBillingAddressId</code> action on customers.</p>
    */
    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
    }

    public void setAddress(final com.commercetools.history.models.common.Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveBillingAddressIdChangeImpl that = (RemoveBillingAddressIdChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(previousValue)
                .append(address)
                .toHashCode();
    }

}
