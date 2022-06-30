
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
public class ProductVariantSelectionInclusionBuilder implements Builder<ProductVariantSelectionInclusion> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionInclusionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionInclusionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionInclusionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public ProductVariantSelectionInclusion build() {
        Objects.requireNonNull(skus, ProductVariantSelectionInclusion.class + ": skus is missing");
        return new ProductVariantSelectionInclusionImpl(skus);
    }

    /**
     * builds ProductVariantSelectionInclusion without checking for non null required values
     */
    public ProductVariantSelectionInclusion buildUnchecked() {
        return new ProductVariantSelectionInclusionImpl(skus);
    }

    public static ProductVariantSelectionInclusionBuilder of() {
        return new ProductVariantSelectionInclusionBuilder();
    }

    public static ProductVariantSelectionInclusionBuilder of(final ProductVariantSelectionInclusion template) {
        ProductVariantSelectionInclusionBuilder builder = new ProductVariantSelectionInclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
