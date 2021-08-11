
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListDraftBuilder implements Builder<ShoppingListDraft> {

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

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    public ShoppingListDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public ShoppingListDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public ShoppingListDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
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
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
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

    public ShoppingListDraftBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    public ShoppingListDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    public ShoppingListDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public ShoppingListDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ShoppingListDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
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

    public ShoppingListDraftBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    public ShoppingListDraftBuilder plusTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
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

    public ShoppingListDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
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

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public ShoppingListDraft build() {
        Objects.requireNonNull(name, ShoppingListDraft.class + ": name is missing");
        return new ShoppingListDraftImpl(custom, customer, deleteDaysAfterLastModification, description, key, lineItems,
            name, slug, textLineItems, anonymousId, store);
    }

    /**
     * builds ShoppingListDraft without checking for non null required values
     */
    public ShoppingListDraft buildUnchecked() {
        return new ShoppingListDraftImpl(custom, customer, deleteDaysAfterLastModification, description, key, lineItems,
            name, slug, textLineItems, anonymousId, store);
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
        builder.store = template.getStore();
        return builder;
    }

}
