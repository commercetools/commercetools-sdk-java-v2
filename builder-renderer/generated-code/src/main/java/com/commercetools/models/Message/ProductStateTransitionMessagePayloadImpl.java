package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
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
public final class ProductStateTransitionMessagePayloadImpl implements ProductStateTransitionMessagePayload {

   private java.lang.String type;
   
   private java.lang.Boolean force;
   
   private com.commercetools.models.State.StateReference state;

   @JsonCreator
   ProductStateTransitionMessagePayloadImpl(@JsonProperty("force") final java.lang.Boolean force, @JsonProperty("state") final com.commercetools.models.State.StateReference state) {
      this.force = force;
      this.state = state;
      this.type = "ProductStateTransition";
   }
   public ProductStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }

   public void setForce(final java.lang.Boolean force){
      this.force = force;
   }
   
   public void setState(final com.commercetools.models.State.StateReference state){
      this.state = state;
   }

}