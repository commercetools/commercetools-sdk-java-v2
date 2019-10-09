package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.state.StateReference;
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
public final class PaymentStatusStateTransitionMessagePayloadImpl implements PaymentStatusStateTransitionMessagePayload {

   private String type;
   
   private Boolean force;
   
   private com.commercetools.models.state.StateReference state;

   @JsonCreator
   PaymentStatusStateTransitionMessagePayloadImpl(@JsonProperty("force") final Boolean force, @JsonProperty("state") final com.commercetools.models.state.StateReference state) {
      this.force = force;
      this.state = state;
      this.type = "PaymentStatusStateTransition";
   }
   public PaymentStatusStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }

   public void setForce(final Boolean force){
      this.force = force;
   }
   
   public void setState(final com.commercetools.models.state.StateReference state){
      this.state = state;
   }

}