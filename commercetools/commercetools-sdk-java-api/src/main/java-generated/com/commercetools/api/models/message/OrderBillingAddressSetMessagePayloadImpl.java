
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
public final class OrderBillingAddressSetMessagePayloadImpl implements OrderBillingAddressSetMessagePayload {

    private String type;

    private com.commercetools.api.models.common.Address address;

    private com.commercetools.api.models.common.Address oldAddress;

    @JsonCreator
    OrderBillingAddressSetMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.address = address;
        this.oldAddress = oldAddress;
        this.type = ORDER_BILLING_ADDRESS_SET;
    }

    public OrderBillingAddressSetMessagePayloadImpl() {
        this.type = ORDER_BILLING_ADDRESS_SET;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    public void setOldAddress(final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderBillingAddressSetMessagePayloadImpl that = (OrderBillingAddressSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(address, that.address).append(oldAddress,
            that.oldAddress).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).append(oldAddress).toHashCode();
    }

}
