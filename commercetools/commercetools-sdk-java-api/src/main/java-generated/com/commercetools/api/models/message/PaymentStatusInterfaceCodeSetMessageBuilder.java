
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentStatusInterfaceCodeSetMessageBuilder implements Builder<PaymentStatusInterfaceCodeSetMessage> {

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

    private String paymentId;

    private String interfaceCode;

    public PaymentStatusInterfaceCodeSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder paymentId(final String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessageBuilder interfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
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

    public String getPaymentId() {
        return this.paymentId;
    }

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public PaymentStatusInterfaceCodeSetMessage build() {
        Objects.requireNonNull(id, PaymentStatusInterfaceCodeSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, PaymentStatusInterfaceCodeSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, PaymentStatusInterfaceCodeSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            PaymentStatusInterfaceCodeSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            PaymentStatusInterfaceCodeSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, PaymentStatusInterfaceCodeSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            PaymentStatusInterfaceCodeSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(paymentId, PaymentStatusInterfaceCodeSetMessage.class + ": paymentId is missing");
        Objects.requireNonNull(interfaceCode,
            PaymentStatusInterfaceCodeSetMessage.class + ": interfaceCode is missing");
        return new PaymentStatusInterfaceCodeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, paymentId,
            interfaceCode);
    }

    /**
     * builds PaymentStatusInterfaceCodeSetMessage without checking for non null required values
     */
    public PaymentStatusInterfaceCodeSetMessage buildUnchecked() {
        return new PaymentStatusInterfaceCodeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, paymentId,
            interfaceCode);
    }

    public static PaymentStatusInterfaceCodeSetMessageBuilder of() {
        return new PaymentStatusInterfaceCodeSetMessageBuilder();
    }

    public static PaymentStatusInterfaceCodeSetMessageBuilder of(final PaymentStatusInterfaceCodeSetMessage template) {
        PaymentStatusInterfaceCodeSetMessageBuilder builder = new PaymentStatusInterfaceCodeSetMessageBuilder();
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
        builder.paymentId = template.getPaymentId();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
