
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAppliedMessageBuilder implements Builder<OrderEditAppliedMessage> {

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

    private com.commercetools.api.models.order_edit.OrderEditReference edit;

    private com.commercetools.api.models.order_edit.OrderEditApplied result;

    public OrderEditAppliedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderEditAppliedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderEditAppliedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderEditAppliedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderEditAppliedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderEditAppliedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderEditAppliedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderEditAppliedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderEditAppliedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderEditAppliedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderEditAppliedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderEditAppliedMessageBuilder edit(
            Function<com.commercetools.api.models.order_edit.OrderEditReferenceBuilder, com.commercetools.api.models.order_edit.OrderEditReferenceBuilder> builder) {
        this.edit = builder.apply(com.commercetools.api.models.order_edit.OrderEditReferenceBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessageBuilder edit(final com.commercetools.api.models.order_edit.OrderEditReference edit) {
        this.edit = edit;
        return this;
    }

    public OrderEditAppliedMessageBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditAppliedBuilder, com.commercetools.api.models.order_edit.OrderEditAppliedBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessageBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.result = result;
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

    public com.commercetools.api.models.order_edit.OrderEditReference getEdit() {
        return this.edit;
    }

    public com.commercetools.api.models.order_edit.OrderEditApplied getResult() {
        return this.result;
    }

    public OrderEditAppliedMessage build() {
        Objects.requireNonNull(id, OrderEditAppliedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderEditAppliedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderEditAppliedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderEditAppliedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderEditAppliedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderEditAppliedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderEditAppliedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(edit, OrderEditAppliedMessage.class + ": edit is missing");
        Objects.requireNonNull(result, OrderEditAppliedMessage.class + ": result is missing");
        return new OrderEditAppliedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, edit, result);
    }

    /**
     * builds OrderEditAppliedMessage without checking for non null required values
     */
    public OrderEditAppliedMessage buildUnchecked() {
        return new OrderEditAppliedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, edit, result);
    }

    public static OrderEditAppliedMessageBuilder of() {
        return new OrderEditAppliedMessageBuilder();
    }

    public static OrderEditAppliedMessageBuilder of(final OrderEditAppliedMessage template) {
        OrderEditAppliedMessageBuilder builder = new OrderEditAppliedMessageBuilder();
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
        builder.edit = template.getEdit();
        builder.result = template.getResult();
        return builder;
    }

}
