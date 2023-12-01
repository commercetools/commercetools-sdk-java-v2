
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
 * CartSetItemShippingAddressCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetItemShippingAddressCustomTypeActionImpl
        implements CartSetItemShippingAddressCustomTypeAction, ModelBase {

    private String action;

    private String addressKey;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetItemShippingAddressCustomTypeActionImpl(@JsonProperty("addressKey") final String addressKey,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.addressKey = addressKey;
        this.type = type;
        this.fields = fields;
        this.action = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public CartSetItemShippingAddressCustomTypeActionImpl() {
        this.action = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
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

        CartSetItemShippingAddressCustomTypeActionImpl that = (CartSetItemShippingAddressCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressKey).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressKey", addressKey)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

}
