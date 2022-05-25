
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeAttributeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeNameAction productTypeChangeAttributeNameAction = ProductTypeChangeAttributeNameAction.builder()
 *             .attributeName("{attributeName}")
 *             .newAttributeName("{newAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeNameActionBuilder implements Builder<ProductTypeChangeAttributeNameAction> {

    private String attributeName;

    private String newAttributeName;

    /**
     *
     */

    public ProductTypeChangeAttributeNameActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     */

    public ProductTypeChangeAttributeNameActionBuilder newAttributeName(final String newAttributeName) {
        this.newAttributeName = newAttributeName;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    public ProductTypeChangeAttributeNameAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeAttributeNameAction.class + ": attributeName is missing");
        Objects.requireNonNull(newAttributeName,
            ProductTypeChangeAttributeNameAction.class + ": newAttributeName is missing");
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    /**
     * builds ProductTypeChangeAttributeNameAction without checking for non null required values
     */
    public ProductTypeChangeAttributeNameAction buildUnchecked() {
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    public static ProductTypeChangeAttributeNameActionBuilder of() {
        return new ProductTypeChangeAttributeNameActionBuilder();
    }

    public static ProductTypeChangeAttributeNameActionBuilder of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionBuilder builder = new ProductTypeChangeAttributeNameActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newAttributeName = template.getNewAttributeName();
        return builder;
    }

}
