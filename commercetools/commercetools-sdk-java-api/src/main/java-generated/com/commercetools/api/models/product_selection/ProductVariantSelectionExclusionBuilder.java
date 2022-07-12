
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionExclusionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionExclusion productVariantSelectionExclusion = ProductVariantSelectionExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionExclusionBuilder implements Builder<ProductVariantSelectionExclusion> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionExclusionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionExclusionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionExclusionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public ProductVariantSelectionExclusion build() {
        Objects.requireNonNull(skus, ProductVariantSelectionExclusion.class + ": skus is missing");
        return new ProductVariantSelectionExclusionImpl(skus);
    }

    /**
     * builds ProductVariantSelectionExclusion without checking for non null required values
     */
    public ProductVariantSelectionExclusion buildUnchecked() {
        return new ProductVariantSelectionExclusionImpl(skus);
    }

    public static ProductVariantSelectionExclusionBuilder of() {
        return new ProductVariantSelectionExclusionBuilder();
    }

    public static ProductVariantSelectionExclusionBuilder of(final ProductVariantSelectionExclusion template) {
        ProductVariantSelectionExclusionBuilder builder = new ProductVariantSelectionExclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
