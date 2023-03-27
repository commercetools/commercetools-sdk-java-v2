
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryQuantitySetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryQuantitySetMessage inventoryEntryQuantitySetMessage = InventoryEntryQuantitySetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryQuantitySetMessageBuilder implements Builder<InventoryEntryQuantitySetMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Quantity on stock for the InventoryEntry before the quantity was updated.</p>
     * @param oldQuantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder oldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        return this;
    }

    /**
     *  <p>Quantity on stock for the InventoryEntry after the quantity was updated.</p>
     * @param newQuantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder newQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
        return this;
    }

    /**
     *  <p>Available quantity for the InventoryEntry before the quantity was updated.</p>
     * @param oldAvailableQuantity value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder oldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
        return this;
    }

    /**
     *  <p>Available quantity for the InventoryEntry after the quantity was updated.</p>
     * @param newAvailableQuantity value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder newAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
        return this;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry quantity was set.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry quantity was set.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessageBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Quantity on stock for the InventoryEntry before the quantity was updated.</p>
     * @return oldQuantityOnStock
     */

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    /**
     *  <p>Quantity on stock for the InventoryEntry after the quantity was updated.</p>
     * @return newQuantityOnStock
     */

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    /**
     *  <p>Available quantity for the InventoryEntry before the quantity was updated.</p>
     * @return oldAvailableQuantity
     */

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    /**
     *  <p>Available quantity for the InventoryEntry after the quantity was updated.</p>
     * @return newAvailableQuantity
     */

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry quantity was set.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntryQuantitySetMessage with checking for non-null required values
     * @return InventoryEntryQuantitySetMessage
     */
    public InventoryEntryQuantitySetMessage build() {
        Objects.requireNonNull(id, InventoryEntryQuantitySetMessage.class + ": id is missing");
        Objects.requireNonNull(version, InventoryEntryQuantitySetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, InventoryEntryQuantitySetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, InventoryEntryQuantitySetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, InventoryEntryQuantitySetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, InventoryEntryQuantitySetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            InventoryEntryQuantitySetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(oldQuantityOnStock,
            InventoryEntryQuantitySetMessage.class + ": oldQuantityOnStock is missing");
        Objects.requireNonNull(newQuantityOnStock,
            InventoryEntryQuantitySetMessage.class + ": newQuantityOnStock is missing");
        Objects.requireNonNull(oldAvailableQuantity,
            InventoryEntryQuantitySetMessage.class + ": oldAvailableQuantity is missing");
        Objects.requireNonNull(newAvailableQuantity,
            InventoryEntryQuantitySetMessage.class + ": newAvailableQuantity is missing");
        return new InventoryEntryQuantitySetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldQuantityOnStock,
            newQuantityOnStock, oldAvailableQuantity, newAvailableQuantity, supplyChannel);
    }

    /**
     * builds InventoryEntryQuantitySetMessage without checking for non-null required values
     * @return InventoryEntryQuantitySetMessage
     */
    public InventoryEntryQuantitySetMessage buildUnchecked() {
        return new InventoryEntryQuantitySetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldQuantityOnStock,
            newQuantityOnStock, oldAvailableQuantity, newAvailableQuantity, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntryQuantitySetMessageBuilder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessageBuilder of() {
        return new InventoryEntryQuantitySetMessageBuilder();
    }

    /**
     * create builder for InventoryEntryQuantitySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessageBuilder of(final InventoryEntryQuantitySetMessage template) {
        InventoryEntryQuantitySetMessageBuilder builder = new InventoryEntryQuantitySetMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.oldQuantityOnStock = template.getOldQuantityOnStock();
        builder.newQuantityOnStock = template.getNewQuantityOnStock();
        builder.oldAvailableQuantity = template.getOldAvailableQuantity();
        builder.newAvailableQuantity = template.getNewAvailableQuantity();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
