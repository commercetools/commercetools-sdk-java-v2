
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionIncludeOnlyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionIncludeOnly productVariantSelectionIncludeOnly = ProductVariantSelectionIncludeOnly.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionIncludeOnlyBuilder implements Builder<ProductVariantSelectionIncludeOnly> {

    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeOnlyBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeOnlyBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */

    public ProductVariantSelectionIncludeOnlyBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public ProductVariantSelectionIncludeOnly build() {
        Objects.requireNonNull(skus, ProductVariantSelectionIncludeOnly.class + ": skus is missing");
        return new ProductVariantSelectionIncludeOnlyImpl(skus);
    }

    /**
     * builds ProductVariantSelectionIncludeOnly without checking for non null required values
     */
    public ProductVariantSelectionIncludeOnly buildUnchecked() {
        return new ProductVariantSelectionIncludeOnlyImpl(skus);
    }

    public static ProductVariantSelectionIncludeOnlyBuilder of() {
        return new ProductVariantSelectionIncludeOnlyBuilder();
    }

    public static ProductVariantSelectionIncludeOnlyBuilder of(final ProductVariantSelectionIncludeOnly template) {
        ProductVariantSelectionIncludeOnlyBuilder builder = new ProductVariantSelectionIncludeOnlyBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
