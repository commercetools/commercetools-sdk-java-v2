
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
     <*  <p>Platform-generated unique identifier of the Message.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder oldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder newQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder oldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
        return this;
    }

    /**
     <>
     */

    public InventoryEntryQuantitySetMessageBuilder newAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
        return this;
    }

    /**
     <*  <p>Reference to a Channel.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Reference to a Channel.</p>>
     */

    public InventoryEntryQuantitySetMessageBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
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

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

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
     * builds InventoryEntryQuantitySetMessage without checking for non null required values
     */
    public InventoryEntryQuantitySetMessage buildUnchecked() {
        return new InventoryEntryQuantitySetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldQuantityOnStock,
            newQuantityOnStock, oldAvailableQuantity, newAvailableQuantity, supplyChannel);
    }

    public static InventoryEntryQuantitySetMessageBuilder of() {
        return new InventoryEntryQuantitySetMessageBuilder();
    }

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
