
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
public final class MyShoppingListDraftImpl implements MyShoppingListDraft {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @JsonCreator
    MyShoppingListDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems,
            @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.name = name;
        this.description = description;
        this.lineItems = lineItems;
        this.textLineItems = textLineItems;
        this.custom = custom;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.store = store;
    }

    public MyShoppingListDraftImpl() {
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
    */
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }

    public void setTextLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListDraftImpl that = (MyShoppingListDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(lineItems, that.lineItems)
                .append(textLineItems, that.textLineItems)
                .append(custom, that.custom)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(lineItems)
                .append(textLineItems)
                .append(custom)
                .append(deleteDaysAfterLastModification)
                .append(store)
                .toHashCode();
    }

}
