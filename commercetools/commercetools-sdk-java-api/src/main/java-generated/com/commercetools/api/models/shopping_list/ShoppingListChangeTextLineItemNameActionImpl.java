
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShoppingListChangeTextLineItemNameActionImpl
        implements ShoppingListChangeTextLineItemNameAction, ModelBase {

    private String action;

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    ShoppingListChangeTextLineItemNameActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.textLineItemId = textLineItemId;
        this.name = name;
        this.action = CHANGE_TEXT_LINE_ITEM_NAME;
    }

    public ShoppingListChangeTextLineItemNameActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEM_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
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

        ShoppingListChangeTextLineItemNameActionImpl that = (ShoppingListChangeTextLineItemNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemId).append(name).toHashCode();
    }

}
