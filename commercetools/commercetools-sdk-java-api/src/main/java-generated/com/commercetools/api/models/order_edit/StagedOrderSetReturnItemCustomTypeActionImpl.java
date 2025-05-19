
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
 * StagedOrderSetReturnItemCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnItemCustomTypeActionImpl
        implements StagedOrderSetReturnItemCustomTypeAction, ModelBase {

    private String action;

    private String returnItemId;

    private String returnItemKey;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetReturnItemCustomTypeActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("returnItemKey") final String returnItemKey,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.returnItemId = returnItemId;
        this.returnItemKey = returnItemKey;
        this.type = type;
        this.fields = fields;
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetReturnItemCustomTypeActionImpl() {
        this.action = SET_RETURN_ITEM_CUSTOM_TYPE;
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
     *  <p>Defines the Type that extends the Return Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Return Item.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setReturnItemKey(final String returnItemKey) {
        this.returnItemKey = returnItemKey;
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

        StagedOrderSetReturnItemCustomTypeActionImpl that = (StagedOrderSetReturnItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(returnItemId)
                .append(returnItemKey)
                .append(type)
                .append(fields)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("returnItemId", returnItemId)
                .append("returnItemKey", returnItemKey)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public StagedOrderSetReturnItemCustomTypeAction copyDeep() {
        return StagedOrderSetReturnItemCustomTypeAction.deepCopy(this);
    }
}
