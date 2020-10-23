package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderAction;
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
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionImpl.class, name = "addAttributeDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionImpl.class, name = "addPlainEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionImpl.class, name = "changeAttributeConstraint"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionImpl.class, name = "changeAttributeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderActionImpl.class, name = "changeAttributeOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionImpl.class, name = "changeAttributeOrderByName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionImpl.class, name = "changeEnumKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionImpl.class, name = "changeInputHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionImpl.class, name = "changeIsSearchable"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLabelActionImpl.class, name = "changeLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionImpl.class, name = "changePlainEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionImpl.class, name = "changePlainEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionImpl.class, name = "removeAttributeDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionImpl.class, name = "removeEnumValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeSetInputTipActionImpl.class, name = "setInputTip"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeSetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = ProductTypeUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductTypeUpdateAction  {





    default <T> T withProductTypeUpdateAction(Function<ProductTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
