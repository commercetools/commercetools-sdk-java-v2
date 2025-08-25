
package com.commercetools.api.models.order_edit;

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
 *  <p>This action updates the <code>shippingAddress</code> on the Order, but it does not change the shipping address on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> from which the Order is created. Also, it does not recalculate the Cart as taxes may not fit to the shipping address anymore.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderShippingAddressSetMessage" rel="nofollow">Order Shipping Address Set</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressActionImpl implements StagedOrderSetShippingAddressAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetShippingAddressActionImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        this.action = SET_SHIPPING_ADDRESS;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetShippingAddressActionImpl() {
        this.action = SET_SHIPPING_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
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

        StagedOrderSetShippingAddressActionImpl that = (StagedOrderSetShippingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(address, that.address)
                .append(action, that.action)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(address).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("address", address)
                .build();
    }

    @Override
    public StagedOrderSetShippingAddressAction copyDeep() {
        return StagedOrderSetShippingAddressAction.deepCopy(this);
    }
}
