
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListDraft shoppingListDraft = ShoppingListDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListDraftBuilder implements Builder<ShoppingListDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private String anonymousId;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ShoppingListDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ShoppingListDraftBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ShoppingListDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ShoppingListDraftBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder plusLineItems(
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

    public ShoppingListDraftBuilder plusLineItems(
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

    public ShoppingListDraftBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListDraftBuilder addLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> builder) {
        return plusLineItems(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListDraftBuilder setLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> builder) {
        return lineItems(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder plusTextLineItems(
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

    public ShoppingListDraftBuilder plusTextLineItems(
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

    public ShoppingListDraftBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListDraftBuilder addTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraft> builder) {
        return plusTextLineItems(
            builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListDraftBuilder setTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder, com.commercetools.api.models.shopping_list.TextLineItemDraft> builder) {
        return textLineItems(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListDraftBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     * @param store value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the Customer must be an Associate of the Business Unit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the Customer must be an Associate of the Business Unit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListDraftBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the Customer must be an Associate of the Business Unit.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShoppingListDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @return lineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @return textLineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>ResourceIdentifier of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the Customer must be an Associate of the Business Unit.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds ShoppingListDraft with checking for non-null required values
     * @return ShoppingListDraft
     */
    public ShoppingListDraft build() {
        Objects.requireNonNull(name, ShoppingListDraft.class + ": name is missing");
        return new ShoppingListDraftImpl(name, slug, customer, key, description, anonymousId,
            deleteDaysAfterLastModification, lineItems, textLineItems, store, businessUnit, custom);
    }

    /**
     * builds ShoppingListDraft without checking for non-null required values
     * @return ShoppingListDraft
     */
    public ShoppingListDraft buildUnchecked() {
        return new ShoppingListDraftImpl(name, slug, customer, key, description, anonymousId,
            deleteDaysAfterLastModification, lineItems, textLineItems, store, businessUnit, custom);
    }

    /**
     * factory method for an instance of ShoppingListDraftBuilder
     * @return builder
     */
    public static ShoppingListDraftBuilder of() {
        return new ShoppingListDraftBuilder();
    }

    /**
     * create builder for ShoppingListDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListDraftBuilder of(final ShoppingListDraft template) {
        ShoppingListDraftBuilder builder = new ShoppingListDraftBuilder();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.customer = template.getCustomer();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.anonymousId = template.getAnonymousId();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.lineItems = template.getLineItems();
        builder.textLineItems = template.getTextLineItems();
        builder.store = template.getStore();
        builder.businessUnit = template.getBusinessUnit();
        builder.custom = template.getCustom();
        return builder;
    }

}
