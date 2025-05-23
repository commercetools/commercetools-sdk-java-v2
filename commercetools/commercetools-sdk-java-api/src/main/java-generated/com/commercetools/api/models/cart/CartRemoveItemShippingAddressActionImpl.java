
package com.commercetools.api.models.cart;

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
 *  <p>An address can only be removed if it is not referenced in any ItemShippingTarget of the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveItemShippingAddressActionImpl implements CartRemoveItemShippingAddressAction, ModelBase {

    private String action;

    private String addressKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
        this.addressKey = addressKey;
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    /**
     * create empty instance
     */
    public CartRemoveItemShippingAddressActionImpl() {
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveItemShippingAddressActionImpl that = (CartRemoveItemShippingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressKey", addressKey)
                .build();
    }

    @Override
    public CartRemoveItemShippingAddressAction copyDeep() {
        return CartRemoveItemShippingAddressAction.deepCopy(this);
    }
}
