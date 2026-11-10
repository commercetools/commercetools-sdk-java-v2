
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchMatchingVariantEntryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchMatchingVariantEntry productSearchMatchingVariantEntry = ProductSearchMatchingVariantEntry.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchMatchingVariantEntryBuilder implements Builder<ProductSearchMatchingVariantEntry> {

    private Integer id;

    @Nullable
    private String sku;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that matches the search query.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantEntryBuilder id(final Integer id) {
        this.id = id;
        return this;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant that matches the search query.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantEntryBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that matches the search query.</p>
     * @return id
     */

    public Integer getId() {
        return this.id;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant that matches the search query.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     * builds ProductSearchMatchingVariantEntry with checking for non-null required values
     * @return ProductSearchMatchingVariantEntry
     */
    public ProductSearchMatchingVariantEntry build() {
        Objects.requireNonNull(id, ProductSearchMatchingVariantEntry.class + ": id is missing");
        return new ProductSearchMatchingVariantEntryImpl(id, sku);
    }

    /**
     * builds ProductSearchMatchingVariantEntry without checking for non-null required values
     * @return ProductSearchMatchingVariantEntry
     */
    public ProductSearchMatchingVariantEntry buildUnchecked() {
        return new ProductSearchMatchingVariantEntryImpl(id, sku);
    }

    /**
     * factory method for an instance of ProductSearchMatchingVariantEntryBuilder
     * @return builder
     */
    public static ProductSearchMatchingVariantEntryBuilder of() {
        return new ProductSearchMatchingVariantEntryBuilder();
    }

    /**
     * create builder for ProductSearchMatchingVariantEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchMatchingVariantEntryBuilder of(final ProductSearchMatchingVariantEntry template) {
        ProductSearchMatchingVariantEntryBuilder builder = new ProductSearchMatchingVariantEntryBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        return builder;
    }

}
