package com.commercetools.models.state;

import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.state.StateUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateSetTransitionsActionImpl implements StateSetTransitionsAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions;

   @JsonCreator
   StateSetTransitionsActionImpl(@JsonProperty("transitions") final java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions) {
      this.transitions = transitions;
      this.action = "setTransitions";
   }
   public StateSetTransitionsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateResourceIdentifier> getTransitions(){
      return this.transitions;
   }

   public void setTransitions(final java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions){
      this.transitions = transitions;
   }

}