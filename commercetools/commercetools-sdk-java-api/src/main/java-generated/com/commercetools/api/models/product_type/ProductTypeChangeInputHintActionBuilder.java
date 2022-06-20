
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
     */

    public ProductTypeChangeInputHintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     */

    public ProductTypeChangeInputHintActionBuilder newValue(
            final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.TextInputHint getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeInputHintAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeInputHintAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangeInputHintAction.class + ": newValue is missing");
        return new ProductTypeChangeInputHintActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeInputHintAction without checking for non null required values
     */
    public ProductTypeChangeInputHintAction buildUnchecked() {
        return new ProductTypeChangeInputHintActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeInputHintActionBuilder of() {
        return new ProductTypeChangeInputHintActionBuilder();
    }

    public static ProductTypeChangeInputHintActionBuilder of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionBuilder builder = new ProductTypeChangeInputHintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
