
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentTransactionStateChangedMessageBuilder implements Builder<PaymentTransactionStateChangedMessage> {

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

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    public PaymentTransactionStateChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentTransactionStateChangedMessageBuilder state(
            final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
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

    public String getTransactionId() {
        return this.transactionId;
    }

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    public PaymentTransactionStateChangedMessage build() {
        Objects.requireNonNull(id, PaymentTransactionStateChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, PaymentTransactionStateChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, PaymentTransactionStateChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            PaymentTransactionStateChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            PaymentTransactionStateChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, PaymentTransactionStateChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            PaymentTransactionStateChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(transactionId,
            PaymentTransactionStateChangedMessage.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentTransactionStateChangedMessage.class + ": state is missing");
        return new PaymentTransactionStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, transactionId,
            state);
    }

    /**
     * builds PaymentTransactionStateChangedMessage without checking for non null required values
     */
    public PaymentTransactionStateChangedMessage buildUnchecked() {
        return new PaymentTransactionStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, transactionId,
            state);
    }

    public static PaymentTransactionStateChangedMessageBuilder of() {
        return new PaymentTransactionStateChangedMessageBuilder();
    }

    public static PaymentTransactionStateChangedMessageBuilder of(
            final PaymentTransactionStateChangedMessage template) {
        PaymentTransactionStateChangedMessageBuilder builder = new PaymentTransactionStateChangedMessageBuilder();
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
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
