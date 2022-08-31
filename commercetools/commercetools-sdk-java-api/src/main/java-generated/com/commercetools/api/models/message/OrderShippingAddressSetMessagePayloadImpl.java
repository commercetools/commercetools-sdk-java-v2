
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
 *  <p>Generated after a successful Set Shipping Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShippingAddressSetMessagePayloadImpl implements OrderShippingAddressSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Address address;

    private com.commercetools.api.models.common.Address oldAddress;

    @JsonCreator
    OrderShippingAddressSetMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.address = address;
        this.oldAddress = oldAddress;
        this.type = ORDER_SHIPPING_ADDRESS_SET;
    }

    public OrderShippingAddressSetMessagePayloadImpl() {
        this.type = ORDER_SHIPPING_ADDRESS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     */

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

        OrderShippingAddressSetMessagePayloadImpl that = (OrderShippingAddressSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(address, that.address)
                .append(oldAddress, that.oldAddress)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).append(oldAddress).toHashCode();
    }

}
