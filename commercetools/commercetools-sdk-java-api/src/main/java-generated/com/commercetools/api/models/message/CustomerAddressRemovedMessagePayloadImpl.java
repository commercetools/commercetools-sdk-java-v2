
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddressRemovedMessagePayloadImpl implements CustomerAddressRemovedMessagePayload {

    private String type;

    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    CustomerAddressRemovedMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.type = CUSTOMER_ADDRESS_REMOVED;
    }

    public CustomerAddressRemovedMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_REMOVED;
    }

    public String getType() {
        return this.type;
    }

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

        CustomerAddressRemovedMessagePayloadImpl that = (CustomerAddressRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(address, that.address).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).toHashCode();
    }

}
