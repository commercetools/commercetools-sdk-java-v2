
package com.commercetools.api.models.order;

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
 *  <p>Produces the DeliveryAddressSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryAddressActionImpl implements OrderSetDeliveryAddressAction, ModelBase {

    private String action;

    private String deliveryId;

    private String deliveryKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetDeliveryAddressActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("deliveryKey") final String deliveryKey,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.deliveryId = deliveryId;
        this.deliveryKey = deliveryKey;
        this.address = address;
        this.action = SET_DELIVERY_ADDRESS;
    }

    /**
     * create empty instance
     */
    public OrderSetDeliveryAddressActionImpl() {
        this.action = SET_DELIVERY_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     */

    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setDeliveryKey(final String deliveryKey) {
        this.deliveryKey = deliveryKey;
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

        OrderSetDeliveryAddressActionImpl that = (OrderSetDeliveryAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .append(address, that.address)
                .append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(deliveryId)
                .append(deliveryKey)
                .append(address)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("deliveryId", deliveryId)
                .append("deliveryKey", deliveryKey)
                .append("address", address)
                .build();
    }

}
