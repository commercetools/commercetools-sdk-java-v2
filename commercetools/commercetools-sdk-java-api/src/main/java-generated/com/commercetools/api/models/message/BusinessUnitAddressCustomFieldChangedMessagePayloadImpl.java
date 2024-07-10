
package com.commercetools.api.models.message;

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
 *  <p>Generated after changing an existing Custom Field on an address of a Business Unit using the Set Address CustomField update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomFieldChangedMessagePayloadImpl
        implements BusinessUnitAddressCustomFieldChangedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    private java.lang.Object oldValue;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAddressCustomFieldChangedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value,
            @JsonProperty("oldValue") final java.lang.Object oldValue,
            @JsonProperty("addressId") final String addressId) {
        this.name = name;
        this.value = value;
        this.oldValue = oldValue;
        this.addressId = addressId;
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_CHANGED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAddressCustomFieldChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     */

    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    /**
     *  <p><code>id</code> of the Address of which the Custom Field was changed.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setOldValue(final java.lang.Object oldValue) {
        this.oldValue = oldValue;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddressCustomFieldChangedMessagePayloadImpl that = (BusinessUnitAddressCustomFieldChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(oldValue, that.oldValue)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(oldValue, that.oldValue)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(name)
                .append(value)
                .append(oldValue)
                .append(addressId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("value", value)
                .append("oldValue", oldValue)
                .append("addressId", addressId)
                .build();
    }

}
