
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerEmailVerifiedMessageBuilder implements Builder<CustomerEmailVerifiedMessage> {

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

    public CustomerEmailVerifiedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public CustomerEmailVerifiedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
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

    public CustomerEmailVerifiedMessage build() {
        Objects.requireNonNull(id, CustomerEmailVerifiedMessage.class + ": id is missing");
        Objects.requireNonNull(version, CustomerEmailVerifiedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomerEmailVerifiedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomerEmailVerifiedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, CustomerEmailVerifiedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, CustomerEmailVerifiedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, CustomerEmailVerifiedMessage.class + ": resourceVersion is missing");
        return new CustomerEmailVerifiedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers);
    }

    /**
     * builds CustomerEmailVerifiedMessage without checking for non null required values
     */
    public CustomerEmailVerifiedMessage buildUnchecked() {
        return new CustomerEmailVerifiedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers);
    }

    public static CustomerEmailVerifiedMessageBuilder of() {
        return new CustomerEmailVerifiedMessageBuilder();
    }

    public static CustomerEmailVerifiedMessageBuilder of(final CustomerEmailVerifiedMessage template) {
        CustomerEmailVerifiedMessageBuilder builder = new CustomerEmailVerifiedMessageBuilder();
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
        return builder;
    }

}
