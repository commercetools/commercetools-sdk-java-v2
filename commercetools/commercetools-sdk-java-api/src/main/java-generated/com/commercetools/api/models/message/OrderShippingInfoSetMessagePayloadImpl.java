
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set ShippingMethod</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom ShippingMethod</a> update actions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShippingInfoSetMessagePayloadImpl implements OrderShippingInfoSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.cart.ShippingInfo oldShippingInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderShippingInfoSetMessagePayloadImpl(
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("oldShippingInfo") final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.shippingInfo = shippingInfo;
        this.oldShippingInfo = oldShippingInfo;
        this.type = ORDER_SHIPPING_INFO_SET;
    }

    /**
     * create empty instance
     */
    public OrderShippingInfoSetMessagePayloadImpl() {
        this.type = ORDER_SHIPPING_INFO_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     */

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

        return new EqualsBuilder().append(type, that.type)
                .append(shippingInfo, that.shippingInfo)
                .append(oldShippingInfo, that.oldShippingInfo)
                .append(type, that.type)
                .append(shippingInfo, that.shippingInfo)
                .append(oldShippingInfo, that.oldShippingInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(shippingInfo).append(oldShippingInfo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("shippingInfo", shippingInfo)
                .append("oldShippingInfo", oldShippingInfo)
                .build();
    }

    @Override
    public OrderShippingInfoSetMessagePayload copyDeep() {
        return OrderShippingInfoSetMessagePayload.deepCopy(this);
    }
}
