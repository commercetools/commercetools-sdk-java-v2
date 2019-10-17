package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeAddEnumValueAction;
import com.commercetools.api.generated.models.type.TypeAddFieldDefinitionAction;
import com.commercetools.api.generated.models.type.TypeAddLocalizedEnumValueAction;
import com.commercetools.api.generated.models.type.TypeChangeEnumValueLabelAction;
import com.commercetools.api.generated.models.type.TypeChangeEnumValueOrderAction;
import com.commercetools.api.generated.models.type.TypeChangeFieldDefinitionLabelAction;
import com.commercetools.api.generated.models.type.TypeChangeFieldDefinitionOrderAction;
import com.commercetools.api.generated.models.type.TypeChangeInputHintAction;
import com.commercetools.api.generated.models.type.TypeChangeKeyAction;
import com.commercetools.api.generated.models.type.TypeChangeLabelAction;
import com.commercetools.api.generated.models.type.TypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.generated.models.type.TypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.generated.models.type.TypeChangeNameAction;
import com.commercetools.api.generated.models.type.TypeRemoveFieldDefinitionAction;
import com.commercetools.api.generated.models.type.TypeSetDescriptionAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeAddEnumValueActionImpl.class, name = "addEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeAddFieldDefinitionActionImpl.class, name = "addFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeEnumValueLabelActionImpl.class, name = "changeEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeEnumValueOrderActionImpl.class, name = "changeEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeFieldDefinitionLabelActionImpl.class, name = "changeFieldDefinitionLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeFieldDefinitionOrderActionImpl.class, name = "changeFieldDefinitionOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeInputHintActionImpl.class, name = "changeInputHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeLabelActionImpl.class, name = "changeLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeRemoveFieldDefinitionActionImpl.class, name = "removeFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.TypeSetDescriptionActionImpl.class, name = "setDescription")
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