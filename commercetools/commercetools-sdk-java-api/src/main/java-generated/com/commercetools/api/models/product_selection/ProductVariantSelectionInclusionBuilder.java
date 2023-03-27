
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionInclusionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionInclusion productVariantSelectionInclusion = ProductVariantSelectionInclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ProductVariantSelectionInclusionBuilder implements Builder<ProductVariantSelectionInclusion> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionInclusionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionInclusionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionInclusionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @return skus
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds ProductVariantSelectionInclusion with checking for non-null required values
     * @return ProductVariantSelectionInclusion
     */
    public ProductVariantSelectionInclusion build() {
        Objects.requireNonNull(skus, ProductVariantSelectionInclusion.class + ": skus is missing");
        return new ProductVariantSelectionInclusionImpl(skus);
    }

    /**
     * builds ProductVariantSelectionInclusion without checking for non-null required values
     * @return ProductVariantSelectionInclusion
     */
    public ProductVariantSelectionInclusion buildUnchecked() {
        return new ProductVariantSelectionInclusionImpl(skus);
    }

    /**
     * factory method for an instance of ProductVariantSelectionInclusionBuilder
     * @return builder
     */
    public static ProductVariantSelectionInclusionBuilder of() {
        return new ProductVariantSelectionInclusionBuilder();
    }

    /**
     * create builder for ProductVariantSelectionInclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionInclusionBuilder of(final ProductVariantSelectionInclusion template) {
        ProductVariantSelectionInclusionBuilder builder = new ProductVariantSelectionInclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
