
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangePlainEnumValueOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangePlainEnumValueOrderAction productTypeChangePlainEnumValueOrderAction = ProductTypeChangePlainEnumValueOrderAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangePlainEnumValueOrderActionBuilder
        implements Builder<ProductTypeChangePlainEnumValueOrderAction> {

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error code will be returned.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder values(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error code will be returned.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error code will be returned.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder plusValues(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error code will be returned.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error code will be returned.</p>
     */

    public ProductTypeChangePlainEnumValueOrderActionBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public ProductTypeChangePlainEnumValueOrderAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangePlainEnumValueOrderAction.class + ": attributeName is missing");
        Objects.requireNonNull(values, ProductTypeChangePlainEnumValueOrderAction.class + ": values is missing");
        return new ProductTypeChangePlainEnumValueOrderActionImpl(attributeName, values);
    }

    /**
     * builds ProductTypeChangePlainEnumValueOrderAction without checking for non null required values
     */
    public ProductTypeChangePlainEnumValueOrderAction buildUnchecked() {
        return new ProductTypeChangePlainEnumValueOrderActionImpl(attributeName, values);
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder of() {
        return new ProductTypeChangePlainEnumValueOrderActionBuilder();
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder of(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        ProductTypeChangePlainEnumValueOrderActionBuilder builder = new ProductTypeChangePlainEnumValueOrderActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.values = template.getValues();
        return builder;
    }

}
