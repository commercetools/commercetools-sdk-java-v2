
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringRemovedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringRemovedMessage productVariantTailoringRemovedMessage = ProductVariantTailoringRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringRemovedMessageBuilder implements Builder<ProductVariantTailoringRemovedMessage> {

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

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> removed from the Tailoring.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder variant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder withVariant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        this.variant = builder
                .apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessageBuilder variant(
            final com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> removed from the Tailoring.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
     * @return variant
     */

    public com.commercetools.api.models.product_tailoring.ProductVariantTailoring getVariant() {
        return this.variant;
    }

    /**
     * builds ProductVariantTailoringRemovedMessage with checking for non-null required values
     * @return ProductVariantTailoringRemovedMessage
     */
    public ProductVariantTailoringRemovedMessage build() {
        Objects.requireNonNull(id, ProductVariantTailoringRemovedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductVariantTailoringRemovedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductVariantTailoringRemovedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            ProductVariantTailoringRemovedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            ProductVariantTailoringRemovedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductVariantTailoringRemovedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ProductVariantTailoringRemovedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(store, ProductVariantTailoringRemovedMessage.class + ": store is missing");
        Objects.requireNonNull(product, ProductVariantTailoringRemovedMessage.class + ": product is missing");
        Objects.requireNonNull(variantId, ProductVariantTailoringRemovedMessage.class + ": variantId is missing");
        Objects.requireNonNull(variant, ProductVariantTailoringRemovedMessage.class + ": variant is missing");
        return new ProductVariantTailoringRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, store, productKey,
            product, variantId, variant);
    }

    /**
     * builds ProductVariantTailoringRemovedMessage without checking for non-null required values
     * @return ProductVariantTailoringRemovedMessage
     */
    public ProductVariantTailoringRemovedMessage buildUnchecked() {
        return new ProductVariantTailoringRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, store, productKey,
            product, variantId, variant);
    }

    /**
     * factory method for an instance of ProductVariantTailoringRemovedMessageBuilder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessageBuilder of() {
        return new ProductVariantTailoringRemovedMessageBuilder();
    }

    /**
     * create builder for ProductVariantTailoringRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessageBuilder of(
            final ProductVariantTailoringRemovedMessage template) {
        ProductVariantTailoringRemovedMessageBuilder builder = new ProductVariantTailoringRemovedMessageBuilder();
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
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.variant = template.getVariant();
        return builder;
    }

}
