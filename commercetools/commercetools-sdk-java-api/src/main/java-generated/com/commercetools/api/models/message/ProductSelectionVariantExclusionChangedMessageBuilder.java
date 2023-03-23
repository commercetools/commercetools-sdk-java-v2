
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionVariantExclusionChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantExclusionChangedMessage productSelectionVariantExclusionChangedMessage = ProductSelectionVariantExclusionChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantExclusion(oldVariantExclusionBuilder -> oldVariantExclusionBuilder)
 *             .newVariantExclusion(newVariantExclusionBuilder -> newVariantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionVariantExclusionChangedMessageBuilder
        implements Builder<ProductSelectionVariantExclusionChangedMessage> {

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

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @param product
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder oldVariantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.oldVariantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @param oldVariantExclusion
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder oldVariantExclusion(
            final com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion) {
        this.oldVariantExclusion = oldVariantExclusion;
        return this;
    }

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder newVariantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.newVariantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @param newVariantExclusion
     * @return Builder
     */

    public ProductSelectionVariantExclusionChangedMessageBuilder newVariantExclusion(
            final com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion) {
        this.newVariantExclusion = newVariantExclusion;
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

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getOldVariantExclusion() {
        return this.oldVariantExclusion;
    }

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getNewVariantExclusion() {
        return this.newVariantExclusion;
    }

    public ProductSelectionVariantExclusionChangedMessage build() {
        Objects.requireNonNull(id, ProductSelectionVariantExclusionChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductSelectionVariantExclusionChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt,
            ProductSelectionVariantExclusionChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            ProductSelectionVariantExclusionChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            ProductSelectionVariantExclusionChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource,
            ProductSelectionVariantExclusionChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ProductSelectionVariantExclusionChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(product, ProductSelectionVariantExclusionChangedMessage.class + ": product is missing");
        Objects.requireNonNull(oldVariantExclusion,
            ProductSelectionVariantExclusionChangedMessage.class + ": oldVariantExclusion is missing");
        Objects.requireNonNull(newVariantExclusion,
            ProductSelectionVariantExclusionChangedMessage.class + ": newVariantExclusion is missing");
        return new ProductSelectionVariantExclusionChangedMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            product, oldVariantExclusion, newVariantExclusion);
    }

    /**
     * builds ProductSelectionVariantExclusionChangedMessage without checking for non null required values
     */
    public ProductSelectionVariantExclusionChangedMessage buildUnchecked() {
        return new ProductSelectionVariantExclusionChangedMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            product, oldVariantExclusion, newVariantExclusion);
    }

    public static ProductSelectionVariantExclusionChangedMessageBuilder of() {
        return new ProductSelectionVariantExclusionChangedMessageBuilder();
    }

    public static ProductSelectionVariantExclusionChangedMessageBuilder of(
            final ProductSelectionVariantExclusionChangedMessage template) {
        ProductSelectionVariantExclusionChangedMessageBuilder builder = new ProductSelectionVariantExclusionChangedMessageBuilder();
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
        builder.product = template.getProduct();
        builder.oldVariantExclusion = template.getOldVariantExclusion();
        builder.newVariantExclusion = template.getNewVariantExclusion();
        return builder;
    }

}
