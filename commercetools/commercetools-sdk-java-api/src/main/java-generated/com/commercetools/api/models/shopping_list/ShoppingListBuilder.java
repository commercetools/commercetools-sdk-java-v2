
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
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     * @param id
     * @return Builder
     */

    public ShoppingListBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ShoppingList.</p>
     * @param version
     * @return Builder
     */

    public ShoppingListBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public ShoppingListBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingList was last updated.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @return Builder
     */

    public ShoppingListBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name
     * @return Builder
     */

    public ShoppingListBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     * @param key
     * @return Builder
     */

    public ShoppingListBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @return Builder
     */

    public ShoppingListBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @param customer
     * @return Builder
     */

    public ShoppingListBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @return Builder
     */

    public ShoppingListBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @param slug
     * @return Builder
     */

    public ShoppingListBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @return Builder
     */

    public ShoppingListBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description
     * @return Builder
     */

    public ShoppingListBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems
     * @return Builder
     */

    public ShoppingListBuilder lineItems(
            final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems
     * @return Builder
     */

    public ShoppingListBuilder lineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems
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
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems
     * @return Builder
     */

    public ShoppingListBuilder textLineItems(
            final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems
     * @return Builder
     */

    public ShoppingListBuilder textLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems
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
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified.</p>
     * @param deleteDaysAfterLastModification
     * @return Builder
     */

    public ShoppingListBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @param anonymousId
     * @return Builder
     */

    public ShoppingListBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @return Builder
     */

    public ShoppingListBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @param store
     * @return Builder
     */

    public ShoppingListBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return Builder
     */

    public ShoppingListBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom
     * @return Builder
     */

    public ShoppingListBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public ShoppingListBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ShoppingListBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public ShoppingListBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> getTextLineItems() {
        return this.textLineItems;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public ShoppingList build() {
        Objects.requireNonNull(id, ShoppingList.class + ": id is missing");
        Objects.requireNonNull(version, ShoppingList.class + ": version is missing");
        Objects.requireNonNull(createdAt, ShoppingList.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ShoppingList.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ShoppingList.class + ": name is missing");
        Objects.requireNonNull(lineItems, ShoppingList.class + ": lineItems is missing");
        Objects.requireNonNull(textLineItems, ShoppingList.class + ": textLineItems is missing");
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, name, key, customer, slug, description,
            lineItems, textLineItems, deleteDaysAfterLastModification, anonymousId, store, custom, lastModifiedBy,
            createdBy);
    }

    /**
     * builds ShoppingList without checking for non null required values
     */
    public ShoppingList buildUnchecked() {
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, name, key, customer, slug, description,
            lineItems, textLineItems, deleteDaysAfterLastModification, anonymousId, store, custom, lastModifiedBy,
            createdBy);
    }

    public static ShoppingListBuilder of() {
        return new ShoppingListBuilder();
    }

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
        builder.custom = template.getCustom();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
