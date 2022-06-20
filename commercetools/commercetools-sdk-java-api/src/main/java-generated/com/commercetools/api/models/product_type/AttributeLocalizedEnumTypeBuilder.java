
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
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
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
     */

    public AttributeLocalizedEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    public AttributeLocalizedEnumType build() {
        Objects.requireNonNull(values, AttributeLocalizedEnumType.class + ": values is missing");
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    /**
     * builds AttributeLocalizedEnumType without checking for non null required values
     */
    public AttributeLocalizedEnumType buildUnchecked() {
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    public static AttributeLocalizedEnumTypeBuilder of() {
        return new AttributeLocalizedEnumTypeBuilder();
    }

    public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
