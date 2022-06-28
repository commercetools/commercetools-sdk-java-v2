
package com.commercetools.api.models.product_type;

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

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeEnumTypeBuilder values(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeEnumTypeBuilder plusValues(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public AttributeEnumType build() {
        Objects.requireNonNull(values, AttributeEnumType.class + ": values is missing");
        return new AttributeEnumTypeImpl(values);
    }

    /**
     * builds AttributeEnumType without checking for non null required values
     */
    public AttributeEnumType buildUnchecked() {
        return new AttributeEnumTypeImpl(values);
    }

    public static AttributeEnumTypeBuilder of() {
        return new AttributeEnumTypeBuilder();
    }

    public static AttributeEnumTypeBuilder of(final AttributeEnumType template) {
        AttributeEnumTypeBuilder builder = new AttributeEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
