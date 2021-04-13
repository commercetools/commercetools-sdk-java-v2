package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeAddEnumValueAction;
import com.commercetools.api.models.type.TypeAddFieldDefinitionAction;
import com.commercetools.api.models.type.TypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.type.TypeChangeEnumValueLabelAction;
import com.commercetools.api.models.type.TypeChangeEnumValueOrderAction;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelAction;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction;
import com.commercetools.api.models.type.TypeChangeInputHintAction;
import com.commercetools.api.models.type.TypeChangeKeyAction;
import com.commercetools.api.models.type.TypeChangeLabelAction;
import com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.models.type.TypeChangeNameAction;
import com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction;
import com.commercetools.api.models.type.TypeSetDescriptionAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddEnumValueActionImpl.class, name = TypeAddEnumValueAction.ADD_ENUM_VALUE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddFieldDefinitionActionImpl.class, name = TypeAddFieldDefinitionAction.ADD_FIELD_DEFINITION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddLocalizedEnumValueActionImpl.class, name = TypeAddLocalizedEnumValueAction.ADD_LOCALIZED_ENUM_VALUE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueLabelActionImpl.class, name = TypeChangeEnumValueLabelAction.CHANGE_ENUM_VALUE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueOrderActionImpl.class, name = TypeChangeEnumValueOrderAction.CHANGE_ENUM_VALUE_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelActionImpl.class, name = TypeChangeFieldDefinitionLabelAction.CHANGE_FIELD_DEFINITION_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderActionImpl.class, name = TypeChangeFieldDefinitionOrderAction.CHANGE_FIELD_DEFINITION_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeInputHintActionImpl.class, name = TypeChangeInputHintAction.CHANGE_INPUT_HINT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeKeyActionImpl.class, name = TypeChangeKeyAction.CHANGE_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLabelActionImpl.class, name = TypeChangeLabelAction.CHANGE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = TypeChangeLocalizedEnumValueLabelAction.CHANGE_LOCALIZED_ENUM_VALUE_LABEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = TypeChangeLocalizedEnumValueOrderAction.CHANGE_LOCALIZED_ENUM_VALUE_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeNameActionImpl.class, name = TypeChangeNameAction.CHANGE_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeRemoveFieldDefinitionActionImpl.class, name = TypeRemoveFieldDefinitionAction.REMOVE_FIELD_DEFINITION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeSetDescriptionActionImpl.class, name = TypeSetDescriptionAction.SET_DESCRIPTION)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = TypeUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TypeUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<TypeUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withTypeUpdateAction(Function<TypeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
