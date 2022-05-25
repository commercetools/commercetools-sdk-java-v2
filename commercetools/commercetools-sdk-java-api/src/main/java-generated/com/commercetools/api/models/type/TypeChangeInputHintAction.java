
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeInputHintActionImpl.class)
public interface TypeChangeInputHintAction extends TypeUpdateAction {

    String CHANGE_INPUT_HINT = "changeInputHint";

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @JsonProperty("inputHint")
    public TypeTextInputHint getInputHint();

    public void setFieldName(final String fieldName);

    public void setInputHint(final TypeTextInputHint inputHint);

    public static TypeChangeInputHintAction of() {
        return new TypeChangeInputHintActionImpl();
    }

    public static TypeChangeInputHintAction of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionImpl instance = new TypeChangeInputHintActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    public static TypeChangeInputHintActionBuilder builder() {
        return TypeChangeInputHintActionBuilder.of();
    }

    public static TypeChangeInputHintActionBuilder builder(final TypeChangeInputHintAction template) {
        return TypeChangeInputHintActionBuilder.of(template);
    }

    default <T> T withTypeChangeInputHintAction(Function<TypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeInputHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeInputHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeInputHintAction>";
            }
        };
    }
}
