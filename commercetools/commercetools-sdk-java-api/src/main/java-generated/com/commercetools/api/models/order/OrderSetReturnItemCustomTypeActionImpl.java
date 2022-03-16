
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetReturnItemCustomTypeActionImpl implements OrderSetReturnItemCustomTypeAction, ModelBase {

    private String action;

    private String returnItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    OrderSetReturnItemCustomTypeActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.returnItemId = returnItemId;
        this.type = type;
        this.fields = fields;
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
    }

    public OrderSetReturnItemCustomTypeActionImpl() {
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the ReturnItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the ReturnItem.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
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

        OrderSetReturnItemCustomTypeActionImpl that = (OrderSetReturnItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(returnItemId).append(type).append(fields).toHashCode();
    }

}
