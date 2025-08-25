
package com.commercetools.importapi.models.types;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldDefinitionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinition fieldDefinition = FieldDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .required(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldDefinitionBuilder implements Builder<FieldDefinition> {

    private com.commercetools.importapi.models.types.FieldType type;

    private String name;

    private com.commercetools.importapi.models.common.LocalizedString label;

    private Boolean required;

    @Nullable
    private com.commercetools.importapi.models.types.TypeTextInputHint inputHint;

    /**
     *  <p>Data type of the Custom Field to define.</p>
     * @param type value to be set
     * @return Builder
     */

    public FieldDefinitionBuilder type(final com.commercetools.importapi.models.types.FieldType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Data type of the Custom Field to define.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public FieldDefinitionBuilder type(
            Function<com.commercetools.importapi.models.types.FieldTypeBuilder, Builder<? extends com.commercetools.importapi.models.types.FieldType>> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.types.FieldTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given <a href="https://docs.commercetools.com/apis/ctp:import:type:ResourceTypeId" rel="nofollow">ResourceTypeId</a>. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>. This value cannot be changed after the Type is imported.</p>
     * @param name value to be set
     * @return Builder
     */

    public FieldDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public FieldDefinitionBuilder label(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public FieldDefinitionBuilder withLabel(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     * @param label value to be set
     * @return Builder
     */

    public FieldDefinitionBuilder label(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Defines whether the field is required to have a value. This value cannot be changed after the Type is imported.</p>
     * @param required value to be set
     * @return Builder
     */

    public FieldDefinitionBuilder required(final Boolean required) {
        this.required = required;
        return this;
    }

    /**
     *  <p>Provides a visual representation type for this field. It is only relevant for string-based field types like <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldStringType" rel="nofollow">CustomFieldStringType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedStringType" rel="nofollow">CustomFieldLocalizedStringType</a>.</p>
     * @param inputHint value to be set
     * @return Builder
     */

    public FieldDefinitionBuilder inputHint(
            @Nullable final com.commercetools.importapi.models.types.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     *  <p>Data type of the Custom Field to define.</p>
     * @return type
     */

    public com.commercetools.importapi.models.types.FieldType getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given <a href="https://docs.commercetools.com/apis/ctp:import:type:ResourceTypeId" rel="nofollow">ResourceTypeId</a>. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>. This value cannot be changed after the Type is imported.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     * @return label
     */

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Defines whether the field is required to have a value. This value cannot be changed after the Type is imported.</p>
     * @return required
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     *  <p>Provides a visual representation type for this field. It is only relevant for string-based field types like <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldStringType" rel="nofollow">CustomFieldStringType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedStringType" rel="nofollow">CustomFieldLocalizedStringType</a>.</p>
     * @return inputHint
     */

    @Nullable
    public com.commercetools.importapi.models.types.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    /**
     * builds FieldDefinition with checking for non-null required values
     * @return FieldDefinition
     */
    public FieldDefinition build() {
        Objects.requireNonNull(type, FieldDefinition.class + ": type is missing");
        Objects.requireNonNull(name, FieldDefinition.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinition.class + ": label is missing");
        Objects.requireNonNull(required, FieldDefinition.class + ": required is missing");
        return new FieldDefinitionImpl(type, name, label, required, inputHint);
    }

    /**
     * builds FieldDefinition without checking for non-null required values
     * @return FieldDefinition
     */
    public FieldDefinition buildUnchecked() {
        return new FieldDefinitionImpl(type, name, label, required, inputHint);
    }

    /**
     * factory method for an instance of FieldDefinitionBuilder
     * @return builder
     */
    public static FieldDefinitionBuilder of() {
        return new FieldDefinitionBuilder();
    }

    /**
     * create builder for FieldDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionBuilder of(final FieldDefinition template) {
        FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.required = template.getRequired();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
