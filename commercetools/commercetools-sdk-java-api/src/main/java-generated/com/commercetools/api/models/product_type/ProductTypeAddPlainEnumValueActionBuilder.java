
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeAddPlainEnumValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddPlainEnumValueAction productTypeAddPlainEnumValueAction = ProductTypeAddPlainEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddPlainEnumValueActionBuilder implements Builder<ProductTypeAddPlainEnumValueAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue value;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeAddPlainEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public ProductTypeAddPlainEnumValueActionBuilder value(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public ProductTypeAddPlainEnumValueActionBuilder value(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue value) {
        this.value = value;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getValue() {
        return this.value;
    }

    public ProductTypeAddPlainEnumValueAction build() {
        Objects.requireNonNull(attributeName, ProductTypeAddPlainEnumValueAction.class + ": attributeName is missing");
        Objects.requireNonNull(value, ProductTypeAddPlainEnumValueAction.class + ": value is missing");
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    /**
     * builds ProductTypeAddPlainEnumValueAction without checking for non null required values
     */
    public ProductTypeAddPlainEnumValueAction buildUnchecked() {
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    public static ProductTypeAddPlainEnumValueActionBuilder of() {
        return new ProductTypeAddPlainEnumValueActionBuilder();
    }

    public static ProductTypeAddPlainEnumValueActionBuilder of(final ProductTypeAddPlainEnumValueAction template) {
        ProductTypeAddPlainEnumValueActionBuilder builder = new ProductTypeAddPlainEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}
