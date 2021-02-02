
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetTextLineItemDescriptionActionImpl
        implements MyShoppingListSetTextLineItemDescriptionAction {

    private String action;

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString description;

    @JsonCreator
    MyShoppingListSetTextLineItemDescriptionActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.textLineItemId = textLineItemId;
        this.description = description;
        this.action = SET_TEXT_LINE_ITEM_DESCRIPTION;
    }

    public MyShoppingListSetTextLineItemDescriptionActionImpl() {
        this.action = SET_TEXT_LINE_ITEM_DESCRIPTION;
    }

    public String getAction() {
        return this.action;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
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

        MyShoppingListSetTextLineItemDescriptionActionImpl that = (MyShoppingListSetTextLineItemDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(textLineItemId, that.textLineItemId).append(
            description, that.description).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemId).append(description).toHashCode();
    }

}
