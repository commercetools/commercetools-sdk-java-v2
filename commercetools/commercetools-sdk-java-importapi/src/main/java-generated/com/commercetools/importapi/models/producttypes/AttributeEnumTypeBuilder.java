
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeEnumType attributeEnumType = AttributeEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeEnumTypeBuilder implements Builder<AttributeEnumType> {

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values;

    /**
     * set values to the values
     * @param values value to be set
     * @return Builder
     */

    public AttributeEnumTypeBuilder values(
            final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     * set value to the values
     * @param values value to be set
     * @return Builder
     */

    public AttributeEnumTypeBuilder values(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     * add values to the values
     * @param values value to be set
     * @return Builder
     */

    public AttributeEnumTypeBuilder plusValues(
            final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     * add the value to the values using the builder function
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeEnumTypeBuilder plusValues(
            Function<com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the values using the builder function
     * @param builder function to build the values value
     * @return Builder
     */

    public AttributeEnumTypeBuilder withValues(
            Function<com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    /**
     * value of values}
     * @return values
     */

    public java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds AttributeEnumType with checking for non-null required values
     * @return AttributeEnumType
     */
    public AttributeEnumType build() {
        Objects.requireNonNull(values, AttributeEnumType.class + ": values is missing");
        return new AttributeEnumTypeImpl(values);
    }

    /**
     * builds AttributeEnumType without checking for non-null required values
     * @return AttributeEnumType
     */
    public AttributeEnumType buildUnchecked() {
        return new AttributeEnumTypeImpl(values);
    }

    /**
     * factory method for an instance of AttributeEnumTypeBuilder
     * @return builder
     */
    public static AttributeEnumTypeBuilder of() {
        return new AttributeEnumTypeBuilder();
    }

    /**
     * create builder for AttributeEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeEnumTypeBuilder of(final AttributeEnumType template) {
        AttributeEnumTypeBuilder builder = new AttributeEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
