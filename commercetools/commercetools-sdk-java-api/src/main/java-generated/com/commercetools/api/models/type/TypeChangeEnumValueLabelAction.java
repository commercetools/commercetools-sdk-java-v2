
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the <code>label</code> of an EnumValue of an EnumType FieldDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeEnumValueLabelAction typeChangeEnumValueLabelAction = TypeChangeEnumValueLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeEnumValueLabelActionImpl.class)
public interface TypeChangeEnumValueLabelAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeEnumValueLabelAction
     */
    String CHANGE_ENUM_VALUE_LABEL = "changeEnumValueLabel";

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
    public CustomFieldEnumValue getValue();

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param value value to be set
     */

    public void setValue(final CustomFieldEnumValue value);

    /**
     * factory method
     * @return instance of TypeChangeEnumValueLabelAction
     */
    public static TypeChangeEnumValueLabelAction of() {
        return new TypeChangeEnumValueLabelActionImpl();
    }

    /**
     * factory method to copy an instance of TypeChangeEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeEnumValueLabelAction of(final TypeChangeEnumValueLabelAction template) {
        TypeChangeEnumValueLabelActionImpl instance = new TypeChangeEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for TypeChangeEnumValueLabelAction
     * @return builder
     */
    public static TypeChangeEnumValueLabelActionBuilder builder() {
        return TypeChangeEnumValueLabelActionBuilder.of();
    }

    /**
     * create builder for TypeChangeEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeEnumValueLabelActionBuilder builder(final TypeChangeEnumValueLabelAction template) {
        return TypeChangeEnumValueLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeEnumValueLabelAction(Function<TypeChangeEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeEnumValueLabelAction>";
            }
        };
    }
}
