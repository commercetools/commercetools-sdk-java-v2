
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListDraft myShoppingListDraft = MyShoppingListDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListDraftBuilder implements Builder<MyShoppingListDraft> {

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

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public MyShoppingListDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public MyShoppingListDraftBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder plusTextLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems.addAll(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public MyShoppingListDraftBuilder plusTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public MyShoppingListDraftBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyShoppingListDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public MyShoppingListDraftBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store. The Store assignment can not be modified.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public MyShoppingListDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store. The Store assignment can not be modified.</p>
     * @param store value to be set
     * @return Builder
     */

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

    /**
     * builds MyShoppingListDraft with checking for non-null required values
     * @return MyShoppingListDraft
     */
    public MyShoppingListDraft build() {
        Objects.requireNonNull(name, MyShoppingListDraft.class + ": name is missing");
        return new MyShoppingListDraftImpl(name, description, lineItems, textLineItems, custom,
            deleteDaysAfterLastModification, store);
    }

    /**
     * builds MyShoppingListDraft without checking for non-null required values
     * @return MyShoppingListDraft
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
