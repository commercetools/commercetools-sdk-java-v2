
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderPaymentStateChangedMessageBuilder implements Builder<OrderPaymentStateChangedMessage> {

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

    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState oldPaymentState;

    public OrderPaymentStateChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder paymentState(
            final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderPaymentStateChangedMessageBuilder oldPaymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.oldPaymentState = oldPaymentState;
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

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getOldPaymentState() {
        return this.oldPaymentState;
    }

    public OrderPaymentStateChangedMessage build() {
        Objects.requireNonNull(id, OrderPaymentStateChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderPaymentStateChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderPaymentStateChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderPaymentStateChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderPaymentStateChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderPaymentStateChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderPaymentStateChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(paymentState, OrderPaymentStateChangedMessage.class + ": paymentState is missing");
        return new OrderPaymentStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, paymentState,
            oldPaymentState);
    }

    /**
     * builds OrderPaymentStateChangedMessage without checking for non null required values
     */
    public OrderPaymentStateChangedMessage buildUnchecked() {
        return new OrderPaymentStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, paymentState,
            oldPaymentState);
    }

    public static OrderPaymentStateChangedMessageBuilder of() {
        return new OrderPaymentStateChangedMessageBuilder();
    }

    public static OrderPaymentStateChangedMessageBuilder of(final OrderPaymentStateChangedMessage template) {
        OrderPaymentStateChangedMessageBuilder builder = new OrderPaymentStateChangedMessageBuilder();
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
        builder.paymentState = template.getPaymentState();
        builder.oldPaymentState = template.getOldPaymentState();
        return builder;
    }

}
