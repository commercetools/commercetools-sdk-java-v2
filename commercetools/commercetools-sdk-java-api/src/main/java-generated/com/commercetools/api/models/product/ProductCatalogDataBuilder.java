
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductCatalogDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCatalogData productCatalogData = ProductCatalogData.builder()
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .staged(stagedBuilder -> stagedBuilder)
 *             .hasStagedChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductCatalogDataBuilder implements Builder<ProductCatalogData> {

    private Boolean published;

    private com.commercetools.api.models.product.ProductData current;

    private com.commercetools.api.models.product.ProductData staged;

    private Boolean hasStagedChanges;

    /**
     *  <p>If <code>true</code>, the <code>current</code> representation of the Product is retrievable in the <span>Product Projection</span> endpoints and indexed for <span>Product Search</span>.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductCatalogDataBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public ProductCatalogDataBuilder current(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.current = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @param builder function to build the current value
     * @return Builder
     */

    public ProductCatalogDataBuilder withCurrent(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductData> builder) {
        this.current = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of());
        return this;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @param current value to be set
     * @return Builder
     */

    public ProductCatalogDataBuilder current(final com.commercetools.api.models.product.ProductData current) {
        this.current = current;
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public ProductCatalogDataBuilder staged(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public ProductCatalogDataBuilder withStaged(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductData> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of());
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductCatalogDataBuilder staged(final com.commercetools.api.models.product.ProductData staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @param hasStagedChanges value to be set
     * @return Builder
     */

    public ProductCatalogDataBuilder hasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>current</code> representation of the Product is retrievable in the <span>Product Projection</span> endpoints and indexed for <span>Product Search</span>.</p>
     * @return published
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @return current
     */

    public com.commercetools.api.models.product.ProductData getCurrent() {
        return this.current;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @return staged
     */

    public com.commercetools.api.models.product.ProductData getStaged() {
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
     * builds ProductCatalogData with checking for non-null required values
     * @return ProductCatalogData
     */
    public ProductCatalogData build() {
        Objects.requireNonNull(published, ProductCatalogData.class + ": published is missing");
        Objects.requireNonNull(current, ProductCatalogData.class + ": current is missing");
        Objects.requireNonNull(staged, ProductCatalogData.class + ": staged is missing");
        Objects.requireNonNull(hasStagedChanges, ProductCatalogData.class + ": hasStagedChanges is missing");
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    /**
     * builds ProductCatalogData without checking for non-null required values
     * @return ProductCatalogData
     */
    public ProductCatalogData buildUnchecked() {
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    /**
     * factory method for an instance of ProductCatalogDataBuilder
     * @return builder
     */
    public static ProductCatalogDataBuilder of() {
        return new ProductCatalogDataBuilder();
    }

    /**
     * create builder for ProductCatalogData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductCatalogDataBuilder of(final ProductCatalogData template) {
        ProductCatalogDataBuilder builder = new ProductCatalogDataBuilder();
        builder.published = template.getPublished();
        builder.current = template.getCurrent();
        builder.staged = template.getStaged();
        builder.hasStagedChanges = template.getHasStagedChanges();
        return builder;
    }

}
