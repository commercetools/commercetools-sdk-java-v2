
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
 *  <p>Generated after removing a Custom Type from an Address of a Customer using the Set Custom Type in Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomTypeRemovedMessagePayloadImpl
        implements CustomerAddressCustomTypeRemovedMessagePayload, ModelBase {

    private String type;

    private String previousTypeId;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomTypeRemovedMessagePayloadImpl(@JsonProperty("previousTypeId") final String previousTypeId,
            @JsonProperty("addressId") final String addressId) {
        this.previousTypeId = previousTypeId;
        this.addressId = addressId;
        this.type = CUSTOMER_ADDRESS_CUSTOM_TYPE_REMOVED;
    }

    /**
     * create empty instance
     */
    public CustomerAddressCustomTypeRemovedMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_CUSTOM_TYPE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p><code>id</code> of the Address from which the Custom Type was removed.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setPreviousTypeId(final String previousTypeId) {
        this.previousTypeId = previousTypeId;
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

        CustomerAddressCustomTypeRemovedMessagePayloadImpl that = (CustomerAddressCustomTypeRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(previousTypeId, that.previousTypeId)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(previousTypeId, that.previousTypeId)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(previousTypeId).append(addressId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("previousTypeId", previousTypeId)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public CustomerAddressCustomTypeRemovedMessagePayload copyDeep() {
        return CustomerAddressCustomTypeRemovedMessagePayload.deepCopy(this);
    }
}
