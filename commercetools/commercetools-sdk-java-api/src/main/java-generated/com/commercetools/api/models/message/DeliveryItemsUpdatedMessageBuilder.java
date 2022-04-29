
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DeliveryItemsUpdatedMessageBuilder implements Builder<DeliveryItemsUpdatedMessage> {

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

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    public DeliveryItemsUpdatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder plusOldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.addAll(Arrays.asList(oldItems));
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder plusOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessageBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
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

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    public DeliveryItemsUpdatedMessage build() {
        Objects.requireNonNull(id, DeliveryItemsUpdatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, DeliveryItemsUpdatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, DeliveryItemsUpdatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, DeliveryItemsUpdatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, DeliveryItemsUpdatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, DeliveryItemsUpdatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, DeliveryItemsUpdatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(deliveryId, DeliveryItemsUpdatedMessage.class + ": deliveryId is missing");
        Objects.requireNonNull(items, DeliveryItemsUpdatedMessage.class + ": items is missing");
        Objects.requireNonNull(oldItems, DeliveryItemsUpdatedMessage.class + ": oldItems is missing");
        return new DeliveryItemsUpdatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, deliveryId, items, oldItems);
    }

    /**
     * builds DeliveryItemsUpdatedMessage without checking for non null required values
     */
    public DeliveryItemsUpdatedMessage buildUnchecked() {
        return new DeliveryItemsUpdatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, deliveryId, items, oldItems);
    }

    public static DeliveryItemsUpdatedMessageBuilder of() {
        return new DeliveryItemsUpdatedMessageBuilder();
    }

    public static DeliveryItemsUpdatedMessageBuilder of(final DeliveryItemsUpdatedMessage template) {
        DeliveryItemsUpdatedMessageBuilder builder = new DeliveryItemsUpdatedMessageBuilder();
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
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        builder.oldItems = template.getOldItems();
        return builder;
    }

}
