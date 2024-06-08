
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddEnumValueActionImpl.class, name = TypeAddEnumValueAction.ADD_ENUM_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddFieldDefinitionActionImpl.class, name = TypeAddFieldDefinitionAction.ADD_FIELD_DEFINITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddLocalizedEnumValueActionImpl.class, name = TypeAddLocalizedEnumValueAction.ADD_LOCALIZED_ENUM_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueLabelActionImpl.class, name = TypeChangeEnumValueLabelAction.CHANGE_ENUM_VALUE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueOrderActionImpl.class, name = TypeChangeEnumValueOrderAction.CHANGE_ENUM_VALUE_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderActionImpl.class, name = TypeChangeFieldDefinitionOrderAction.CHANGE_FIELD_DEFINITION_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeInputHintActionImpl.class, name = TypeChangeInputHintAction.CHANGE_INPUT_HINT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeKeyActionImpl.class, name = TypeChangeKeyAction.CHANGE_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLabelActionImpl.class, name = TypeChangeLabelAction.CHANGE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = TypeChangeLocalizedEnumValueLabelAction.CHANGE_LOCALIZED_ENUM_VALUE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = TypeChangeLocalizedEnumValueOrderAction.CHANGE_LOCALIZED_ENUM_VALUE_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeNameActionImpl.class, name = TypeChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeRemoveFieldDefinitionActionImpl.class, name = TypeRemoveFieldDefinitionAction.REMOVE_FIELD_DEFINITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeSetDescriptionActionImpl.class, name = TypeSetDescriptionAction.SET_DESCRIPTION) })
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
        if (template instanceof com.commercetools.api.models.type.TypeAddEnumValueAction) {
            return com.commercetools.api.models.type.TypeAddEnumValueAction
                    .deepCopy((com.commercetools.api.models.type.TypeAddEnumValueAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeAddFieldDefinitionAction) {
            return com.commercetools.api.models.type.TypeAddFieldDefinitionAction
                    .deepCopy((com.commercetools.api.models.type.TypeAddFieldDefinitionAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeAddLocalizedEnumValueAction) {
            return com.commercetools.api.models.type.TypeAddLocalizedEnumValueAction
                    .deepCopy((com.commercetools.api.models.type.TypeAddLocalizedEnumValueAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeEnumValueLabelAction) {
            return com.commercetools.api.models.type.TypeChangeEnumValueLabelAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeEnumValueLabelAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeEnumValueOrderAction) {
            return com.commercetools.api.models.type.TypeChangeEnumValueOrderAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeEnumValueOrderAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction) {
            return com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeInputHintAction) {
            return com.commercetools.api.models.type.TypeChangeInputHintAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeInputHintAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeKeyAction) {
            return com.commercetools.api.models.type.TypeChangeKeyAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeLabelAction) {
            return com.commercetools.api.models.type.TypeChangeLabelAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeLabelAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelAction) {
            return com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderAction) {
            return com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeChangeNameAction) {
            return com.commercetools.api.models.type.TypeChangeNameAction
                    .deepCopy((com.commercetools.api.models.type.TypeChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction) {
            return com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction
                    .deepCopy((com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeSetDescriptionAction) {
            return com.commercetools.api.models.type.TypeSetDescriptionAction
                    .deepCopy((com.commercetools.api.models.type.TypeSetDescriptionAction) template);
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
