
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
 * OrderSetCustomLineItemCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomLineItemCustomFieldActionImpl implements OrderSetCustomLineItemCustomFieldAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    OrderSetCustomLineItemCustomFieldActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.customLineItemId = customLineItemId;
        this.name = name;
        this.value = value;
        this.action = SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD;
    }

    public OrderSetCustomLineItemCustomFieldActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
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

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        OrderSetCustomLineItemCustomFieldActionImpl that = (OrderSetCustomLineItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(name)
                .append(value)
                .toHashCode();
    }

}
