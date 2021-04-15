
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems;

    @Nullable
    private String anonymousId;

    public MyShoppingListBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public MyShoppingListBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyShoppingListBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MyShoppingListBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public MyShoppingListBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public MyShoppingListBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public MyShoppingListBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public MyShoppingListBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public MyShoppingListBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public MyShoppingListBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public MyShoppingListBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public MyShoppingListBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public MyShoppingListBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public MyShoppingListBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public MyShoppingListBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public MyShoppingListBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    public MyShoppingListBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    public MyShoppingListBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
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

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> getLineItems() {
        return this.lineItems;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> getTextLineItems() {
        return this.textLineItems;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public MyShoppingList build() {
        return new MyShoppingListImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, custom,
            customer, deleteDaysAfterLastModification, description, key, lineItems, name, slug, textLineItems,
            anonymousId);
    }

    public static MyShoppingListBuilder of() {
        return new MyShoppingListBuilder();
    }

    public static MyShoppingListBuilder of(final MyShoppingList template) {
        MyShoppingListBuilder builder = new MyShoppingListBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.custom = template.getCustom();
        builder.customer = template.getCustomer();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.description = template.getDescription();
        builder.key = template.getKey();
        builder.lineItems = template.getLineItems();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.textLineItems = template.getTextLineItems();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
