
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetLineItemCustomFieldActionImpl implements StagedOrderSetLineItemCustomFieldAction, ModelBase {

    private String action;

    private String lineItemId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    StagedOrderSetLineItemCustomFieldActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.lineItemId = lineItemId;
        this.name = name;
        this.value = value;
        this.action = SET_LINE_ITEM_CUSTOM_FIELD;
    }

    public StagedOrderSetLineItemCustomFieldActionImpl() {
        this.action = SET_LINE_ITEM_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */
    public java.lang.Object getValue() {
        return this.value;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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

        StagedOrderSetLineItemCustomFieldActionImpl that = (StagedOrderSetLineItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(name).append(value).toHashCode();
    }

}
