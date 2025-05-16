
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
 * TypeUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeUpdateAction typeUpdateAction = TypeUpdateAction.addEnumValueBuilder()
 *             fieldName("{fieldName}")
 *             value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = TypeUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = TypeUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypeUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<TypeUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public TypeUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of TypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeUpdateAction deepCopy(@Nullable final TypeUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof TypeUpdateActionImpl)) {
            return template.copyDeep();
        }
        TypeUpdateActionImpl instance = new TypeUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addEnumValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeAddEnumValueActionBuilder addEnumValueBuilder() {
        return com.commercetools.api.models.type.TypeAddEnumValueActionBuilder.of();
    }

    /**
     * builder for addFieldDefinition subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeAddFieldDefinitionActionBuilder addFieldDefinitionBuilder() {
        return com.commercetools.api.models.type.TypeAddFieldDefinitionActionBuilder.of();
    }

    /**
     * builder for addLocalizedEnumValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeAddLocalizedEnumValueActionBuilder addLocalizedEnumValueBuilder() {
        return com.commercetools.api.models.type.TypeAddLocalizedEnumValueActionBuilder.of();
    }

    /**
     * builder for changeEnumValueLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeEnumValueLabelActionBuilder changeEnumValueLabelBuilder() {
        return com.commercetools.api.models.type.TypeChangeEnumValueLabelActionBuilder.of();
    }

    /**
     * builder for changeEnumValueOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeEnumValueOrderActionBuilder changeEnumValueOrderBuilder() {
        return com.commercetools.api.models.type.TypeChangeEnumValueOrderActionBuilder.of();
    }

    /**
     * builder for changeFieldDefinitionOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderActionBuilder changeFieldDefinitionOrderBuilder() {
        return com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderActionBuilder.of();
    }

    /**
     * builder for changeInputHint subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeInputHintActionBuilder changeInputHintBuilder() {
        return com.commercetools.api.models.type.TypeChangeInputHintActionBuilder.of();
    }

    /**
     * builder for changeKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeKeyActionBuilder changeKeyBuilder() {
        return com.commercetools.api.models.type.TypeChangeKeyActionBuilder.of();
    }

    /**
     * builder for changeLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeLabelActionBuilder changeLabelBuilder() {
        return com.commercetools.api.models.type.TypeChangeLabelActionBuilder.of();
    }

    /**
     * builder for changeLocalizedEnumValueLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelActionBuilder changeLocalizedEnumValueLabelBuilder() {
        return com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }

    /**
     * builder for changeLocalizedEnumValueOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionBuilder changeLocalizedEnumValueOrderBuilder() {
        return com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.type.TypeChangeNameActionBuilder.of();
    }

    /**
     * builder for removeFieldDefinition subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeRemoveFieldDefinitionActionBuilder removeFieldDefinitionBuilder() {
        return com.commercetools.api.models.type.TypeRemoveFieldDefinitionActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.type.TypeSetDescriptionActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeUpdateAction(Function<TypeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeUpdateAction>";
            }
        };
    }
}
