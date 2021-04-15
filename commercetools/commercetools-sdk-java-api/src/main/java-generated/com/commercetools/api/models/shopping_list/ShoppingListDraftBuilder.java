
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListDraftBuilder {

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    @Nullable
    private String anonymousId;

    public ShoppingListDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public ShoppingListDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    public ShoppingListDraftBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public ShoppingListDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ShoppingListDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ShoppingListDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public ShoppingListDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public ShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ShoppingListDraftBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ShoppingListDraftBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    public ShoppingListDraftBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    public ShoppingListDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
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
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
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
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public ShoppingListDraft build() {
        return new ShoppingListDraftImpl(custom, customer, deleteDaysAfterLastModification, description, key, lineItems,
            name, slug, textLineItems, anonymousId);
    }

    public static ShoppingListDraftBuilder of() {
        return new ShoppingListDraftBuilder();
    }

    public static ShoppingListDraftBuilder of(final ShoppingListDraft template) {
        ShoppingListDraftBuilder builder = new ShoppingListDraftBuilder();
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
