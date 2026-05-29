
package com.commercetools.api.models.me;

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
 * MyShoppingListSetLineItemCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetLineItemCustomTypeActionImpl
        implements MyShoppingListSetLineItemCustomTypeAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyShoppingListSetLineItemCustomTypeActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.lineItemId = lineItemId;
        this.type = type;
        this.fields = fields;
        this.action = SET_LINE_ITEM_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public MyShoppingListSetLineItemCustomTypeActionImpl() {
        this.action = SET_LINE_ITEM_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Unique identifier of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Object containing the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ShoppingListLineItem.</p>
     *  <p>Required if at least one Custom Field is defined as required in the <code>fieldDefinitions</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
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

        MyShoppingListSetLineItemCustomTypeActionImpl that = (MyShoppingListSetLineItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public MyShoppingListSetLineItemCustomTypeAction copyDeep() {
        return MyShoppingListSetLineItemCustomTypeAction.deepCopy(this);
    }
}
