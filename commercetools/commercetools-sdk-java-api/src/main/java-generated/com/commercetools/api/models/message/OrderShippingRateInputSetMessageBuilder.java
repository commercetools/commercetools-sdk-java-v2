
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderShippingRateInputSetMessageBuilder implements Builder<OrderShippingRateInputSetMessage> {

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
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput;

    public OrderShippingRateInputSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    public OrderShippingRateInputSetMessageBuilder oldShippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput) {
        this.oldShippingRateInput = oldShippingRateInput;
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
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getOldShippingRateInput() {
        return this.oldShippingRateInput;
    }

    public OrderShippingRateInputSetMessage build() {
        Objects.requireNonNull(id, OrderShippingRateInputSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderShippingRateInputSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderShippingRateInputSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderShippingRateInputSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderShippingRateInputSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderShippingRateInputSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            OrderShippingRateInputSetMessage.class + ": resourceVersion is missing");
        return new OrderShippingRateInputSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, shippingRateInput,
            oldShippingRateInput);
    }

    /**
     * builds OrderShippingRateInputSetMessage without checking for non null required values
     */
    public OrderShippingRateInputSetMessage buildUnchecked() {
        return new OrderShippingRateInputSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, shippingRateInput,
            oldShippingRateInput);
    }

    public static OrderShippingRateInputSetMessageBuilder of() {
        return new OrderShippingRateInputSetMessageBuilder();
    }

    public static OrderShippingRateInputSetMessageBuilder of(final OrderShippingRateInputSetMessage template) {
        OrderShippingRateInputSetMessageBuilder builder = new OrderShippingRateInputSetMessageBuilder();
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
        builder.shippingRateInput = template.getShippingRateInput();
        builder.oldShippingRateInput = template.getOldShippingRateInput();
        return builder;
    }

}
