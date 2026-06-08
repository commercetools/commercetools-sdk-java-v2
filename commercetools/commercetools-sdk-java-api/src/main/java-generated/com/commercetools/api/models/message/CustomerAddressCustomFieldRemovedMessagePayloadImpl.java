
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
 *  <p>Generated after removing a Custom Field from an Address of a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField in Address</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldRemovedMessagePayloadImpl
        implements CustomerAddressCustomFieldRemovedMessagePayload, ModelBase {

    private String type;

    private String name;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomFieldRemovedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("addressId") final String addressId) {
        this.name = name;
        this.addressId = addressId;
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_REMOVED;
    }

    /**
     * create empty instance
     */
    public CustomerAddressCustomFieldRemovedMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_CUSTOM_FIELD_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Field was removed.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setName(final String name) {
        this.name = name;
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

        CustomerAddressCustomFieldRemovedMessagePayloadImpl that = (CustomerAddressCustomFieldRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(name, that.name)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(addressId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public CustomerAddressCustomFieldRemovedMessagePayload copyDeep() {
        return CustomerAddressCustomFieldRemovedMessagePayload.deepCopy(this);
    }
}
