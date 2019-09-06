package com.commercetools.models.State;

import com.commercetools.models.State.StateTypeEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateChangeTypeActionImpl implements StateChangeTypeAction {

   private java.lang.String action;
   
   private com.commercetools.models.State.StateTypeEnum type;

   @JsonCreator
   StateChangeTypeActionImpl(@JsonProperty("type") final com.commercetools.models.State.StateTypeEnum type) {
      this.type = type;
      this.action = "changeType";
   }
   public StateChangeTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.State.StateTypeEnum getType(){
      return this.type;
   }

   public void setType(final com.commercetools.models.State.StateTypeEnum type){
      this.type = type;
   }

}