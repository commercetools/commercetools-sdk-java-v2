
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
     */

    public ProductTypeChangeAttributeConstraintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p><code>None</code></p>
     */

    public ProductTypeChangeAttributeConstraintActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeAttributeConstraintAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeAttributeConstraintAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangeAttributeConstraintAction.class + ": newValue is missing");
        return new ProductTypeChangeAttributeConstraintActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeAttributeConstraintAction without checking for non null required values
     */
    public ProductTypeChangeAttributeConstraintAction buildUnchecked() {
        return new ProductTypeChangeAttributeConstraintActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder of() {
        return new ProductTypeChangeAttributeConstraintActionBuilder();
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder of(
            final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionBuilder builder = new ProductTypeChangeAttributeConstraintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
