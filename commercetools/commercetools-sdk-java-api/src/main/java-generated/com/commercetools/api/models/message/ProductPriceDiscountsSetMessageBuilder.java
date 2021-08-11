
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceDiscountsSetMessageBuilder implements Builder<ProductPriceDiscountsSetMessage> {

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

    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    public ProductPriceDiscountsSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder updatedPrices(
            final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice... updatedPrices) {
        this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder withUpdatedPrices(
            Function<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder, com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder> builder) {
        this.updatedPrices = new ArrayList<>();
        this.updatedPrices.add(
            builder.apply(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder.of())
                    .build());
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder plusUpdatedPrices(
            Function<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder, com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder> builder) {
        if (this.updatedPrices == null) {
            this.updatedPrices = new ArrayList<>();
        }
        this.updatedPrices.add(
            builder.apply(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder.of())
                    .build());
        return this;
    }

    public ProductPriceDiscountsSetMessageBuilder updatedPrices(
            final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
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

    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices() {
        return this.updatedPrices;
    }

    public ProductPriceDiscountsSetMessage build() {
        Objects.requireNonNull(id, ProductPriceDiscountsSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductPriceDiscountsSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductPriceDiscountsSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductPriceDiscountsSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductPriceDiscountsSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductPriceDiscountsSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductPriceDiscountsSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(updatedPrices, ProductPriceDiscountsSetMessage.class + ": updatedPrices is missing");
        return new ProductPriceDiscountsSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, updatedPrices);
    }

    /**
     * builds ProductPriceDiscountsSetMessage without checking for non null required values
     */
    public ProductPriceDiscountsSetMessage buildUnchecked() {
        return new ProductPriceDiscountsSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, updatedPrices);
    }

    public static ProductPriceDiscountsSetMessageBuilder of() {
        return new ProductPriceDiscountsSetMessageBuilder();
    }

    public static ProductPriceDiscountsSetMessageBuilder of(final ProductPriceDiscountsSetMessage template) {
        ProductPriceDiscountsSetMessageBuilder builder = new ProductPriceDiscountsSetMessageBuilder();
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
        builder.updatedPrices = template.getUpdatedPrices();
        return builder;
    }

}
