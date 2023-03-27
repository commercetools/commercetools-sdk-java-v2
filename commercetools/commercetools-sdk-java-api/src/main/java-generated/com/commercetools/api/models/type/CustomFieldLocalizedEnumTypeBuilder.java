
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
     * @param values value to be set
     * @return Builder
     */

    public CustomFieldLocalizedEnumTypeBuilder values(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param values value to be set
     * @return Builder
     */

    public CustomFieldLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param values value to be set
     * @return Builder
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
     * @param builder function to build the values value
     * @return Builder
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
     * @param builder function to build the values value
     * @return Builder
     */

    public CustomFieldLocalizedEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @return values
     */

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds CustomFieldLocalizedEnumType with checking for non-null required values
     * @return CustomFieldLocalizedEnumType
     */
    public CustomFieldLocalizedEnumType build() {
        Objects.requireNonNull(values, CustomFieldLocalizedEnumType.class + ": values is missing");
        return new CustomFieldLocalizedEnumTypeImpl(values);
    }

    /**
     * builds CustomFieldLocalizedEnumType without checking for non-null required values
     * @return CustomFieldLocalizedEnumType
     */
    public CustomFieldLocalizedEnumType buildUnchecked() {
        return new CustomFieldLocalizedEnumTypeImpl(values);
    }

    /**
     * factory method for an instance of CustomFieldLocalizedEnumTypeBuilder
     * @return builder
     */
    public static CustomFieldLocalizedEnumTypeBuilder of() {
        return new CustomFieldLocalizedEnumTypeBuilder();
    }

    /**
     * create builder for CustomFieldLocalizedEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedEnumTypeBuilder of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeBuilder builder = new CustomFieldLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
