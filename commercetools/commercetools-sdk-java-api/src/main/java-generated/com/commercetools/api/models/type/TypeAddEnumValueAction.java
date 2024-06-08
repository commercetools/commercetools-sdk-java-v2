
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds a value to an EnumType. This update action can be used to update an EnumType FieldDefinition and a SetType FieldDefinition of EnumType.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddEnumValueAction typeAddEnumValueAction = TypeAddEnumValueAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeAddEnumValueActionImpl.class)
public interface TypeAddEnumValueAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeAddEnumValueAction
     */
    String ADD_ENUM_VALUE = "addEnumValue";

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Value to append to the array.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldEnumValue getValue();

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     */

    public void setValue(final CustomFieldEnumValue value);

    /**
     * factory method
     * @return instance of TypeAddEnumValueAction
     */
    public static TypeAddEnumValueAction of() {
        return new TypeAddEnumValueActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeAddEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeAddEnumValueAction of(final TypeAddEnumValueAction template) {
        TypeAddEnumValueActionImpl instance = new TypeAddEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeAddEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeAddEnumValueAction deepCopy(@Nullable final TypeAddEnumValueAction template) {
        if (template == null) {
            return null;
        }
        TypeAddEnumValueActionImpl instance = new TypeAddEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(com.commercetools.api.models.type.CustomFieldEnumValue.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for TypeAddEnumValueAction
     * @return builder
     */
    public static TypeAddEnumValueActionBuilder builder() {
        return TypeAddEnumValueActionBuilder.of();
    }

    /**
     * create builder for TypeAddEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeAddEnumValueActionBuilder builder(final TypeAddEnumValueAction template) {
        return TypeAddEnumValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeAddEnumValueAction(Function<TypeAddEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddEnumValueAction>";
            }
        };
    }
}
