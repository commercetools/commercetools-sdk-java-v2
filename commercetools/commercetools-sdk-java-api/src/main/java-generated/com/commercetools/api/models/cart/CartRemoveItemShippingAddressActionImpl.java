
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartRemoveItemShippingAddressActionImpl implements CartRemoveItemShippingAddressAction, ModelBase {

    private String action;

    private String addressKey;

    @JsonCreator
    CartRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
        this.addressKey = addressKey;
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    public CartRemoveItemShippingAddressActionImpl() {
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(addressKey, that.addressKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressKey).toHashCode();
    }

}
