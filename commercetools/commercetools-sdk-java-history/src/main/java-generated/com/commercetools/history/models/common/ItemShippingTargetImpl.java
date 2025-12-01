
package com.commercetools.history.models.common;

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
 *  <p>Determines the address (as a reference to an address in <code>itemShippingAddresses</code>) and the quantity shipped to the address.</p>
 *  <p>If multiple shipping addresses are present for a Line Item or Custom Line Item, sub-quantities must be specified. An array of addresses and sub-quantities is stored per Line Item or Custom Line Item.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingTargetImpl implements ItemShippingTarget, ModelBase {

    private String addressKey;

    private Long quantity;

    private String shippingMethodKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("shippingMethodKey") final String shippingMethodKey) {
        this.addressKey = addressKey;
        this.quantity = quantity;
        this.shippingMethodKey = shippingMethodKey;
    }

    /**
     * create empty instance
     */
    public ItemShippingTargetImpl() {
    }

    /**
     *  <p>Key of the address in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetailsDraft" rel="nofollow">ItemShippingDetailsDraft</a>, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a>.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     *  <p>It connects Line Item or Custom Line Item quantities with individual Shipping Methods.</p>
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setShippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ItemShippingTargetImpl that = (ItemShippingTargetImpl) o;

        return new EqualsBuilder().append(addressKey, that.addressKey)
                .append(quantity, that.quantity)
                .append(shippingMethodKey, that.shippingMethodKey)
                .append(addressKey, that.addressKey)
                .append(quantity, that.quantity)
                .append(shippingMethodKey, that.shippingMethodKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addressKey).append(quantity).append(shippingMethodKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addressKey", addressKey)
                .append("quantity", quantity)
                .append("shippingMethodKey", shippingMethodKey)
                .build();
    }

    @Override
    public ItemShippingTarget copyDeep() {
        return ItemShippingTarget.deepCopy(this);
    }
}
