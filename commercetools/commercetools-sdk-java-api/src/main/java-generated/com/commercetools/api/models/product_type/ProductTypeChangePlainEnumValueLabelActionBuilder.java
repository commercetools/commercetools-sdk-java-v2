
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangePlainEnumValueLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangePlainEnumValueLabelAction productTypeChangePlainEnumValueLabelAction = ProductTypeChangePlainEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangePlainEnumValueLabelActionBuilder
        implements Builder<ProductTypeChangePlainEnumValueLabelAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue newValue;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeChangePlainEnumValueLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */

    public ProductTypeChangePlainEnumValueLabelActionBuilder newValue(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.newValue = builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */

    public ProductTypeChangePlainEnumValueLabelActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangePlainEnumValueLabelAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangePlainEnumValueLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangePlainEnumValueLabelAction.class + ": newValue is missing");
        return new ProductTypeChangePlainEnumValueLabelActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangePlainEnumValueLabelAction without checking for non null required values
     */
    public ProductTypeChangePlainEnumValueLabelAction buildUnchecked() {
        return new ProductTypeChangePlainEnumValueLabelActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder of() {
        return new ProductTypeChangePlainEnumValueLabelActionBuilder();
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder of(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        ProductTypeChangePlainEnumValueLabelActionBuilder builder = new ProductTypeChangePlainEnumValueLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
