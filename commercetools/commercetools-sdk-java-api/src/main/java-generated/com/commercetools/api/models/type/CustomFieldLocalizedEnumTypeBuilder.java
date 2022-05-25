
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldLocalizedEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedEnumType customFieldLocalizedEnumType = CustomFieldLocalizedEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldLocalizedEnumTypeBuilder implements Builder<CustomFieldLocalizedEnumType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldLocalizedEnumTypeBuilder values(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldLocalizedEnumTypeBuilder plusValues(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldLocalizedEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldLocalizedEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public CustomFieldLocalizedEnumType build() {
        Objects.requireNonNull(values, CustomFieldLocalizedEnumType.class + ": values is missing");
        return new CustomFieldLocalizedEnumTypeImpl(values);
    }

    /**
     * builds CustomFieldLocalizedEnumType without checking for non null required values
     */
    public CustomFieldLocalizedEnumType buildUnchecked() {
        return new CustomFieldLocalizedEnumTypeImpl(values);
    }

    public static CustomFieldLocalizedEnumTypeBuilder of() {
        return new CustomFieldLocalizedEnumTypeBuilder();
    }

    public static CustomFieldLocalizedEnumTypeBuilder of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeBuilder builder = new CustomFieldLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
