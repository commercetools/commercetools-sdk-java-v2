
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionVariantSelectionChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantSelectionChangedMessage productSelectionVariantSelectionChangedMessage = ProductSelectionVariantSelectionChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantSelection(oldVariantSelectionBuilder -> oldVariantSelectionBuilder)
 *             .newVariantSelection(newVariantSelectionBuilder -> newVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionVariantSelectionChangedMessageBuilder
        implements Builder<ProductSelectionVariantSelectionChangedMessage> {

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

    private com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder oldVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection) {
        this.oldVariantSelection = oldVariantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder oldVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.oldVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder newVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection) {
        this.newVariantSelection = newVariantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     */

    public ProductSelectionVariantSelectionChangedMessageBuilder newVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.newVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
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

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.api.models.product_selection.ProductVariantSelection getOldVariantSelection() {
        return this.oldVariantSelection;
    }

    public com.commercetools.api.models.product_selection.ProductVariantSelection getNewVariantSelection() {
        return this.newVariantSelection;
    }

    public ProductSelectionVariantSelectionChangedMessage build() {
        Objects.requireNonNull(id, ProductSelectionVariantSelectionChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductSelectionVariantSelectionChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt,
            ProductSelectionVariantSelectionChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            ProductSelectionVariantSelectionChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            ProductSelectionVariantSelectionChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource,
            ProductSelectionVariantSelectionChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ProductSelectionVariantSelectionChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(product, ProductSelectionVariantSelectionChangedMessage.class + ": product is missing");
        Objects.requireNonNull(oldVariantSelection,
            ProductSelectionVariantSelectionChangedMessage.class + ": oldVariantSelection is missing");
        Objects.requireNonNull(newVariantSelection,
            ProductSelectionVariantSelectionChangedMessage.class + ": newVariantSelection is missing");
        return new ProductSelectionVariantSelectionChangedMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            product, oldVariantSelection, newVariantSelection);
    }

    /**
     * builds ProductSelectionVariantSelectionChangedMessage without checking for non null required values
     */
    public ProductSelectionVariantSelectionChangedMessage buildUnchecked() {
        return new ProductSelectionVariantSelectionChangedMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            product, oldVariantSelection, newVariantSelection);
    }

    public static ProductSelectionVariantSelectionChangedMessageBuilder of() {
        return new ProductSelectionVariantSelectionChangedMessageBuilder();
    }

    public static ProductSelectionVariantSelectionChangedMessageBuilder of(
            final ProductSelectionVariantSelectionChangedMessage template) {
        ProductSelectionVariantSelectionChangedMessageBuilder builder = new ProductSelectionVariantSelectionChangedMessageBuilder();
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
        builder.oldVariantSelection = template.getOldVariantSelection();
        builder.newVariantSelection = template.getNewVariantSelection();
        return builder;
    }

}
