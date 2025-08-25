
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingAddressAction" rel="nofollow">Set Shipping Address</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShippingAddressSetMessagePayloadImpl implements OrderShippingAddressSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Address address;

    private com.commercetools.api.models.common.Address oldAddress;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderShippingAddressSetMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.address = address;
        this.oldAddress = oldAddress;
        this.type = ORDER_SHIPPING_ADDRESS_SET;
    }

    /**
     * create empty instance
     */
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
     *  <p>Shipping address on the Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingAddressAction" rel="nofollow">Set Shipping Address</a> update action.</p>
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Shipping address on the Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingAddressAction" rel="nofollow">Set Shipping Address</a> update action.</p>
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
                .append(type, that.type)
                .append(address, that.address)
                .append(oldAddress, that.oldAddress)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).append(oldAddress).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("address", address)
                .append("oldAddress", oldAddress)
                .build();
    }

    @Override
    public OrderShippingAddressSetMessagePayload copyDeep() {
        return OrderShippingAddressSetMessagePayload.deepCopy(this);
    }
}
