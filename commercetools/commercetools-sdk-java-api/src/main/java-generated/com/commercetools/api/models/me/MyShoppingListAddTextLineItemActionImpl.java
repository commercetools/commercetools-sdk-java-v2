
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyShoppingListAddTextLineItemActionImpl implements MyShoppingListAddTextLineItemAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    MyShoppingListAddTextLineItemActionImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.custom = custom;
        this.action = ADD_TEXT_LINE_ITEM;
    }

    public MyShoppingListAddTextLineItemActionImpl() {
        this.action = ADD_TEXT_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
    *  <p>The representation used when creating or updating a <a href="/../api/projects/types#list-of-customizable-data-types">customizable data type</a> with Custom Fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListAddTextLineItemActionImpl that = (MyShoppingListAddTextLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(description, that.description)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(name)
                .append(description)
                .append(quantity)
                .append(addedAt)
                .append(custom)
                .toHashCode();
    }

}
