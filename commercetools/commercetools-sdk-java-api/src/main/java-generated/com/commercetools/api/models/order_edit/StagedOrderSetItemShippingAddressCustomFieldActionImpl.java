
package com.commercetools.api.models.order_edit;

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
 * StagedOrderSetItemShippingAddressCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetItemShippingAddressCustomFieldActionImpl
        implements StagedOrderSetItemShippingAddressCustomFieldAction, ModelBase {

    private String action;

    private String addressKey;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetItemShippingAddressCustomFieldActionImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.addressKey = addressKey;
        this.name = name;
        this.value = value;
        this.action = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetItemShippingAddressCustomFieldActionImpl() {
        this.action = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddresses</code>.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetItemShippingAddressCustomFieldActionImpl that = (StagedOrderSetItemShippingAddressCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressKey).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressKey", addressKey)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public StagedOrderSetItemShippingAddressCustomFieldAction copyDeep() {
        return StagedOrderSetItemShippingAddressCustomFieldAction.deepCopy(this);
    }
}
