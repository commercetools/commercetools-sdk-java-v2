package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.models.ProductType.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.models.ProductType.ProductTypeAddPlainEnumValueAction;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeNameAction;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderAction;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderByNameAction;
import com.commercetools.models.ProductType.ProductTypeChangeDescriptionAction;
import com.commercetools.models.ProductType.ProductTypeChangeEnumKeyAction;
import com.commercetools.models.ProductType.ProductTypeChangeInputHintAction;
import com.commercetools.models.ProductType.ProductTypeChangeIsSearchableAction;
import com.commercetools.models.ProductType.ProductTypeChangeLabelAction;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.models.ProductType.ProductTypeChangeNameAction;
import com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueOrderAction;
import com.commercetools.models.ProductType.ProductTypeRemoveAttributeDefinitionAction;
import com.commercetools.models.ProductType.ProductTypeRemoveEnumValuesAction;
import com.commercetools.models.ProductType.ProductTypeSetInputTipAction;
import com.commercetools.models.ProductType.ProductTypeSetKeyAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeAddAttributeDefinitionActionImpl.class, name = "addAttributeDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeAddPlainEnumValueActionImpl.class, name = "addPlainEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeAttributeConstraintActionImpl.class, name = "changeAttributeConstraint"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeAttributeNameActionImpl.class, name = "changeAttributeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderActionImpl.class, name = "changeAttributeOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderByNameActionImpl.class, name = "changeAttributeOrderByName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeEnumKeyActionImpl.class, name = "changeEnumKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeInputHintActionImpl.class, name = "changeInputHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeIsSearchableActionImpl.class, name = "changeIsSearchable"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeLabelActionImpl.class, name = "changeLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueLabelActionImpl.class, name = "changePlainEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueOrderActionImpl.class, name = "changePlainEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeRemoveAttributeDefinitionActionImpl.class, name = "removeAttributeDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeRemoveEnumValuesActionImpl.class, name = "removeEnumValues"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeSetInputTipActionImpl.class, name = "setInputTip"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.ProductTypeSetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductTypeUpdateAction  {


   


}