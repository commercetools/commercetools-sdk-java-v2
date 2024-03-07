
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoring productTailoring = ProductTailoring.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .staged(stagedBuilder -> stagedBuilder)
 *             .hasStagedChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringBuilder implements Builder<ProductTailoring> {

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

    private com.commercetools.api.models.store.StoreKeyReference store;

    private com.commercetools.api.models.product.ProductReference product;

    private Boolean published;

    private com.commercetools.api.models.product_tailoring.ProductTailoringData current;

    private com.commercetools.api.models.product_tailoring.ProductTailoringData staged;

    private Boolean hasStagedChanges;

    /**
     *  <p>Unique identifier of the ProductTailoring.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ProductTailoring.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductTailoringBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductTailoringBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductTailoringBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductTailoringBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductTailoringBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductTailoringBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductTailoringBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductTailoringBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductTailoringBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringBuilder store(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringBuilder product(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductTailoringBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public ProductTailoringBuilder current(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder> builder) {
        this.current = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public ProductTailoringBuilder withCurrent(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringData> builder) {
        this.current = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder.of());
        return this;
    }

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @param current value to be set
     * @return Builder
     */

    public ProductTailoringBuilder current(
            final com.commercetools.api.models.product_tailoring.ProductTailoringData current) {
        this.current = current;
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public ProductTailoringBuilder staged(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public ProductTailoringBuilder withStaged(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringData> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringDataBuilder.of());
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringBuilder staged(
            final com.commercetools.api.models.product_tailoring.ProductTailoringData staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @param hasStagedChanges value to be set
     * @return Builder
     */

    public ProductTailoringBuilder hasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductTailoring.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ProductTailoring.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @return current
     */

    public com.commercetools.api.models.product_tailoring.ProductTailoringData getCurrent() {
        return this.current;
    }

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @return staged
     */

    public com.commercetools.api.models.product_tailoring.ProductTailoringData getStaged() {
        return this.staged;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @return hasStagedChanges
     */

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    /**
     * builds ProductTailoring with checking for non-null required values
     * @return ProductTailoring
     */
    public ProductTailoring build() {
        Objects.requireNonNull(id, ProductTailoring.class + ": id is missing");
        Objects.requireNonNull(version, ProductTailoring.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductTailoring.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductTailoring.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(store, ProductTailoring.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoring.class + ": product is missing");
        Objects.requireNonNull(published, ProductTailoring.class + ": published is missing");
        Objects.requireNonNull(current, ProductTailoring.class + ": current is missing");
        Objects.requireNonNull(staged, ProductTailoring.class + ": staged is missing");
        Objects.requireNonNull(hasStagedChanges, ProductTailoring.class + ": hasStagedChanges is missing");
        return new ProductTailoringImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, store,
            product, published, current, staged, hasStagedChanges);
    }

    /**
     * builds ProductTailoring without checking for non-null required values
     * @return ProductTailoring
     */
    public ProductTailoring buildUnchecked() {
        return new ProductTailoringImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, store,
            product, published, current, staged, hasStagedChanges);
    }

    /**
     * factory method for an instance of ProductTailoringBuilder
     * @return builder
     */
    public static ProductTailoringBuilder of() {
        return new ProductTailoringBuilder();
    }

    /**
     * create builder for ProductTailoring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringBuilder of(final ProductTailoring template) {
        ProductTailoringBuilder builder = new ProductTailoringBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.store = template.getStore();
        builder.product = template.getProduct();
        builder.published = template.getPublished();
        builder.current = template.getCurrent();
        builder.staged = template.getStaged();
        builder.hasStagedChanges = template.getHasStagedChanges();
        return builder;
    }

}
