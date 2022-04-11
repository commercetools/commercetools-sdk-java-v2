
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MessageDeliveryPayloadBuilder implements Builder<MessageDeliveryPayload> {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private Long sequenceNumber;

    private Long resourceVersion;

    private com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded;

    public MessageDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public MessageDeliveryPayloadBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public MessageDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public MessageDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public MessageDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public MessageDeliveryPayloadBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public MessageDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MessageDeliveryPayloadBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MessageDeliveryPayloadBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public MessageDeliveryPayloadBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public MessageDeliveryPayloadBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public MessageDeliveryPayloadBuilder payloadNotIncluded(
            Function<com.commercetools.api.models.subscription.PayloadNotIncludedBuilder, com.commercetools.api.models.subscription.PayloadNotIncludedBuilder> builder) {
        this.payloadNotIncluded = builder
                .apply(com.commercetools.api.models.subscription.PayloadNotIncludedBuilder.of())
                .build();
        return this;
    }

    public MessageDeliveryPayloadBuilder payloadNotIncluded(
            final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded) {
        this.payloadNotIncluded = payloadNotIncluded;
        return this;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
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

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    public com.commercetools.api.models.subscription.PayloadNotIncluded getPayloadNotIncluded() {
        return this.payloadNotIncluded;
    }

    public MessageDeliveryPayload build() {
        Objects.requireNonNull(projectKey, MessageDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, MessageDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(id, MessageDeliveryPayload.class + ": id is missing");
        Objects.requireNonNull(version, MessageDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(createdAt, MessageDeliveryPayload.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, MessageDeliveryPayload.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, MessageDeliveryPayload.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resourceVersion, MessageDeliveryPayload.class + ": resourceVersion is missing");
        Objects.requireNonNull(payloadNotIncluded, MessageDeliveryPayload.class + ": payloadNotIncluded is missing");
        return new MessageDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, id, version,
            createdAt, lastModifiedAt, sequenceNumber, resourceVersion, payloadNotIncluded);
    }

    /**
     * builds MessageDeliveryPayload without checking for non null required values
     */
    public MessageDeliveryPayload buildUnchecked() {
        return new MessageDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, id, version,
            createdAt, lastModifiedAt, sequenceNumber, resourceVersion, payloadNotIncluded);
    }

    public static MessageDeliveryPayloadBuilder of() {
        return new MessageDeliveryPayloadBuilder();
    }

    public static MessageDeliveryPayloadBuilder of(final MessageDeliveryPayload template) {
        MessageDeliveryPayloadBuilder builder = new MessageDeliveryPayloadBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resourceVersion = template.getResourceVersion();
        builder.payloadNotIncluded = template.getPayloadNotIncluded();
        return builder;
    }

}
