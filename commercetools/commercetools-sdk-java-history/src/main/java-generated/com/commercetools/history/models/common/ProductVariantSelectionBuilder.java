
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionBuilder implements Builder<ProductVariantSelection> {

    private com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type;

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     * @param type value to be set
     * @return Builder
     */

    public ProductVariantSelectionBuilder type(
            final com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     * @return type
     */

    public com.commercetools.history.models.common.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     * builds ProductVariantSelection with checking for non-null required values
     * @return ProductVariantSelection
     */
    public ProductVariantSelection build() {
        Objects.requireNonNull(type, ProductVariantSelection.class + ": type is missing");
        return new ProductVariantSelectionImpl(type);
    }

    /**
     * builds ProductVariantSelection without checking for non-null required values
     * @return ProductVariantSelection
     */
    public ProductVariantSelection buildUnchecked() {
        return new ProductVariantSelectionImpl(type);
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
        return builder;
    }

}
