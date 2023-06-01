package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ProductTypeUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeUpdateAction productTypeUpdateAction = ProductTypeUpdateAction.addAttributeDefinitionBuilder()
 *             attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionImpl.class, name = ProductTypeAddAttributeDefinitionAction.ADD_ATTRIBUTE_DEFINITION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionImpl.class, name = ProductTypeAddLocalizedEnumValueAction.ADD_LOCALIZED_ENUM_VALUE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionImpl.class, name = ProductTypeAddPlainEnumValueAction.ADD_PLAIN_ENUM_VALUE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionImpl.class, name = ProductTypeChangeAttributeConstraintAction.CHANGE_ATTRIBUTE_CONSTRAINT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionImpl.class, name = ProductTypeChangeAttributeNameAction.CHANGE_ATTRIBUTE_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionImpl.class, name = ProductTypeChangeAttributeOrderByNameAction.CHANGE_ATTRIBUTE_ORDER_BY_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionImpl.class, name = ProductTypeChangeDescriptionAction.CHANGE_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionImpl.class, name = ProductTypeChangeEnumKeyAction.CHANGE_ENUM_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionImpl.class, name = ProductTypeChangeInputHintAction.CHANGE_INPUT_HINT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionImpl.class, name = ProductTypeChangeIsSearchableAction.CHANGE_IS_SEARCHABLE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLabelActionImpl.class, name = ProductTypeChangeLabelAction.CHANGE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionImpl.class, name = ProductTypeChangeLocalizedEnumValueLabelAction.CHANGE_LOCALIZED_ENUM_VALUE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionImpl.class, name = ProductTypeChangeLocalizedEnumValueOrderAction.CHANGE_LOCALIZED_ENUM_VALUE_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeNameActionImpl.class, name = ProductTypeChangeNameAction.CHANGE_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionImpl.class, name = ProductTypeChangePlainEnumValueLabelAction.CHANGE_PLAIN_ENUM_VALUE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionImpl.class, name = ProductTypeChangePlainEnumValueOrderAction.CHANGE_PLAIN_ENUM_VALUE_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionImpl.class, name = ProductTypeRemoveAttributeDefinitionAction.REMOVE_ATTRIBUTE_DEFINITION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionImpl.class, name = ProductTypeRemoveEnumValuesAction.REMOVE_ENUM_VALUES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeSetInputTipActionImpl.class, name = ProductTypeSetInputTipAction.SET_INPUT_TIP),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeSetKeyActionImpl.class, name = ProductTypeSetKeyAction.SET_KEY)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ProductTypeUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = ProductTypeUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ProductTypeUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProductTypeUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of ProductTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeUpdateAction deepCopy(@Nullable final ProductTypeUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction) {
            return com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction) {
            return com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction) {
            return com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeLabelAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeLabelAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeLabelAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangeNameAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangeNameAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangeNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction) {
            return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction) {
            return com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction) {
            return com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeSetInputTipAction) {
            return com.commercetools.api.models.product_type.ProductTypeSetInputTipAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeSetInputTipAction)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeSetKeyAction) {
            return com.commercetools.api.models.product_type.ProductTypeSetKeyAction.deepCopy((com.commercetools.api.models.product_type.ProductTypeSetKeyAction)template);
        }
        ProductTypeUpdateActionImpl instance = new ProductTypeUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addAttributeDefinition subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionBuilder addAttributeDefinitionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionBuilder.of();
    }
    /**
     * builder for addLocalizedEnumValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionBuilder addLocalizedEnumValueBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionBuilder.of();
    }
    /**
     * builder for addPlainEnumValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionBuilder addPlainEnumValueBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionBuilder.of();
    }
    /**
     * builder for changeAttributeConstraint subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionBuilder changeAttributeConstraintBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionBuilder.of();
    }
    /**
     * builder for changeAttributeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionBuilder changeAttributeNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionBuilder.of();
    }
    /**
     * builder for changeAttributeOrderByName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionBuilder changeAttributeOrderByNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionBuilder.of();
    }
    /**
     * builder for changeDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionBuilder changeDescriptionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionBuilder.of();
    }
    /**
     * builder for changeEnumKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionBuilder changeEnumKeyBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionBuilder.of();
    }
    /**
     * builder for changeInputHint subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionBuilder changeInputHintBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionBuilder.of();
    }
    /**
     * builder for changeIsSearchable subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionBuilder changeIsSearchableBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionBuilder.of();
    }
    /**
     * builder for changeLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeLabelActionBuilder changeLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLabelActionBuilder.of();
    }
    /**
     * builder for changeLocalizedEnumValueLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionBuilder changeLocalizedEnumValueLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }
    /**
     * builder for changeLocalizedEnumValueOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionBuilder changeLocalizedEnumValueOrderBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }
    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeNameActionBuilder.of();
    }
    /**
     * builder for changePlainEnumValueLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionBuilder changePlainEnumValueLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionBuilder.of();
    }
    /**
     * builder for changePlainEnumValueOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionBuilder changePlainEnumValueOrderBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionBuilder.of();
    }
    /**
     * builder for removeAttributeDefinition subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionBuilder removeAttributeDefinitionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionBuilder.of();
    }
    /**
     * builder for removeEnumValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionBuilder removeEnumValuesBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionBuilder.of();
    }
    /**
     * builder for setInputTip subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeSetInputTipActionBuilder setInputTipBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeSetInputTipActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeSetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeUpdateAction(Function<ProductTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeUpdateAction>";
            }
        };
    }
}
