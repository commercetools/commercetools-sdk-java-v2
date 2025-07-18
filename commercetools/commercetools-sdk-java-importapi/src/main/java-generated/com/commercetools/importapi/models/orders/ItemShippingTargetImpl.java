
package com.commercetools.importapi.models.orders;

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
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingTargetImpl implements ItemShippingTarget, ModelBase {

    private String addressKey;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("quantity") final Long quantity) {
        this.addressKey = addressKey;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public ItemShippingTargetImpl() {
    }

    /**
     *  <p>Key of the address in the Cart <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setQuantity(final Long quantity) {
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
