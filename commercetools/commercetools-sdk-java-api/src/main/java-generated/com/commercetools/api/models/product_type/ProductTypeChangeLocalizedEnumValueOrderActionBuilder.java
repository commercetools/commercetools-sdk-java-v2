
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLocalizedEnumValueOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLocalizedEnumValueOrderAction productTypeChangeLocalizedEnumValueOrderAction = ProductTypeChangeLocalizedEnumValueOrderAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeLocalizedEnumValueOrderActionBuilder
        implements Builder<ProductTypeChangeLocalizedEnumValueOrderAction> {

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param values value to be set
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param values value to be set
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param values value to be set
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder plusValues(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder addValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        return plusValues(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder setValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        return values(builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @return values
     */

    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueOrderAction with checking for non-null required values
     * @return ProductTypeChangeLocalizedEnumValueOrderAction
     */
    public ProductTypeChangeLocalizedEnumValueOrderAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeLocalizedEnumValueOrderAction.class + ": attributeName is missing");
        Objects.requireNonNull(values, ProductTypeChangeLocalizedEnumValueOrderAction.class + ": values is missing");
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(attributeName, values);
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueOrderAction without checking for non-null required values
     * @return ProductTypeChangeLocalizedEnumValueOrderAction
     */
    public ProductTypeChangeLocalizedEnumValueOrderAction buildUnchecked() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(attributeName, values);
    }

    /**
     * factory method for an instance of ProductTypeChangeLocalizedEnumValueOrderActionBuilder
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeLocalizedEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder = new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.values = template.getValues();
        return builder;
    }

}
