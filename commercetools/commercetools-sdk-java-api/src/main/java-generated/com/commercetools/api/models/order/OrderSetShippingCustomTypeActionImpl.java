
package com.commercetools.api.models.order;

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
 *  <p>This action sets, overwrites, or removes any existing Custom Type and Custom Fields for the Order's <code>shippingMethod</code> or <code>shipping</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingCustomTypeActionImpl implements OrderSetShippingCustomTypeAction, ModelBase {

    private String action;

    private String shippingKey;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetShippingCustomTypeActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.shippingKey = shippingKey;
        this.type = type;
        this.fields = fields;
        this.action = SET_SHIPPING_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public OrderSetShippingCustomTypeActionImpl() {
        this.action = SET_SHIPPING_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Defines the Type that extends the specified ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingMethod</code>.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetShippingCustomTypeActionImpl that = (OrderSetShippingCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public OrderSetShippingCustomTypeAction copyDeep() {
        return OrderSetShippingCustomTypeAction.deepCopy(this);
    }
}
