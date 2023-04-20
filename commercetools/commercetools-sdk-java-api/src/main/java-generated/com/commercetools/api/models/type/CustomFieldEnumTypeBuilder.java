
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldEnumType customFieldEnumType = CustomFieldEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldEnumTypeBuilder implements Builder<CustomFieldEnumType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values;

    /**
     *  <p>Allowed values.</p>
     * @param values value to be set
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder values(final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param values value to be set
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param values value to be set
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder plusValues(
            final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
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

    public CustomFieldEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder addValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValue> builder) {
        return plusValues(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Allowed values.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public CustomFieldEnumTypeBuilder setValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValue> builder) {
        return values(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Allowed values.</p>
     * @return values
     */

    public java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds CustomFieldEnumType with checking for non-null required values
     * @return CustomFieldEnumType
     */
    public CustomFieldEnumType build() {
        Objects.requireNonNull(values, CustomFieldEnumType.class + ": values is missing");
        return new CustomFieldEnumTypeImpl(values);
    }

    /**
     * builds CustomFieldEnumType without checking for non-null required values
     * @return CustomFieldEnumType
     */
    public CustomFieldEnumType buildUnchecked() {
        return new CustomFieldEnumTypeImpl(values);
    }

    /**
     * factory method for an instance of CustomFieldEnumTypeBuilder
     * @return builder
     */
    public static CustomFieldEnumTypeBuilder of() {
        return new CustomFieldEnumTypeBuilder();
    }

    /**
     * create builder for CustomFieldEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldEnumTypeBuilder of(final CustomFieldEnumType template) {
        CustomFieldEnumTypeBuilder builder = new CustomFieldEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
