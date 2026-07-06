
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeLocalizedEnumValueLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLocalizedEnumValueLabelAction typeChangeLocalizedEnumValueLabelAction = TypeChangeLocalizedEnumValueLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeLocalizedEnumValueLabelActionBuilder
        implements Builder<TypeChangeLocalizedEnumValueLabelAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueLabelActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueLabelActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueLabelActionBuilder withValue(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param value value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueLabelActionBuilder value(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */

    public com.commercetools.api.models.type.CustomFieldLocalizedEnumValue getValue() {
        return this.value;
    }

    /**
     * builds TypeChangeLocalizedEnumValueLabelAction with checking for non-null required values
     * @return TypeChangeLocalizedEnumValueLabelAction
     */
    public TypeChangeLocalizedEnumValueLabelAction build() {
        Objects.requireNonNull(fieldName, TypeChangeLocalizedEnumValueLabelAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeChangeLocalizedEnumValueLabelAction.class + ": value is missing");
        return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
    }

    /**
     * builds TypeChangeLocalizedEnumValueLabelAction without checking for non-null required values
     * @return TypeChangeLocalizedEnumValueLabelAction
     */
    public TypeChangeLocalizedEnumValueLabelAction buildUnchecked() {
        return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
    }

    /**
     * factory method for an instance of TypeChangeLocalizedEnumValueLabelActionBuilder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueLabelActionBuilder of() {
        return new TypeChangeLocalizedEnumValueLabelActionBuilder();
    }

    /**
     * create builder for TypeChangeLocalizedEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueLabelActionBuilder of(
            final TypeChangeLocalizedEnumValueLabelAction template) {
        TypeChangeLocalizedEnumValueLabelActionBuilder builder = new TypeChangeLocalizedEnumValueLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
