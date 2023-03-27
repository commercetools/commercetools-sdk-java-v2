
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
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionIncludeOnlyBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionIncludeOnlyBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionIncludeOnlyBuilder plusSkus(final String... skus) {
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
     * builds ProductVariantSelectionIncludeOnly with checking for non-null required values
     * @return ProductVariantSelectionIncludeOnly
     */
    public ProductVariantSelectionIncludeOnly build() {
        Objects.requireNonNull(skus, ProductVariantSelectionIncludeOnly.class + ": skus is missing");
        return new ProductVariantSelectionIncludeOnlyImpl(skus);
    }

    /**
     * builds ProductVariantSelectionIncludeOnly without checking for non-null required values
     * @return ProductVariantSelectionIncludeOnly
     */
    public ProductVariantSelectionIncludeOnly buildUnchecked() {
        return new ProductVariantSelectionIncludeOnlyImpl(skus);
    }

    /**
     * factory method for an instance of ProductVariantSelectionIncludeOnlyBuilder
     * @return builder
     */
    public static ProductVariantSelectionIncludeOnlyBuilder of() {
        return new ProductVariantSelectionIncludeOnlyBuilder();
    }

    /**
     * create builder for ProductVariantSelectionIncludeOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionIncludeOnlyBuilder of(final ProductVariantSelectionIncludeOnly template) {
        ProductVariantSelectionIncludeOnlyBuilder builder = new ProductVariantSelectionIncludeOnlyBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
