
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.builder()
 *             .type(ProductVariantSelectionTypeEnum.INCLUSION)
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionBuilder implements Builder<ProductVariantSelection> {

    private com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type;

    private java.util.List<String> skus;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public ProductVariantSelectionBuilder type(
            final com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * set values to the skus
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     * set value to the skus
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     * add values to the skus
     * @param skus value to be set
     * @return Builder
     */

    public ProductVariantSelectionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public com.commercetools.history.models.common.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     * value of skus}
     * @return skus
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds ProductVariantSelection with checking for non-null required values
     * @return ProductVariantSelection
     */
    public ProductVariantSelection build() {
        Objects.requireNonNull(type, ProductVariantSelection.class + ": type is missing");
        Objects.requireNonNull(skus, ProductVariantSelection.class + ": skus is missing");
        return new ProductVariantSelectionImpl(type, skus);
    }

    /**
     * builds ProductVariantSelection without checking for non-null required values
     * @return ProductVariantSelection
     */
    public ProductVariantSelection buildUnchecked() {
        return new ProductVariantSelectionImpl(type, skus);
    }

    /**
     * factory method for an instance of ProductVariantSelectionBuilder
     * @return builder
     */
    public static ProductVariantSelectionBuilder of() {
        return new ProductVariantSelectionBuilder();
    }

    /**
     * create builder for ProductVariantSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionBuilder of(final ProductVariantSelection template) {
        ProductVariantSelectionBuilder builder = new ProductVariantSelectionBuilder();
        builder.type = template.getType();
        builder.skus = template.getSkus();
        return builder;
    }

}
