
package com.commercetools.api.models.type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddEnumValueActionImpl.class, name = "addEnumValue"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddFieldDefinitionActionImpl.class, name = "addFieldDefinition"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeAddLocalizedEnumValueActionImpl.class, name = "addLocalizedEnumValue"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueLabelActionImpl.class, name = "changeEnumValueLabel"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeEnumValueOrderActionImpl.class, name = "changeEnumValueOrder"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelActionImpl.class, name = "changeFieldDefinitionLabel"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderActionImpl.class, name = "changeFieldDefinitionOrder"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeInputHintActionImpl.class, name = "changeInputHint"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeKeyActionImpl.class, name = "changeKey"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLabelActionImpl.class, name = "changeLabel"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelActionImpl.class, name = "changeLocalizedEnumValueLabel"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionImpl.class, name = "changeLocalizedEnumValueOrder"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeChangeNameActionImpl.class, name = "changeName"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeRemoveFieldDefinitionActionImpl.class, name = "removeFieldDefinition"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeSetDescriptionActionImpl.class, name = "setDescription") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = TypeUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypeUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<TypeUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withTypeUpdateAction(Function<TypeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
