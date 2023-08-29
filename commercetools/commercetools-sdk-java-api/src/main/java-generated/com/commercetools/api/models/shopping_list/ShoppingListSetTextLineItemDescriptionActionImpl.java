
package com.commercetools.api.models.shopping_list;

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
 * ShoppingListSetTextLineItemDescriptionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemDescriptionActionImpl
        implements ShoppingListSetTextLineItemDescriptionAction, ModelBase {

    private String action;

    private String textLineItemId;

    private String textLineItemKey;

    private com.commercetools.api.models.common.LocalizedString description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListSetTextLineItemDescriptionActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("textLineItemKey") final String textLineItemKey,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.textLineItemId = textLineItemId;
        this.textLineItemKey = textLineItemKey;
        this.description = description;
        this.action = SET_TEXT_LINE_ITEM_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public ShoppingListSetTextLineItemDescriptionActionImpl() {
        this.action = SET_TEXT_LINE_ITEM_DESCRIPTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemKey() {
        return this.textLineItemKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setTextLineItemKey(final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetTextLineItemDescriptionActionImpl that = (ShoppingListSetTextLineItemDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(description, that.description)
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(textLineItemId)
                .append(textLineItemKey)
                .append(description)
                .toHashCode();
    }

}
