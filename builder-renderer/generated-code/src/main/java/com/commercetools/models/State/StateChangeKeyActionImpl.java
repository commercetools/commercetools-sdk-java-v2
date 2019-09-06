package com.commercetools.models.State;

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
public final class StateChangeKeyActionImpl implements StateChangeKeyAction {

   private java.lang.String action;
   
   private java.lang.String key;

   @JsonCreator
   StateChangeKeyActionImpl(@JsonProperty("key") final java.lang.String key) {
      this.key = key;
      this.action = "changeKey";
   }
   public StateChangeKeyActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setKey(final java.lang.String key){
      this.key = key;
   }

}