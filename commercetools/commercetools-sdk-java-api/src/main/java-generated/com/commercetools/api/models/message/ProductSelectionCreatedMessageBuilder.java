
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionCreatedMessageBuilder implements Builder<ProductSelectionCreatedMessage> {

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

    private com.commercetools.api.models.product_selection.ProductSelectionType productSelection;

    public ProductSelectionCreatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductSelectionCreatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductSelectionCreatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public ProductSelectionCreatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductSelectionCreatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionType productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public ProductSelectionCreatedMessageBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionTypeBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionType>> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionTypeBuilder.of())
                .build();
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

    public com.commercetools.api.models.product_selection.ProductSelectionType getProductSelection() {
        return this.productSelection;
    }

    public ProductSelectionCreatedMessage build() {
        Objects.requireNonNull(id, ProductSelectionCreatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductSelectionCreatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductSelectionCreatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductSelectionCreatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductSelectionCreatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductSelectionCreatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductSelectionCreatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(productSelection,
            ProductSelectionCreatedMessage.class + ": productSelection is missing");
        return new ProductSelectionCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, productSelection);
    }

    /**
     * builds ProductSelectionCreatedMessage without checking for non null required values
     */
    public ProductSelectionCreatedMessage buildUnchecked() {
        return new ProductSelectionCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, productSelection);
    }

    public static ProductSelectionCreatedMessageBuilder of() {
        return new ProductSelectionCreatedMessageBuilder();
    }

    public static ProductSelectionCreatedMessageBuilder of(final ProductSelectionCreatedMessage template) {
        ProductSelectionCreatedMessageBuilder builder = new ProductSelectionCreatedMessageBuilder();
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
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
