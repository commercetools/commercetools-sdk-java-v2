
package com.commercetools.api.models.business_unit;

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
 *  <p>Adding a Custom Field to an Address of a Business Unit generates the BusinessUnitAddressCustomFieldAdded Message, removing one generates the BusinessUnitAddressCustomFieldRemoved Message, and updating an existing one generates the BusinessUnitAddressCustomFieldChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAddressCustomFieldActionImpl implements BusinessUnitSetAddressCustomFieldAction, ModelBase {

    private String action;

    private String addressId;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetAddressCustomFieldActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.addressId = addressId;
        this.name = name;
        this.value = value;
        this.action = SET_ADDRESS_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSetAddressCustomFieldActionImpl() {
        this.action = SET_ADDRESS_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of the address to be extended.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
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

        BusinessUnitSetAddressCustomFieldActionImpl that = (BusinessUnitSetAddressCustomFieldActionImpl) o;

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

}
