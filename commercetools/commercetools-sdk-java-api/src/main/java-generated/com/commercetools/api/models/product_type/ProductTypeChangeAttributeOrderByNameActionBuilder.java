
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeAttributeOrderByNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeOrderByNameAction productTypeChangeAttributeOrderByNameAction = ProductTypeChangeAttributeOrderByNameAction.builder()
 *             .plusAttributeNames(attributeNamesBuilder -> attributeNamesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeOrderByNameActionBuilder
        implements Builder<ProductTypeChangeAttributeOrderByNameAction> {

    private java.util.List<String> attributeNames;

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @param attributeNames value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeOrderByNameActionBuilder attributeNames(final String... attributeNames) {
        this.attributeNames = new ArrayList<>(Arrays.asList(attributeNames));
        return this;
    }

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @param attributeNames value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeOrderByNameActionBuilder attributeNames(
            final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        return this;
    }

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @param attributeNames value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeOrderByNameActionBuilder plusAttributeNames(final String... attributeNames) {
        if (this.attributeNames == null) {
            this.attributeNames = new ArrayList<>();
        }
        this.attributeNames.addAll(Arrays.asList(attributeNames));
        return this;
    }

    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    /**
     * builds ProductTypeChangeAttributeOrderByNameAction with checking for non-null required values
     * @return ProductTypeChangeAttributeOrderByNameAction
     */
    public ProductTypeChangeAttributeOrderByNameAction build() {
        Objects.requireNonNull(attributeNames,
            ProductTypeChangeAttributeOrderByNameAction.class + ": attributeNames is missing");
        return new ProductTypeChangeAttributeOrderByNameActionImpl(attributeNames);
    }

    /**
     * builds ProductTypeChangeAttributeOrderByNameAction without checking for non-null required values
     * @return ProductTypeChangeAttributeOrderByNameAction
     */
    public ProductTypeChangeAttributeOrderByNameAction buildUnchecked() {
        return new ProductTypeChangeAttributeOrderByNameActionImpl(attributeNames);
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder of() {
        return new ProductTypeChangeAttributeOrderByNameActionBuilder();
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder of(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        ProductTypeChangeAttributeOrderByNameActionBuilder builder = new ProductTypeChangeAttributeOrderByNameActionBuilder();
        builder.attributeNames = template.getAttributeNames();
        return builder;
    }

}
