
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetReturnItemCustomTypeActionImpl implements StagedOrderSetReturnItemCustomTypeAction {

    private String action;

    private String returnItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private java.lang.Object fields;

    @JsonCreator
    StagedOrderSetReturnItemCustomTypeActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final java.lang.Object fields) {
        this.returnItemId = returnItemId;
        this.type = type;
        this.fields = fields;
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
    }

    public StagedOrderSetReturnItemCustomTypeActionImpl() {
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    public java.lang.Object getFields() {
        return this.fields;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final java.lang.Object fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetReturnItemCustomTypeActionImpl that = (StagedOrderSetReturnItemCustomTypeActionImpl) o;

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
