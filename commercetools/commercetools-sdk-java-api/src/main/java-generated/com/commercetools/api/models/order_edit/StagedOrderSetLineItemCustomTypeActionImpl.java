
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
public class StagedOrderSetLineItemCustomTypeActionImpl implements StagedOrderSetLineItemCustomTypeAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    StagedOrderSetLineItemCustomTypeActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.lineItemId = lineItemId;
        this.type = type;
        this.fields = fields;
        this.action = SET_LINE_ITEM_CUSTOM_TYPE;
    }

    public StagedOrderSetLineItemCustomTypeActionImpl() {
        this.action = SET_LINE_ITEM_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the LineItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the LineItem.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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

        StagedOrderSetLineItemCustomTypeActionImpl that = (StagedOrderSetLineItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(type).append(fields).toHashCode();
    }

}
