
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionIncludeAllExceptBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionIncludeAllExcept productVariantSelectionIncludeAllExcept = ProductVariantSelectionIncludeAllExcept.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionIncludeAllExceptBuilder
        implements Builder<ProductVariantSelectionIncludeAllExcept> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeAllExceptBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeAllExceptBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeAllExceptBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public ProductVariantSelectionIncludeAllExcept build() {
        Objects.requireNonNull(skus, ProductVariantSelectionIncludeAllExcept.class + ": skus is missing");
        return new ProductVariantSelectionIncludeAllExceptImpl(skus);
    }

    /**
     * builds ProductVariantSelectionIncludeAllExcept without checking for non null required values
     */
    public ProductVariantSelectionIncludeAllExcept buildUnchecked() {
        return new ProductVariantSelectionIncludeAllExceptImpl(skus);
    }

    public static ProductVariantSelectionIncludeAllExceptBuilder of() {
        return new ProductVariantSelectionIncludeAllExceptBuilder();
    }

    public static ProductVariantSelectionIncludeAllExceptBuilder of(
            final ProductVariantSelectionIncludeAllExcept template) {
        ProductVariantSelectionIncludeAllExceptBuilder builder = new ProductVariantSelectionIncludeAllExceptBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
