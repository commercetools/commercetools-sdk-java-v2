
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ParcelRemovedFromDeliveryMessageBuilder implements Builder<ParcelRemovedFromDeliveryMessage> {

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

    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelRemovedFromDeliveryMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessageBuilder parcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
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

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    public ParcelRemovedFromDeliveryMessage build() {
        Objects.requireNonNull(id, ParcelRemovedFromDeliveryMessage.class + ": id is missing");
        Objects.requireNonNull(version, ParcelRemovedFromDeliveryMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ParcelRemovedFromDeliveryMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ParcelRemovedFromDeliveryMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ParcelRemovedFromDeliveryMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ParcelRemovedFromDeliveryMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ParcelRemovedFromDeliveryMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(deliveryId, ParcelRemovedFromDeliveryMessage.class + ": deliveryId is missing");
        Objects.requireNonNull(parcel, ParcelRemovedFromDeliveryMessage.class + ": parcel is missing");
        return new ParcelRemovedFromDeliveryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, deliveryId, parcel);
    }

    /**
     * builds ParcelRemovedFromDeliveryMessage without checking for non null required values
     */
    public ParcelRemovedFromDeliveryMessage buildUnchecked() {
        return new ParcelRemovedFromDeliveryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, deliveryId, parcel);
    }

    public static ParcelRemovedFromDeliveryMessageBuilder of() {
        return new ParcelRemovedFromDeliveryMessageBuilder();
    }

    public static ParcelRemovedFromDeliveryMessageBuilder of(final ParcelRemovedFromDeliveryMessage template) {
        ParcelRemovedFromDeliveryMessageBuilder builder = new ParcelRemovedFromDeliveryMessageBuilder();
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
        builder.parcel = template.getParcel();
        return builder;
    }

}
