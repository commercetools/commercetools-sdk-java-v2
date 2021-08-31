
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListDraftBuilder implements Builder<MyShoppingListDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    public MyShoppingListDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public MyShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public MyShoppingListDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public MyShoppingListDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public MyShoppingListDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public MyShoppingListDraftBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    public MyShoppingListDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    public MyShoppingListDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public MyShoppingListDraftBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    public MyShoppingListDraftBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    public MyShoppingListDraftBuilder plusTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    public MyShoppingListDraftBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    public MyShoppingListDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public MyShoppingListDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyShoppingListDraftBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public MyShoppingListDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public MyShoppingListDraft build() {
        Objects.requireNonNull(name, MyShoppingListDraft.class + ": name is missing");
        return new MyShoppingListDraftImpl(name, description, lineItems, textLineItems, custom,
            deleteDaysAfterLastModification, store);
    }

    /**
     * builds MyShoppingListDraft without checking for non null required values
     */
    public MyShoppingListDraft buildUnchecked() {
        return new MyShoppingListDraftImpl(name, description, lineItems, textLineItems, custom,
            deleteDaysAfterLastModification, store);
    }

    public static MyShoppingListDraftBuilder of() {
        return new MyShoppingListDraftBuilder();
    }

    public static MyShoppingListDraftBuilder of(final MyShoppingListDraft template) {
        MyShoppingListDraftBuilder builder = new MyShoppingListDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.lineItems = template.getLineItems();
        builder.textLineItems = template.getTextLineItems();
        builder.custom = template.getCustom();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.store = template.getStore();
        return builder;
    }

}
