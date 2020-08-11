package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
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
public final class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction {

   private String action;

   private String fieldName;

   @JsonCreator
   TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final String fieldName) {
      this.fieldName = fieldName;
      this.action = "removeFieldDefinition";
   }
   public TypeRemoveFieldDefinitionActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getFieldName(){
      return this.fieldName;
   }

   public void setFieldName(final String fieldName){
      this.fieldName = fieldName;
   }

}
