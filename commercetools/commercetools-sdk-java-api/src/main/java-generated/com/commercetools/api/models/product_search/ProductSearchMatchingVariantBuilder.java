
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchMatchingVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchMatchingVariant productSearchMatchingVariant = ProductSearchMatchingVariant.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchMatchingVariantBuilder implements Builder<ProductSearchMatchingVariant> {

    private Integer id;

    @Nullable
    private String sku;

    /**
     *  <p>Unique identifier of the variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantBuilder id(final Integer id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>SKU of the matching variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the variant.</p>
     * @return id
     */

    public Integer getId() {
        return this.id;
    }

    /**
     *  <p>SKU of the matching variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     * builds ProductSearchMatchingVariant with checking for non-null required values
     * @return ProductSearchMatchingVariant
     */
    public ProductSearchMatchingVariant build() {
        Objects.requireNonNull(id, ProductSearchMatchingVariant.class + ": id is missing");
        return new ProductSearchMatchingVariantImpl(id, sku);
    }

    /**
     * builds ProductSearchMatchingVariant without checking for non-null required values
     * @return ProductSearchMatchingVariant
     */
    public ProductSearchMatchingVariant buildUnchecked() {
        return new ProductSearchMatchingVariantImpl(id, sku);
    }

    /**
     * factory method for an instance of ProductSearchMatchingVariantBuilder
     * @return builder
     */
    public static ProductSearchMatchingVariantBuilder of() {
        return new ProductSearchMatchingVariantBuilder();
    }

    /**
     * create builder for ProductSearchMatchingVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchMatchingVariantBuilder of(final ProductSearchMatchingVariant template) {
        ProductSearchMatchingVariantBuilder builder = new ProductSearchMatchingVariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        return builder;
    }

}
