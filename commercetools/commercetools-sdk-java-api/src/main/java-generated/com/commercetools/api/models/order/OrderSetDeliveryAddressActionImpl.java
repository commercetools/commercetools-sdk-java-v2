
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetDeliveryAddressActionImpl implements OrderSetDeliveryAddressAction, ModelBase {

    private String action;

    private String deliveryId;

    private com.commercetools.api.models.common.BaseAddress address;

    @JsonCreator
    OrderSetDeliveryAddressActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.deliveryId = deliveryId;
        this.address = address;
        this.action = SET_DELIVERY_ADDRESS;
    }

    public OrderSetDeliveryAddressActionImpl() {
        this.action = SET_DELIVERY_ADDRESS;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).append(address).toHashCode();
    }

}
