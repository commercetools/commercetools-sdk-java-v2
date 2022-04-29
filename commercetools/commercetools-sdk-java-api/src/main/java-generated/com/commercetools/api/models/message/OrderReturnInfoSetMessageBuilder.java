
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderReturnInfoSetMessageBuilder implements Builder<OrderReturnInfoSetMessage> {

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

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    public OrderReturnInfoSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public OrderReturnInfoSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderReturnInfoSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder returnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    public OrderReturnInfoSetMessageBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public OrderReturnInfoSetMessageBuilder plusReturnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.addAll(Arrays.asList(returnInfo));
        return this;
    }

    public OrderReturnInfoSetMessageBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    public OrderReturnInfoSetMessageBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
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

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    public OrderReturnInfoSetMessage build() {
        Objects.requireNonNull(id, OrderReturnInfoSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderReturnInfoSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderReturnInfoSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderReturnInfoSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderReturnInfoSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderReturnInfoSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderReturnInfoSetMessage.class + ": resourceVersion is missing");
        return new OrderReturnInfoSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnInfo);
    }

    /**
     * builds OrderReturnInfoSetMessage without checking for non null required values
     */
    public OrderReturnInfoSetMessage buildUnchecked() {
        return new OrderReturnInfoSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, returnInfo);
    }

    public static OrderReturnInfoSetMessageBuilder of() {
        return new OrderReturnInfoSetMessageBuilder();
    }

    public static OrderReturnInfoSetMessageBuilder of(final OrderReturnInfoSetMessage template) {
        OrderReturnInfoSetMessageBuilder builder = new OrderReturnInfoSetMessageBuilder();
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
