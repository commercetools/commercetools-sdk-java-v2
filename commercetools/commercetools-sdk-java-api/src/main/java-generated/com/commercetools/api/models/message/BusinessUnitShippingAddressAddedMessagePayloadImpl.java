
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

/**
 *  <p>Generated after a successful Add Shipping Address Identifier update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitShippingAddressAddedMessagePayloadImpl
        implements BusinessUnitShippingAddressAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    BusinessUnitShippingAddressAddedMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.type = BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED;
    }

    public BusinessUnitShippingAddressAddedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitShippingAddressAddedMessagePayloadImpl that = (BusinessUnitShippingAddressAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(address, that.address).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).toHashCode();
    }

}
