
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

/**
 * CartRemoveShippingMethodAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveShippingMethodActionImpl implements CartRemoveShippingMethodAction, ModelBase {

    private String action;

    private String shippingKey;

    @JsonCreator
    CartRemoveShippingMethodActionImpl(@JsonProperty("shippingKey") final String shippingKey) {
        this.shippingKey = shippingKey;
        this.action = REMOVE_SHIPPING_METHOD;
    }

    public CartRemoveShippingMethodActionImpl() {
        this.action = REMOVE_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveShippingMethodActionImpl that = (CartRemoveShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(shippingKey, that.shippingKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).toHashCode();
    }

}
