
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
 *  <p>Adds a value to a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a>. This update action can be used to update a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a> FieldDefinition and a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> FieldDefinition of <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">CustomFieldLocalizedEnumType</a>.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("addLocalizedEnumValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeAddLocalizedEnumValueActionImpl.class)
public interface TypeAddLocalizedEnumValueAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeAddLocalizedEnumValueAction
     */
    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
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
    public CustomFieldLocalizedEnumValue getValue();

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     */

    public void setValue(final CustomFieldLocalizedEnumValue value);

    /**
     * factory method
     * @return instance of TypeAddLocalizedEnumValueAction
     */
    public static TypeAddLocalizedEnumValueAction of() {
        return new TypeAddLocalizedEnumValueActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeAddLocalizedEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeAddLocalizedEnumValueAction of(final TypeAddLocalizedEnumValueAction template) {
        TypeAddLocalizedEnumValueActionImpl instance = new TypeAddLocalizedEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public TypeAddLocalizedEnumValueAction copyDeep();

    /**
     * factory method to create a deep copy of TypeAddLocalizedEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeAddLocalizedEnumValueAction deepCopy(@Nullable final TypeAddLocalizedEnumValueAction template) {
        if (template == null) {
            return null;
        }
        TypeAddLocalizedEnumValueActionImpl instance = new TypeAddLocalizedEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(
            com.commercetools.api.models.type.CustomFieldLocalizedEnumValue.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for TypeAddLocalizedEnumValueAction
     * @return builder
     */
    public static TypeAddLocalizedEnumValueActionBuilder builder() {
        return TypeAddLocalizedEnumValueActionBuilder.of();
    }

    /**
     * create builder for TypeAddLocalizedEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeAddLocalizedEnumValueActionBuilder builder(final TypeAddLocalizedEnumValueAction template) {
        return TypeAddLocalizedEnumValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeAddLocalizedEnumValueAction(Function<TypeAddLocalizedEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddLocalizedEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddLocalizedEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddLocalizedEnumValueAction>";
            }
        };
    }
}
