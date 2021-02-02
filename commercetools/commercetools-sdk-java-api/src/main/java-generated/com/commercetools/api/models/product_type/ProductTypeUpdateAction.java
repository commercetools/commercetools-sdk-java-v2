
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionImpl.class, name = ProductTypeAddAttributeDefinitionAction.ADD_ATTRIBUTE_DEFINITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionImpl.class, name = ProductTypeAddLocalizedEnumValueAction.ADD_LOCALIZED_ENUM_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionImpl.class, name = ProductTypeAddPlainEnumValueAction.ADD_PLAIN_ENUM_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionImpl.class, name = ProductTypeChangeAttributeConstraintAction.CHANGE_ATTRIBUTE_CONSTRAINT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionImpl.class, name = ProductTypeChangeAttributeNameAction.CHANGE_ATTRIBUTE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderActionImpl.class, name = ProductTypeChangeAttributeOrderAction.CHANGE_ATTRIBUTE_ORDER),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeSetKeyActionImpl.class, name = ProductTypeSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductTypeUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductTypeUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductTypeUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withProductTypeUpdateAction(Function<ProductTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
