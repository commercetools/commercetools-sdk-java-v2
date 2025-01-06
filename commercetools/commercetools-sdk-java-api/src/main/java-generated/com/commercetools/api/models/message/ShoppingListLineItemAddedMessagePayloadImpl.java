
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Add ShoppingListLineItem update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemAddedMessagePayloadImpl implements ShoppingListLineItemAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListLineItemAddedMessagePayloadImpl(
            @JsonProperty("lineItem") final com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem) {
        this.lineItem = lineItem;
        this.type = SHOPPING_LIST_LINE_ITEM_ADDED;
    }

    /**
     * create empty instance
     */
    public ShoppingListLineItemAddedMessagePayloadImpl() {
        this.type = SHOPPING_LIST_LINE_ITEM_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Line Item that was added to the ShoppingList.</p>
     */

    public com.commercetools.api.models.shopping_list.ShoppingListLineItem getLineItem() {
        return this.lineItem;
    }

    public void setLineItem(final com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem) {
        this.lineItem = lineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListLineItemAddedMessagePayloadImpl that = (ShoppingListLineItemAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lineItem, that.lineItem)
                .append(type, that.type)
                .append(lineItem, that.lineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lineItem).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("lineItem", lineItem)
                .build();
    }

}
