
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressRemovedMessagePayloadImpl
        implements BusinessUnitAddressRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Address address;

    private java.util.List<com.commercetools.api.models.common.AddressRole> addressRoles;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAddressRemovedMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("addressRoles") final java.util.List<com.commercetools.api.models.common.AddressRole> addressRoles) {
        this.address = address;
        this.addressRoles = addressRoles;
        this.type = BUSINESS_UNIT_ADDRESS_REMOVED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAddressRemovedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ADDRESS_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AddressRole> getAddressRoles() {
        return this.addressRoles;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    public void setAddressRoles(final com.commercetools.api.models.common.AddressRole... addressRoles) {
        this.addressRoles = new ArrayList<>(Arrays.asList(addressRoles));
    }

    public void setAddressRoles(final java.util.List<com.commercetools.api.models.common.AddressRole> addressRoles) {
        this.addressRoles = addressRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddressRemovedMessagePayloadImpl that = (BusinessUnitAddressRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(address, that.address)
                .append(addressRoles, that.addressRoles)
                .append(type, that.type)
                .append(address, that.address)
                .append(addressRoles, that.addressRoles)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).append(addressRoles).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("address", address)
                .append("addressRoles", addressRoles)
                .build();
    }

    @Override
    public BusinessUnitAddressRemovedMessagePayload copyDeep() {
        return BusinessUnitAddressRemovedMessagePayload.deepCopy(this);
    }
}
