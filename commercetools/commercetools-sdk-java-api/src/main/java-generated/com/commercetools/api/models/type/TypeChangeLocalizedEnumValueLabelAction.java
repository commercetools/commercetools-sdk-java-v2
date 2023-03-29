
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the <code>label</code> of a LocalizedEnumValue of a LocalizedEnumType FieldDefinition.</p>
 *
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
@JsonDeserialize(as = TypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface TypeChangeLocalizedEnumValueLabelAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeLocalizedEnumValueLabelAction
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL = "changeLocalizedEnumValueLabel";

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldLocalizedEnumValue getValue();

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param value value to be set
     */

    public void setValue(final CustomFieldLocalizedEnumValue value);

    /**
     * factory method
     * @return instance of TypeChangeLocalizedEnumValueLabelAction
     */
    public static TypeChangeLocalizedEnumValueLabelAction of() {
        return new TypeChangeLocalizedEnumValueLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeLocalizedEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeLocalizedEnumValueLabelAction of(final TypeChangeLocalizedEnumValueLabelAction template) {
        TypeChangeLocalizedEnumValueLabelActionImpl instance = new TypeChangeLocalizedEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeChangeLocalizedEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeLocalizedEnumValueLabelAction deepCopy(
            @Nullable final TypeChangeLocalizedEnumValueLabelAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeLocalizedEnumValueLabelActionImpl instance = new TypeChangeLocalizedEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(com.commercetools.api.models.type.CustomFieldLocalizedEnumValue::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeChangeLocalizedEnumValueLabelAction
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueLabelActionBuilder builder() {
        return TypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }

    /**
     * create builder for TypeChangeLocalizedEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueLabelActionBuilder builder(
            final TypeChangeLocalizedEnumValueLabelAction template) {
        return TypeChangeLocalizedEnumValueLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeLocalizedEnumValueLabelAction(
            Function<TypeChangeLocalizedEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLocalizedEnumValueLabelAction>";
            }
        };
    }
}
