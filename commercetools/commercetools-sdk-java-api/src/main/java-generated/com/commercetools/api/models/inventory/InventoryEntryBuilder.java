
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntry inventoryEntry = InventoryEntry.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .availableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryBuilder implements Builder<InventoryEntry> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private String sku;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    private Long quantityOnStock;

    private Long availableQuantity;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @param id value to be set
     * @return Builder
     */

    public InventoryEntryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @param version value to be set
     * @return Builder
     */

    public InventoryEntryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public InventoryEntryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public InventoryEntryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public InventoryEntryBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public InventoryEntryBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public InventoryEntryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public InventoryEntryBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public InventoryEntryBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public InventoryEntryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     * @param key value to be set
     * @return Builder
     */

    public InventoryEntryBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @param quantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryBuilder quantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @param availableQuantity value to be set
     * @return Builder
     */

    public InventoryEntryBuilder availableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @param restockableInDays value to be set
     * @return Builder
     */

    public InventoryEntryBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *  <p>Date and time of the next restock.</p>
     * @param expectedDelivery value to be set
     * @return Builder
     */

    public InventoryEntryBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public InventoryEntryBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public InventoryEntryBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @param custom value to be set
     * @return Builder
     */

    public InventoryEntryBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @return quantityOnStock
     */

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @return availableQuantity
     */

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @return restockableInDays
     */

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     *  <p>Date and time of the next restock.</p>
     * @return expectedDelivery
     */

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds InventoryEntry with checking for non-null required values
     * @return InventoryEntry
     */
    public InventoryEntry build() {
        Objects.requireNonNull(id, InventoryEntry.class + ": id is missing");
        Objects.requireNonNull(version, InventoryEntry.class + ": version is missing");
        Objects.requireNonNull(createdAt, InventoryEntry.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, InventoryEntry.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sku, InventoryEntry.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock, InventoryEntry.class + ": quantityOnStock is missing");
        Objects.requireNonNull(availableQuantity, InventoryEntry.class + ": availableQuantity is missing");
        return new InventoryEntryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            supplyChannel, quantityOnStock, availableQuantity, restockableInDays, expectedDelivery, custom);
    }

    /**
     * builds InventoryEntry without checking for non-null required values
     * @return InventoryEntry
     */
    public InventoryEntry buildUnchecked() {
        return new InventoryEntryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            supplyChannel, quantityOnStock, availableQuantity, restockableInDays, expectedDelivery, custom);
    }

    /**
     * factory method for an instance of InventoryEntryBuilder
     * @return builder
     */
    public static InventoryEntryBuilder of() {
        return new InventoryEntryBuilder();
    }

    /**
     * create builder for InventoryEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryBuilder of(final InventoryEntry template) {
        InventoryEntryBuilder builder = new InventoryEntryBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.custom = template.getCustom();
        return builder;
    }

}
