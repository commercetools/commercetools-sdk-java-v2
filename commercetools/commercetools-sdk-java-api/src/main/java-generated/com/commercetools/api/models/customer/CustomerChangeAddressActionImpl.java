
package com.commercetools.api.models.customer;

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
 *  <p>Changing an address of the Customer produces the CustomerAddressChanged Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerChangeAddressActionImpl implements CustomerChangeAddressAction, ModelBase {

    private String action;

    private String addressId;

    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerChangeAddressActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("addressKey") final String addressKey,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.address = address;
        this.action = CHANGE_ADDRESS;
    }

    /**
     * create empty instance
     */
    public CustomerChangeAddressActionImpl() {
        this.action = CHANGE_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the Address to change.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the Address to change.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Value to set.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerChangeAddressActionImpl that = (CustomerChangeAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .append(address, that.address)
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(addressId)
                .append(addressKey)
                .append(address)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressId", addressId)
                .append("addressKey", addressKey)
                .append("address", address)
                .build();
    }

    @Override
    public CustomerChangeAddressAction copyDeep() {
        return CustomerChangeAddressAction.deepCopy(this);
    }
}
