
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
public class ShoppingListDraftImpl implements ShoppingListDraft, ModelBase {

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.common.LocalizedString description;

    private String key;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    private String anonymousId;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @JsonCreator
    ShoppingListDraftImpl(@JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("key") final String key,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.custom = custom;
        this.customer = customer;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.description = description;
        this.key = key;
        this.lineItems = lineItems;
        this.name = name;
        this.slug = slug;
        this.textLineItems = textLineItems;
        this.anonymousId = anonymousId;
        this.store = store;
    }

    public ShoppingListDraftImpl() {
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
    *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
    */
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>User-defined unique identifier for the ShoppingList.</p>
    */
    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list.
    *  Each slug is unique across a project, but a shopping list can have the same slug for different languages.
    *  The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    /**
    *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }

    public void setTextLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
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

        ShoppingListDraftImpl that = (ShoppingListDraftImpl) o;

        return new EqualsBuilder().append(custom, that.custom)
                .append(customer, that.customer)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(description, that.description)
                .append(key, that.key)
                .append(lineItems, that.lineItems)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(textLineItems, that.textLineItems)
                .append(anonymousId, that.anonymousId)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(custom)
                .append(customer)
                .append(deleteDaysAfterLastModification)
                .append(description)
                .append(key)
                .append(lineItems)
                .append(name)
                .append(slug)
                .append(textLineItems)
                .append(anonymousId)
                .append(store)
                .toHashCode();
    }

}
