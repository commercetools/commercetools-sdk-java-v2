
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeAttributeConstraintActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeConstraintAction productTypeChangeAttributeConstraintAction = ProductTypeChangeAttributeConstraintAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(AttributeConstraintEnumDraft.NONE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeConstraintActionBuilder
        implements Builder<ProductTypeChangeAttributeConstraintAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeConstraintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p><code>None</code></p>
     * @param newValue value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeConstraintActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
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
     *  <p><code>None</code></p>
     * @return newValue
     */

    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue() {
        return this.newValue;
    }

    /**
     * builds ProductTypeChangeAttributeConstraintAction with checking for non-null required values
     * @return ProductTypeChangeAttributeConstraintAction
     */
    public ProductTypeChangeAttributeConstraintAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeAttributeConstraintAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangeAttributeConstraintAction.class + ": newValue is missing");
        return new ProductTypeChangeAttributeConstraintActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeAttributeConstraintAction without checking for non-null required values
     * @return ProductTypeChangeAttributeConstraintAction
     */
    public ProductTypeChangeAttributeConstraintAction buildUnchecked() {
        return new ProductTypeChangeAttributeConstraintActionImpl(attributeName, newValue);
    }

    /**
     * factory method for an instance of ProductTypeChangeAttributeConstraintActionBuilder
     * @return builder
     */
    public static ProductTypeChangeAttributeConstraintActionBuilder of() {
        return new ProductTypeChangeAttributeConstraintActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeAttributeConstraintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeAttributeConstraintActionBuilder of(
            final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionBuilder builder = new ProductTypeChangeAttributeConstraintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
