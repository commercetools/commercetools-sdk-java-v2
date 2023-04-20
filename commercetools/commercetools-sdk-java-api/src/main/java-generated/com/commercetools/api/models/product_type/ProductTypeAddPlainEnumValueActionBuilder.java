
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
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeAddPlainEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ProductTypeAddPlainEnumValueActionBuilder value(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ProductTypeAddPlainEnumValueActionBuilder withValue(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValue> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductTypeAddPlainEnumValueActionBuilder value(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue value) {
        this.value = value;
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
     *  <p>Value to append to the array.</p>
     * @return value
     */

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getValue() {
        return this.value;
    }

    /**
     * builds ProductTypeAddPlainEnumValueAction with checking for non-null required values
     * @return ProductTypeAddPlainEnumValueAction
     */
    public ProductTypeAddPlainEnumValueAction build() {
        Objects.requireNonNull(attributeName, ProductTypeAddPlainEnumValueAction.class + ": attributeName is missing");
        Objects.requireNonNull(value, ProductTypeAddPlainEnumValueAction.class + ": value is missing");
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    /**
     * builds ProductTypeAddPlainEnumValueAction without checking for non-null required values
     * @return ProductTypeAddPlainEnumValueAction
     */
    public ProductTypeAddPlainEnumValueAction buildUnchecked() {
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    /**
     * factory method for an instance of ProductTypeAddPlainEnumValueActionBuilder
     * @return builder
     */
    public static ProductTypeAddPlainEnumValueActionBuilder of() {
        return new ProductTypeAddPlainEnumValueActionBuilder();
    }

    /**
     * create builder for ProductTypeAddPlainEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddPlainEnumValueActionBuilder of(final ProductTypeAddPlainEnumValueAction template) {
        ProductTypeAddPlainEnumValueActionBuilder builder = new ProductTypeAddPlainEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}
