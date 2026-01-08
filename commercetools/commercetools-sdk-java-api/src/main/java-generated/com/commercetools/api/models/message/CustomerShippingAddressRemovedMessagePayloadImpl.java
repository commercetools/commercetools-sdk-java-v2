
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveShippingAddressIdAction" rel="nofollow">Remove Shipping Address ID</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerShippingAddressRemovedMessagePayloadImpl
        implements CustomerShippingAddressRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Address address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerShippingAddressRemovedMessagePayloadImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.type = CUSTOMER_SHIPPING_ADDRESS_REMOVED;
    }

    /**
     * create empty instance
     */
    public CustomerShippingAddressRemovedMessagePayloadImpl() {
        this.type = CUSTOMER_SHIPPING_ADDRESS_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
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

        CustomerShippingAddressRemovedMessagePayloadImpl that = (CustomerShippingAddressRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(address, that.address)
                .append(type, that.type)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(address).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("address", address)
                .build();
    }

    @Override
    public CustomerShippingAddressRemovedMessagePayload copyDeep() {
        return CustomerShippingAddressRemovedMessagePayload.deepCopy(this);
    }
}
