
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeAddLocalizedEnumValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddLocalizedEnumValueAction typeAddLocalizedEnumValueAction = TypeAddLocalizedEnumValueAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddLocalizedEnumValueActionBuilder implements Builder<TypeAddLocalizedEnumValueAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public TypeAddLocalizedEnumValueActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public TypeAddLocalizedEnumValueActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     * @return Builder
     */

    public TypeAddLocalizedEnumValueActionBuilder value(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @return value
     */

    public com.commercetools.api.models.type.CustomFieldLocalizedEnumValue getValue() {
        return this.value;
    }

    /**
     * builds TypeAddLocalizedEnumValueAction with checking for non-null required values
     * @return TypeAddLocalizedEnumValueAction
     */
    public TypeAddLocalizedEnumValueAction build() {
        Objects.requireNonNull(fieldName, TypeAddLocalizedEnumValueAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeAddLocalizedEnumValueAction.class + ": value is missing");
        return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
    }

    /**
     * builds TypeAddLocalizedEnumValueAction without checking for non-null required values
     * @return TypeAddLocalizedEnumValueAction
     */
    public TypeAddLocalizedEnumValueAction buildUnchecked() {
        return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
    }

    /**
     * factory method for an instance of TypeAddLocalizedEnumValueActionBuilder
     * @return builder
     */
    public static TypeAddLocalizedEnumValueActionBuilder of() {
        return new TypeAddLocalizedEnumValueActionBuilder();
    }

    /**
     * create builder for TypeAddLocalizedEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeAddLocalizedEnumValueActionBuilder of(final TypeAddLocalizedEnumValueAction template) {
        TypeAddLocalizedEnumValueActionBuilder builder = new TypeAddLocalizedEnumValueActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
