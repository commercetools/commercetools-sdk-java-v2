
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeAddLocalizedEnumValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = ProductTypeAddLocalizedEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddLocalizedEnumValueActionBuilder implements Builder<ProductTypeAddLocalizedEnumValueAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeAddLocalizedEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public ProductTypeAddLocalizedEnumValueActionBuilder value(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public ProductTypeAddLocalizedEnumValueActionBuilder value(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.value = value;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getValue() {
        return this.value;
    }

    public ProductTypeAddLocalizedEnumValueAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeAddLocalizedEnumValueAction.class + ": attributeName is missing");
        Objects.requireNonNull(value, ProductTypeAddLocalizedEnumValueAction.class + ": value is missing");
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }

    /**
     * builds ProductTypeAddLocalizedEnumValueAction without checking for non null required values
     */
    public ProductTypeAddLocalizedEnumValueAction buildUnchecked() {
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder of() {
        return new ProductTypeAddLocalizedEnumValueActionBuilder();
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder of(
            final ProductTypeAddLocalizedEnumValueAction template) {
        ProductTypeAddLocalizedEnumValueActionBuilder builder = new ProductTypeAddLocalizedEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}
