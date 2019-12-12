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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeUpdateActionImpl implements TypeUpdateAction {

   private String action;

   @JsonCreator
   TypeUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}