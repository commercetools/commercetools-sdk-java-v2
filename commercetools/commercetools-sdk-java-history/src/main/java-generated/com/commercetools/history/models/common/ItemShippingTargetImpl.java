
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
 * ItemShippingTarget
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingTargetImpl implements ItemShippingTarget, ModelBase {

    private String addressKey;

    private Integer quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("quantity") final Integer quantity) {
        this.addressKey = addressKey;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public ItemShippingTargetImpl() {
    }

    /**
     *  <p>The key of the address in the cart's <code>itemShippingAddresses</code></p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>The quantity of items that should go to the address with the specified <code>addressKey</code>. Only positive values are allowed. Using <code>0</code> as quantity is also possible in a draft object, but the element will not be present in the resulting ItemShippingDetails.</p>
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
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
                .append(addressKey, that.addressKey)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addressKey).append(quantity).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addressKey", addressKey)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public ItemShippingTarget copyDeep() {
        return ItemShippingTarget.deepCopy(this);
    }
}
