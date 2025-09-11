
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
 *  <p>Generated after adding a Custom Field to an Address of a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField in Address</a> update action. If a Custom Field already exists with the same name, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldChangedMessage" rel="nofollow">CustomerAddressCustomFieldChanged</a> Message is generated instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldAddedMessagePayloadImpl
        implements CustomerAddressCustomFieldAddedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomFieldAddedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("addressId") final String addressId) {
        this.name = name;
        this.value = value;
        this.addressId = addressId;
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_ADDED;
    }

    /**
     * create empty instance
     */
    public CustomerAddressCustomFieldAddedMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to which the Custom Field was added.</p>
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

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerAddressCustomFieldAddedMessagePayloadImpl that = (CustomerAddressCustomFieldAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(value).append(addressId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("value", value)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public CustomerAddressCustomFieldAddedMessagePayload copyDeep() {
        return CustomerAddressCustomFieldAddedMessagePayload.deepCopy(this);
    }
}
