
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingList shoppingList = ShoppingList.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusTextLineItems(textLineItemsBuilder -> textLineItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListBuilder implements Builder<ShoppingList> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems;

    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     * @param id value to be set
     * @return Builder
     */

    public ShoppingListBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ShoppingList.</p>
     * @param version value to be set
     * @return Builder
     */

    public ShoppingListBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ShoppingListBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShoppingListBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ShoppingListBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ShoppingListBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ShoppingListBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ShoppingListBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ShoppingListBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ShoppingListBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     * @return Builder
     */

    public ShoppingListBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder lineItems(
            final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder lineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder plusLineItems(
            final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListBuilder plusLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListBuilder addLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItem> builder) {
        return plusLineItems(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()));
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public ShoppingListBuilder setLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItem> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()));
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder textLineItems(
            final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder textLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems value to be set
     * @return Builder
     */

    public ShoppingListBuilder plusTextLineItems(
            final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems.addAll(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListBuilder plusTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItemBuilder> builder) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItemBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListBuilder addTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItem> builder) {
        return plusTextLineItems(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()));
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param builder function to build the textLineItems value
     * @return Builder
     */

    public ShoppingListBuilder setTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItem> builder) {
        return textLineItems(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()));
    }

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public ShoppingListBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ShoppingListBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @param store value to be set
     * @return Builder
     */

    public ShoppingListBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Reference to the Business Unit the Shopping List belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Business Unit the Shopping List belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Business Unit the Shopping List belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public ShoppingListBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShoppingListBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ShoppingListBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ShoppingListBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ShoppingListBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ShoppingListBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ShoppingList.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
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
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @return lineItems
     */

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @return textLineItems
     */

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> getTextLineItems() {
        return this.textLineItems;
    }

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
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
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Reference to the Business Unit the Shopping List belongs to.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds ShoppingList with checking for non-null required values
     * @return ShoppingList
     */
    public ShoppingList build() {
        Objects.requireNonNull(id, ShoppingList.class + ": id is missing");
        Objects.requireNonNull(version, ShoppingList.class + ": version is missing");
        Objects.requireNonNull(createdAt, ShoppingList.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ShoppingList.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ShoppingList.class + ": name is missing");
        Objects.requireNonNull(lineItems, ShoppingList.class + ": lineItems is missing");
        Objects.requireNonNull(textLineItems, ShoppingList.class + ": textLineItems is missing");
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, name, key, customer, slug, description,
            lineItems, textLineItems, deleteDaysAfterLastModification, anonymousId, store, businessUnit, custom,
            lastModifiedBy, createdBy);
    }

    /**
     * builds ShoppingList without checking for non-null required values
     * @return ShoppingList
     */
    public ShoppingList buildUnchecked() {
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, name, key, customer, slug, description,
            lineItems, textLineItems, deleteDaysAfterLastModification, anonymousId, store, businessUnit, custom,
            lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of ShoppingListBuilder
     * @return builder
     */
    public static ShoppingListBuilder of() {
        return new ShoppingListBuilder();
    }

    /**
     * create builder for ShoppingList instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListBuilder of(final ShoppingList template) {
        ShoppingListBuilder builder = new ShoppingListBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.lineItems = template.getLineItems();
        builder.textLineItems = template.getTextLineItems();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.anonymousId = template.getAnonymousId();
        builder.store = template.getStore();
        builder.businessUnit = template.getBusinessUnit();
        builder.custom = template.getCustom();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
