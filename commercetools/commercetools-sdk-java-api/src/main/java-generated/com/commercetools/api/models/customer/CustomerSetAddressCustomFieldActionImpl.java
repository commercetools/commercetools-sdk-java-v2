
package com.commercetools.api.models.customer;

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
 *  <p>Adding a Custom Field to an Address of a Customer generates the CustomerAddressCustomFieldAdded Message, removing one generates the CustomerAddressCustomFieldRemoved Message, and updating an existing one generates the CustomerAddressCustomFieldChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetAddressCustomFieldActionImpl implements CustomerSetAddressCustomFieldAction, ModelBase {

    private String action;

    private String addressId;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetAddressCustomFieldActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.addressId = addressId;
        this.name = name;
        this.value = value;
        this.action = SET_ADDRESS_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public CustomerSetAddressCustomFieldActionImpl() {
        this.action = SET_ADDRESS_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetAddressCustomFieldActionImpl that = (CustomerSetAddressCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressId", addressId)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public CustomerSetAddressCustomFieldAction copyDeep() {
        return CustomerSetAddressCustomFieldAction.deepCopy(this);
    }
}
