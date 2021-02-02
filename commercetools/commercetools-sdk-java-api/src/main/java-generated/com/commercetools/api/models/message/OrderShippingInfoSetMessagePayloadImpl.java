
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
public final class OrderShippingInfoSetMessagePayloadImpl implements OrderShippingInfoSetMessagePayload {

    private String type;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.cart.ShippingInfo oldShippingInfo;

    @JsonCreator
    OrderShippingInfoSetMessagePayloadImpl(
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("oldShippingInfo") final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.shippingInfo = shippingInfo;
        this.oldShippingInfo = oldShippingInfo;
        this.type = ORDER_SHIPPING_INFO_SET;
    }

    public OrderShippingInfoSetMessagePayloadImpl() {
        this.type = ORDER_SHIPPING_INFO_SET;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    public com.commercetools.api.models.cart.ShippingInfo getOldShippingInfo() {
        return this.oldShippingInfo;
    }

    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setOldShippingInfo(final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.oldShippingInfo = oldShippingInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderShippingInfoSetMessagePayloadImpl that = (OrderShippingInfoSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(shippingInfo, that.shippingInfo).append(
            oldShippingInfo, that.oldShippingInfo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(shippingInfo).append(oldShippingInfo).toHashCode();
    }

}
