
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
 *  <p>Generated after changing an existing Custom Field on an Address of a Customer using the Set CustomField in Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldChangedMessagePayloadImpl
        implements CustomerAddressCustomFieldChangedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    private java.lang.Object previousValue;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomFieldChangedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("addressId") final String addressId) {
        this.name = name;
        this.value = value;
        this.previousValue = previousValue;
        this.addressId = addressId;
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_CHANGED;
    }

    /**
     * create empty instance
     */
    public CustomerAddressCustomFieldChangedMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_CHANGED;
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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a Customer Address Custom Field Added Message is generated instead.</p>
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
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

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
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

        CustomerAddressCustomFieldChangedMessagePayloadImpl that = (CustomerAddressCustomFieldChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(previousValue, that.previousValue)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(previousValue, that.previousValue)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(name)
                .append(value)
                .append(previousValue)
                .append(addressId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("value", value)
                .append("previousValue", previousValue)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public CustomerAddressCustomFieldChangedMessagePayload copyDeep() {
        return CustomerAddressCustomFieldChangedMessagePayload.deepCopy(this);
    }
}
