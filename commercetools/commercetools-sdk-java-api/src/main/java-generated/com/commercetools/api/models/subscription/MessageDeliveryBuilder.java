
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MessageDeliveryBuilder {

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

    public MessageDeliveryBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public MessageDeliveryBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public MessageDeliveryBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public MessageDeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public MessageDeliveryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MessageDeliveryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MessageDeliveryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public MessageDeliveryBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public MessageDeliveryBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public MessageDeliveryBuilder payloadNotIncluded(
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

    public MessageDelivery build() {
        return new MessageDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, id, version, createdAt,
            lastModifiedAt, sequenceNumber, resourceVersion, payloadNotIncluded);
    }

    public static MessageDeliveryBuilder of() {
        return new MessageDeliveryBuilder();
    }

    public static MessageDeliveryBuilder of(final MessageDelivery template) {
        MessageDeliveryBuilder builder = new MessageDeliveryBuilder();
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
