
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizedEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumType attributeLocalizedEnumType = AttributeLocalizedEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizedEnumTypeBuilder implements Builder<AttributeLocalizedEnumType> {

    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param values value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param values value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param values value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder plusValues(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder addValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        return plusValues(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeLocalizedEnumTypeBuilder setValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        return values(builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @return values
     */

    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds AttributeLocalizedEnumType with checking for non-null required values
     * @return AttributeLocalizedEnumType
     */
    public AttributeLocalizedEnumType build() {
        Objects.requireNonNull(values, AttributeLocalizedEnumType.class + ": values is missing");
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    /**
     * builds AttributeLocalizedEnumType without checking for non-null required values
     * @return AttributeLocalizedEnumType
     */
    public AttributeLocalizedEnumType buildUnchecked() {
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    /**
     * factory method for an instance of AttributeLocalizedEnumTypeBuilder
     * @return builder
     */
    public static AttributeLocalizedEnumTypeBuilder of() {
        return new AttributeLocalizedEnumTypeBuilder();
    }

    /**
     * create builder for AttributeLocalizedEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
