
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListImpl implements MyShoppingList {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.common.LocalizedString description;

    private String key;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems;

    private String anonymousId;

    @JsonCreator
    MyShoppingListImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("key") final String key,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems,
            @JsonProperty("anonymousId") final String anonymousId) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
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
    }

    public MyShoppingListImpl() {
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> getLineItems() {
        return this.lineItems;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> getTextLineItems() {
        return this.textLineItems;
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
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

    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }

    public void setTextLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems) {
        this.textLineItems = textLineItems;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListImpl that = (MyShoppingListImpl) o;

        return new EqualsBuilder().append(id, that.id).append(version, that.version).append(createdAt,
            that.createdAt).append(lastModifiedAt, that.lastModifiedAt).append(lastModifiedBy,
                that.lastModifiedBy).append(createdBy, that.createdBy).append(custom, that.custom).append(customer,
                    that.customer).append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification).append(
                        description, that.description).append(key, that.key).append(lineItems, that.lineItems).append(
                            name, that.name).append(slug, that.slug).append(textLineItems, that.textLineItems).append(
                                anonymousId, that.anonymousId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).append(createdAt).append(lastModifiedAt).append(
            lastModifiedBy).append(createdBy).append(custom).append(customer).append(
                deleteDaysAfterLastModification).append(description).append(key).append(lineItems).append(name).append(
                    slug).append(textLineItems).append(anonymousId).toHashCode();
    }

}
