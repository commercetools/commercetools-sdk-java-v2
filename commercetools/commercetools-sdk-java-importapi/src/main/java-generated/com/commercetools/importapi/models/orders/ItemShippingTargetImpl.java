
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
 *  <p>The item's shipping target.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingTargetImpl implements ItemShippingTarget, ModelBase {

    private String addressKey;

    private Double quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("quantity") final Double quantity) {
        this.addressKey = addressKey;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public ItemShippingTargetImpl() {
    }

    /**
     *  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>
     */

    public Double getQuantity() {
        return this.quantity;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setQuantity(final Double quantity) {
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

}
