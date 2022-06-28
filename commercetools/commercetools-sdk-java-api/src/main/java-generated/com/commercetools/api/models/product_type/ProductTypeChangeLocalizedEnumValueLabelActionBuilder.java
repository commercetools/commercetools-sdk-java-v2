
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLocalizedEnumValueLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLocalizedEnumValueLabelAction productTypeChangeLocalizedEnumValueLabelAction = ProductTypeChangeLocalizedEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeLocalizedEnumValueLabelActionBuilder
        implements Builder<ProductTypeChangeLocalizedEnumValueLabelAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.newValue = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeLocalizedEnumValueLabelAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeLocalizedEnumValueLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue,
            ProductTypeChangeLocalizedEnumValueLabelAction.class + ": newValue is missing");
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueLabelAction without checking for non null required values
     */
    public ProductTypeChangeLocalizedEnumValueLabelAction buildUnchecked() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder = new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
