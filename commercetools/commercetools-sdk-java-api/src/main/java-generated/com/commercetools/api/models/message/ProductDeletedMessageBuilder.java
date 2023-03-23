
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDeletedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessage productDeletedMessage = ProductDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDeletedMessageBuilder implements Builder<ProductDeletedMessage> {

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

    private java.util.List<String> removedImageUrls;

    @Nullable
    private com.commercetools.api.models.product.ProductProjection currentProjection;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public ProductDeletedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public ProductDeletedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public ProductDeletedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public ProductDeletedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public ProductDeletedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public ProductDeletedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ProductDeletedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public ProductDeletedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public ProductDeletedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public ProductDeletedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public ProductDeletedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public ProductDeletedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public ProductDeletedMessageBuilder resourceUserProvidedIdentifiers(
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

    public ProductDeletedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductDeletedMessageBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductDeletedMessageBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductDeletedMessageBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @return Builder
     */

    public ProductDeletedMessageBuilder currentProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.currentProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param currentProjection
     * @return Builder
     */

    public ProductDeletedMessageBuilder currentProjection(
            @Nullable final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.currentProjection = currentProjection;
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

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductProjection getCurrentProjection() {
        return this.currentProjection;
    }

    public ProductDeletedMessage build() {
        Objects.requireNonNull(id, ProductDeletedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductDeletedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductDeletedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductDeletedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductDeletedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductDeletedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductDeletedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(removedImageUrls, ProductDeletedMessage.class + ": removedImageUrls is missing");
        return new ProductDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, removedImageUrls,
            currentProjection);
    }

    /**
     * builds ProductDeletedMessage without checking for non null required values
     */
    public ProductDeletedMessage buildUnchecked() {
        return new ProductDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, removedImageUrls,
            currentProjection);
    }

    public static ProductDeletedMessageBuilder of() {
        return new ProductDeletedMessageBuilder();
    }

    public static ProductDeletedMessageBuilder of(final ProductDeletedMessage template) {
        ProductDeletedMessageBuilder builder = new ProductDeletedMessageBuilder();
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
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.currentProjection = template.getCurrentProjection();
        return builder;
    }

}
