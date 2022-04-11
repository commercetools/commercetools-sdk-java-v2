
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderReturnShipmentStateChangedMessageBuilder implements Builder<OrderReturnShipmentStateChangedMessage> {

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

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState returnShipmentState;

    public OrderReturnShipmentStateChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public OrderReturnShipmentStateChangedMessageBuilder returnShipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnShipmentState = returnShipmentState;
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

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getReturnShipmentState() {
        return this.returnShipmentState;
    }

    public OrderReturnShipmentStateChangedMessage build() {
        Objects.requireNonNull(id, OrderReturnShipmentStateChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderReturnShipmentStateChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderReturnShipmentStateChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            OrderReturnShipmentStateChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            OrderReturnShipmentStateChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderReturnShipmentStateChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            OrderReturnShipmentStateChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(returnItemId,
            OrderReturnShipmentStateChangedMessage.class + ": returnItemId is missing");
        Objects.requireNonNull(returnShipmentState,
            OrderReturnShipmentStateChangedMessage.class + ": returnShipmentState is missing");
        return new OrderReturnShipmentStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnItemId,
            returnShipmentState);
    }

    /**
     * builds OrderReturnShipmentStateChangedMessage without checking for non null required values
     */
    public OrderReturnShipmentStateChangedMessage buildUnchecked() {
        return new OrderReturnShipmentStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnItemId,
            returnShipmentState);
    }

    public static OrderReturnShipmentStateChangedMessageBuilder of() {
        return new OrderReturnShipmentStateChangedMessageBuilder();
    }

    public static OrderReturnShipmentStateChangedMessageBuilder of(
            final OrderReturnShipmentStateChangedMessage template) {
        OrderReturnShipmentStateChangedMessageBuilder builder = new OrderReturnShipmentStateChangedMessageBuilder();
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
        builder.returnItemId = template.getReturnItemId();
        builder.returnShipmentState = template.getReturnShipmentState();
        return builder;
    }

}
