
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderReturnInfoAddedMessageBuilder implements Builder<OrderReturnInfoAddedMessage> {

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

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    public OrderReturnInfoAddedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder returnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoAddedMessageBuilder returnInfo(
            final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
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

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    public OrderReturnInfoAddedMessage build() {
        Objects.requireNonNull(id, OrderReturnInfoAddedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderReturnInfoAddedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderReturnInfoAddedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderReturnInfoAddedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderReturnInfoAddedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderReturnInfoAddedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderReturnInfoAddedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(returnInfo, OrderReturnInfoAddedMessage.class + ": returnInfo is missing");
        return new OrderReturnInfoAddedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnInfo);
    }

    /**
     * builds OrderReturnInfoAddedMessage without checking for non null required values
     */
    public OrderReturnInfoAddedMessage buildUnchecked() {
        return new OrderReturnInfoAddedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnInfo);
    }

    public static OrderReturnInfoAddedMessageBuilder of() {
        return new OrderReturnInfoAddedMessageBuilder();
    }

    public static OrderReturnInfoAddedMessageBuilder of(final OrderReturnInfoAddedMessage template) {
        OrderReturnInfoAddedMessageBuilder builder = new OrderReturnInfoAddedMessageBuilder();
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
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
