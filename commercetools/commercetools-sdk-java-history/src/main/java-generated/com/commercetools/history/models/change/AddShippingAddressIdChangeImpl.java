
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Change triggered by the Add Shipping Address ID update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddShippingAddressIdChangeImpl implements AddShippingAddressIdChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    private com.commercetools.history.models.common.Address address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddShippingAddressIdChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<String> previousValue,
            @JsonProperty("nextValue") final java.util.List<String> nextValue,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.address = address;
        this.type = ADD_SHIPPING_ADDRESS_ID_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddShippingAddressIdChangeImpl() {
        this.type = ADD_SHIPPING_ADDRESS_ID_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Address added to <code>shippingAddressIds</code>.</p>
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
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

        AddShippingAddressIdChangeImpl that = (AddShippingAddressIdChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(address)
                .toHashCode();
    }

}
