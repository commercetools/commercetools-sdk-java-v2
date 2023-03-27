
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeInputHintActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeInputHintAction productTypeChangeInputHintAction = ProductTypeChangeInputHintAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeInputHintActionBuilder implements Builder<ProductTypeChangeInputHintAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.TextInputHint newValue;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeInputHintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     * @param newValue value to be set
     * @return Builder
     */

    public ProductTypeChangeInputHintActionBuilder newValue(
            final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     * @return newValue
     */

    public com.commercetools.api.models.product_type.TextInputHint getNewValue() {
        return this.newValue;
    }

    /**
     * builds ProductTypeChangeInputHintAction with checking for non-null required values
     * @return ProductTypeChangeInputHintAction
     */
    public ProductTypeChangeInputHintAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeInputHintAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangeInputHintAction.class + ": newValue is missing");
        return new ProductTypeChangeInputHintActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeInputHintAction without checking for non-null required values
     * @return ProductTypeChangeInputHintAction
     */
    public ProductTypeChangeInputHintAction buildUnchecked() {
        return new ProductTypeChangeInputHintActionImpl(attributeName, newValue);
    }

    /**
     * factory method for an instance of ProductTypeChangeInputHintActionBuilder
     * @return builder
     */
    public static ProductTypeChangeInputHintActionBuilder of() {
        return new ProductTypeChangeInputHintActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeInputHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeInputHintActionBuilder of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionBuilder builder = new ProductTypeChangeInputHintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
