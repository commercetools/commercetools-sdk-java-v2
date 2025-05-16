
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changes the <code>inputHint</code> of CustomFieldStringType FieldDefinition, a CustomFieldLocalizedStringType FieldDefinition, and CustomFieldSetType FieldDefinition of these string-based FieldTypes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeInputHintAction typeChangeInputHintAction = TypeChangeInputHintAction.builder()
 *             .fieldName("{fieldName}")
 *             .inputHint(TypeTextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeInputHint")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeInputHintActionImpl.class)
public interface TypeChangeInputHintAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeInputHintAction
     */
    String CHANGE_INPUT_HINT = "changeInputHint";

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return inputHint
     */
    @NotNull
    @JsonProperty("inputHint")
    public TypeTextInputHint getInputHint();

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param inputHint value to be set
     */

    public void setInputHint(final TypeTextInputHint inputHint);

    /**
     * factory method
     * @return instance of TypeChangeInputHintAction
     */
    public static TypeChangeInputHintAction of() {
        return new TypeChangeInputHintActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeInputHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeInputHintAction of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionImpl instance = new TypeChangeInputHintActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    public TypeChangeInputHintAction copyDeep();

    /**
     * factory method to create a deep copy of TypeChangeInputHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeInputHintAction deepCopy(@Nullable final TypeChangeInputHintAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeInputHintActionImpl instance = new TypeChangeInputHintActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    /**
     * builder factory method for TypeChangeInputHintAction
     * @return builder
     */
    public static TypeChangeInputHintActionBuilder builder() {
        return TypeChangeInputHintActionBuilder.of();
    }

    /**
     * create builder for TypeChangeInputHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeInputHintActionBuilder builder(final TypeChangeInputHintAction template) {
        return TypeChangeInputHintActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeInputHintAction(Function<TypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeInputHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeInputHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeInputHintAction>";
            }
        };
    }
}
