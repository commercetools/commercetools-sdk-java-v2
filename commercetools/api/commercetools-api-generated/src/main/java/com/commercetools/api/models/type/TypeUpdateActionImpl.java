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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
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
