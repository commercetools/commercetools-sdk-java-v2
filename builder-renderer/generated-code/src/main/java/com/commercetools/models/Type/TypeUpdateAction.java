package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeAddEnumValueAction;
import com.commercetools.models.Type.TypeAddFieldDefinitionAction;
import com.commercetools.models.Type.TypeAddLocalizedEnumValueAction;
import com.commercetools.models.Type.TypeChangeEnumValueLabelAction;
import com.commercetools.models.Type.TypeChangeEnumValueOrderAction;
import com.commercetools.models.Type.TypeChangeFieldDefinitionLabelAction;
import com.commercetools.models.Type.TypeChangeFieldDefinitionOrderAction;
import com.commercetools.models.Type.TypeChangeInputHintAction;
import com.commercetools.models.Type.TypeChangeKeyAction;
import com.commercetools.models.Type.TypeChangeLabelAction;
import com.commercetools.models.Type.TypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.models.Type.TypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.models.Type.TypeChangeNameAction;
import com.commercetools.models.Type.TypeRemoveFieldDefinitionAction;
import com.commercetools.models.Type.TypeSetDescriptionAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeAddEnumValueActionImpl.class, name = "addEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeAddFieldDefinitionActionImpl.class, name = "addFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeEnumValueLabelActionImpl.class, name = "changeEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeEnumValueOrderActionImpl.class, name = "changeEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeFieldDefinitionLabelActionImpl.class, name = "changeFieldDefinitionLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeFieldDefinitionOrderActionImpl.class, name = "changeFieldDefinitionOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeInputHintActionImpl.class, name = "changeInputHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeLabelActionImpl.class, name = "changeLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeRemoveFieldDefinitionActionImpl.class, name = "removeFieldDefinition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.TypeSetDescriptionActionImpl.class, name = "setDescription")
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