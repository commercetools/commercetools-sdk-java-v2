
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines a Custom Field and its meta-information. This FieldDefinition is similar to an AttributeDefinition of Product Types.</p>
 *
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
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition {

    /**
     *  <p>Data type of the Custom Field to define.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public FieldType getType();

    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>A human-readable label for the field.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Defines whether the field is required to have a value.</p>
     * @return required
     */
    @NotNull
    @JsonProperty("required")
    public Boolean getRequired();

    /**
     *  <p>Defines the visual representation of the field in user interfaces like the Merchant Center. It is only relevant for string-based FieldTypes like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
     * @return inputHint
     */

    @JsonProperty("inputHint")
    public TypeTextInputHint getInputHint();

    /**
     *  <p>Data type of the Custom Field to define.</p>
     * @param type value to be set
     */

    public void setType(final FieldType type);

    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>A human-readable label for the field.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>Defines whether the field is required to have a value.</p>
     * @param required value to be set
     */

    public void setRequired(final Boolean required);

    /**
     *  <p>Defines the visual representation of the field in user interfaces like the Merchant Center. It is only relevant for string-based FieldTypes like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
     * @param inputHint value to be set
     */

    public void setInputHint(final TypeTextInputHint inputHint);

    /**
     * factory method
     * @return instance of FieldDefinition
     */
    public static FieldDefinition of() {
        return new FieldDefinitionImpl();
    }

    /**
     * factory method to create a shallow copy FieldDefinition
     * @param template instance to be copied
     * @return copy instance
     */
    public static FieldDefinition of(final FieldDefinition template) {
        FieldDefinitionImpl instance = new FieldDefinitionImpl();
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        instance.setRequired(template.getRequired());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    /**
     * factory method to create a deep copy of FieldDefinition
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldDefinition deepCopy(@Nullable final FieldDefinition template) {
        if (template == null) {
            return null;
        }
        FieldDefinitionImpl instance = new FieldDefinitionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.FieldType::deepCopy)
                .orElse(null));
        instance.setName(template.getName());
        instance.setLabel(Optional.ofNullable(template.getLabel())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setRequired(template.getRequired());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    /**
     * builder factory method for FieldDefinition
     * @return builder
     */
    public static FieldDefinitionBuilder builder() {
        return FieldDefinitionBuilder.of();
    }

    /**
     * create builder for FieldDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionBuilder builder(final FieldDefinition template) {
        return FieldDefinitionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldDefinition(Function<FieldDefinition, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldDefinition> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldDefinition>() {
            @Override
            public String toString() {
                return "TypeReference<FieldDefinition>";
            }
        };
    }
}
