
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
 * MyShoppingListChangeTextLineItemNameAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemNameActionImpl
        implements MyShoppingListChangeTextLineItemNameAction, ModelBase {

    private String action;

    private String textLineItemId;

    private String textLineItemKey;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyShoppingListChangeTextLineItemNameActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("textLineItemKey") final String textLineItemKey,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.textLineItemId = textLineItemId;
        this.textLineItemKey = textLineItemKey;
        this.name = name;
        this.action = CHANGE_TEXT_LINE_ITEM_NAME;
    }

    /**
     * create empty instance
     */
    public MyShoppingListChangeTextLineItemNameActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEM_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemKey() {
        return this.textLineItemKey;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setTextLineItemKey(final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListChangeTextLineItemNameActionImpl that = (MyShoppingListChangeTextLineItemNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(name, that.name)
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(textLineItemId)
                .append(textLineItemKey)
                .append(name)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("textLineItemId", textLineItemId)
                .append("textLineItemKey", textLineItemKey)
                .append("name", name)
                .build();
    }

    @Override
    public MyShoppingListChangeTextLineItemNameAction copyDeep() {
        return MyShoppingListChangeTextLineItemNameAction.deepCopy(this);
    }
}
