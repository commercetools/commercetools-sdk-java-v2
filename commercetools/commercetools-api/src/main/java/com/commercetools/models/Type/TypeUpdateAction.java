package com.commercetools.models.type;

import com.commercetools.models.type.TypeAddEnumValueAction;
import com.commercetools.models.type.TypeAddFieldDefinitionAction;
import com.commercetools.models.type.TypeAddLocalizedEnumValueAction;
import com.commercetools.models.type.TypeChangeEnumValueLabelAction;
import com.commercetools.models.type.TypeChangeEnumValueOrderAction;
import com.commercetools.models.type.TypeChangeFieldDefinitionLabelAction;
import com.commercetools.models.type.TypeChangeFieldDefinitionOrderAction;
import com.commercetools.models.type.TypeChangeInputHintAction;
import com.commercetools.models.type.TypeChangeKeyAction;
import com.commercetools.models.type.TypeChangeLabelAction;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.models.type.TypeChangeNameAction;
import com.commercetools.models.type.TypeRemoveFieldDefinitionAction;
import com.commercetools.models.type.TypeSetDescriptionAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeAddEnumValueActionImpl.class, name = "addEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeAddFieldDefinitionActionImpl.class, name = "addFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeEnumValueLabelActionImpl.class, name = "changeEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeEnumValueOrderActionImpl.class, name = "changeEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeFieldDefinitionLabelActionImpl.class, name = "changeFieldDefinitionLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeFieldDefinitionOrderActionImpl.class, name = "changeFieldDefinitionOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeInputHintActionImpl.class, name = "changeInputHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeLabelActionImpl.class, name = "changeLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeRemoveFieldDefinitionActionImpl.class, name = "removeFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.TypeSetDescriptionActionImpl.class, name = "setDescription")
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
public interface TypeUpdateAction  {


   


}