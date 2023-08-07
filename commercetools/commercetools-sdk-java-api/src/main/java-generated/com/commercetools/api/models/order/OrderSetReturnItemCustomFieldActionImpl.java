
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

/**
 * OrderSetReturnItemCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnItemCustomFieldActionImpl implements OrderSetReturnItemCustomFieldAction, ModelBase {

    private String action;

    private String returnItemId;

    private String returnItemKey;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnItemCustomFieldActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("returnItemKey") final String returnItemKey, @JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.returnItemId = returnItemId;
        this.returnItemKey = returnItemKey;
        this.name = name;
        this.value = value;
        this.action = SET_RETURN_ITEM_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public OrderSetReturnItemCustomFieldActionImpl() {
        this.action = SET_RETURN_ITEM_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemKey() {
        return this.returnItemKey;
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

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setReturnItemKey(final String returnItemKey) {
        this.returnItemKey = returnItemKey;
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

        OrderSetReturnItemCustomFieldActionImpl that = (OrderSetReturnItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(returnItemId)
                .append(returnItemKey)
                .append(name)
                .append(value)
                .toHashCode();
    }

}
