
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListDraftBuilder {

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

    public MyShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public MyShoppingListDraftBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
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

    public MyShoppingListDraft build() {
        return new MyShoppingListDraftImpl(name, description, lineItems, textLineItems, custom,
            deleteDaysAfterLastModification);
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
        return builder;
    }

}
