
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntryCreatedMessageBuilder implements Builder<InventoryEntryCreatedMessage> {

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

    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    public InventoryEntryCreatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public InventoryEntryCreatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public InventoryEntryCreatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public InventoryEntryCreatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public InventoryEntryCreatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public InventoryEntryCreatedMessageBuilder inventoryEntry(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.inventoryEntry = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build();
        return this;
    }

    public InventoryEntryCreatedMessageBuilder inventoryEntry(
            final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
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

    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry() {
        return this.inventoryEntry;
    }

    public InventoryEntryCreatedMessage build() {
        Objects.requireNonNull(id, InventoryEntryCreatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, InventoryEntryCreatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, InventoryEntryCreatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, InventoryEntryCreatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, InventoryEntryCreatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, InventoryEntryCreatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, InventoryEntryCreatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(inventoryEntry, InventoryEntryCreatedMessage.class + ": inventoryEntry is missing");
        return new InventoryEntryCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, inventoryEntry);
    }

    /**
     * builds InventoryEntryCreatedMessage without checking for non null required values
     */
    public InventoryEntryCreatedMessage buildUnchecked() {
        return new InventoryEntryCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, inventoryEntry);
    }

    public static InventoryEntryCreatedMessageBuilder of() {
        return new InventoryEntryCreatedMessageBuilder();
    }

    public static InventoryEntryCreatedMessageBuilder of(final InventoryEntryCreatedMessage template) {
        InventoryEntryCreatedMessageBuilder builder = new InventoryEntryCreatedMessageBuilder();
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
        builder.inventoryEntry = template.getInventoryEntry();
        return builder;
    }

}
