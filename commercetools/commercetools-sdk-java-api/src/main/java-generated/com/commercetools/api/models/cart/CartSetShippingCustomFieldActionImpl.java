
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
 * CartSetShippingCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingCustomFieldActionImpl implements CartSetShippingCustomFieldAction, ModelBase {

    private String action;

    private String shippingKey;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingCustomFieldActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.shippingKey = shippingKey;
        this.name = name;
        this.value = value;
        this.action = SET_SHIPPING_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public CartSetShippingCustomFieldActionImpl() {
        this.action = SET_SHIPPING_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
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

        CartSetShippingCustomFieldActionImpl that = (CartSetShippingCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public CartSetShippingCustomFieldAction copyDeep() {
        return CartSetShippingCustomFieldAction.deepCopy(this);
    }
}
