
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Variant variant = Variant.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .variantId(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBuilder implements Builder<Variant> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private Integer variantId;

    private com.commercetools.api.models.product.ProductReference product;

    private Boolean published;

    private com.commercetools.api.models.variant.VariantData current;

    @Nullable
    private com.commercetools.api.models.variant.VariantData staged;

    @Nullable
    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Variant.</p>
     * @param version value to be set
     * @return Builder
     */

    public VariantBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Variant was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public VariantBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Variant was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public VariantBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public VariantBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public VariantBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public VariantBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public VariantBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public VariantBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public VariantBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Variant. This is different from <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>key</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>A unique, sequential identifier of the Variant within the parent Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public VariantBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantBuilder product(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Whether the Variant is published, <code>false</code> if it is unpublished.</p>
     * @param published value to be set
     * @return Builder
     */

    public VariantBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>The current data of the Variant.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public VariantBuilder current(
            Function<com.commercetools.api.models.variant.VariantDataBuilder, com.commercetools.api.models.variant.VariantDataBuilder> builder) {
        this.current = builder.apply(com.commercetools.api.models.variant.VariantDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The current data of the Variant.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public VariantBuilder withCurrent(
            Function<com.commercetools.api.models.variant.VariantDataBuilder, com.commercetools.api.models.variant.VariantData> builder) {
        this.current = builder.apply(com.commercetools.api.models.variant.VariantDataBuilder.of());
        return this;
    }

    /**
     *  <p>The current data of the Variant.</p>
     * @param current value to be set
     * @return Builder
     */

    public VariantBuilder current(final com.commercetools.api.models.variant.VariantData current) {
        this.current = current;
        return this;
    }

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public VariantBuilder staged(
            Function<com.commercetools.api.models.variant.VariantDataBuilder, com.commercetools.api.models.variant.VariantDataBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.variant.VariantDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public VariantBuilder withStaged(
            Function<com.commercetools.api.models.variant.VariantDataBuilder, com.commercetools.api.models.variant.VariantData> builder) {
        this.staged = builder.apply(com.commercetools.api.models.variant.VariantDataBuilder.of());
        return this;
    }

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantBuilder staged(@Nullable final com.commercetools.api.models.variant.VariantData staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public VariantBuilder warnings(@Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public VariantBuilder warnings(
            @Nullable final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public VariantBuilder plusWarnings(@Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.addAll(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param builder function to build the warnings value
     * @return Builder
     */

    public VariantBuilder plusWarnings(
            Function<com.commercetools.api.models.warning.WarningObjectBuilder, Builder<? extends com.commercetools.api.models.warning.WarningObject>> builder) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(builder.apply(com.commercetools.api.models.warning.WarningObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param builder function to build the warnings value
     * @return Builder
     */

    public VariantBuilder withWarnings(
            Function<com.commercetools.api.models.warning.WarningObjectBuilder, Builder<? extends com.commercetools.api.models.warning.WarningObject>> builder) {
        this.warnings = new ArrayList<>();
        this.warnings.add(builder.apply(com.commercetools.api.models.warning.WarningObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Variant.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Variant was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Variant was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Variant. This is different from <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>key</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>A unique, sequential identifier of the Variant within the parent Product.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Whether the Variant is published, <code>false</code> if it is unpublished.</p>
     * @return published
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>The current data of the Variant.</p>
     * @return current
     */

    public com.commercetools.api.models.variant.VariantData getCurrent() {
        return this.current;
    }

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @return staged
     */

    @Nullable
    public com.commercetools.api.models.variant.VariantData getStaged() {
        return this.staged;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @return warnings
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.warning.WarningObject> getWarnings() {
        return this.warnings;
    }

    /**
     * builds Variant with checking for non-null required values
     * @return Variant
     */
    public Variant build() {
        Objects.requireNonNull(id, Variant.class + ": id is missing");
        Objects.requireNonNull(version, Variant.class + ": version is missing");
        Objects.requireNonNull(createdAt, Variant.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Variant.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(variantId, Variant.class + ": variantId is missing");
        Objects.requireNonNull(product, Variant.class + ": product is missing");
        Objects.requireNonNull(published, Variant.class + ": published is missing");
        Objects.requireNonNull(current, Variant.class + ": current is missing");
        return new VariantImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, variantId,
            product, published, current, staged, warnings);
    }

    /**
     * builds Variant without checking for non-null required values
     * @return Variant
     */
    public Variant buildUnchecked() {
        return new VariantImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, variantId,
            product, published, current, staged, warnings);
    }

    /**
     * factory method for an instance of VariantBuilder
     * @return builder
     */
    public static VariantBuilder of() {
        return new VariantBuilder();
    }

    /**
     * create builder for Variant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBuilder of(final Variant template) {
        VariantBuilder builder = new VariantBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.variantId = template.getVariantId();
        builder.product = template.getProduct();
        builder.published = template.getPublished();
        builder.current = template.getCurrent();
        builder.staged = template.getStaged();
        builder.warnings = template.getWarnings();
        return builder;
    }

}
