
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantExclusionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantExclusion productVariantExclusion = ProductVariantExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantExclusionBuilder implements Builder<ProductVariantExclusion> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantExclusionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantExclusionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantExclusionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @return skus
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds ProductVariantExclusion with checking for non-null required values
     * @return ProductVariantExclusion
     */
    public ProductVariantExclusion build() {
        Objects.requireNonNull(skus, ProductVariantExclusion.class + ": skus is missing");
        return new ProductVariantExclusionImpl(skus);
    }

    /**
     * builds ProductVariantExclusion without checking for non-null required values
     * @return ProductVariantExclusion
     */
    public ProductVariantExclusion buildUnchecked() {
        return new ProductVariantExclusionImpl(skus);
    }

    /**
     * factory method for an instance of ProductVariantExclusionBuilder
     * @return builder
     */
    public static ProductVariantExclusionBuilder of() {
        return new ProductVariantExclusionBuilder();
    }

    /**
     * create builder for ProductVariantExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantExclusionBuilder of(final ProductVariantExclusion template) {
        ProductVariantExclusionBuilder builder = new ProductVariantExclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
