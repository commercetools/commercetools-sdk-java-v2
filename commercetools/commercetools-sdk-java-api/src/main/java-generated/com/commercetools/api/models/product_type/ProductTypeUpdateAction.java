
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductTypeUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductTypeUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductTypeUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductTypeUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ProductTypeUpdateAction copyDeep();

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

        if (!(template instanceof ProductTypeUpdateActionImpl)) {
            return template.copyDeep();
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
