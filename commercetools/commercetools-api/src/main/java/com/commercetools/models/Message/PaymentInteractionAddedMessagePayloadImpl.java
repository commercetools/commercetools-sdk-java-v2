package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.type.CustomFields;
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
public final class PaymentInteractionAddedMessagePayloadImpl implements PaymentInteractionAddedMessagePayload {

   private String type;
   
   private com.commercetools.models.type.CustomFields interaction;

   @JsonCreator
   PaymentInteractionAddedMessagePayloadImpl(@JsonProperty("interaction") final com.commercetools.models.type.CustomFields interaction) {
      this.interaction = interaction;
      this.type = "PaymentInteractionAdded";
   }
   public PaymentInteractionAddedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.type.CustomFields getInteraction(){
      return this.interaction;
   }

   public void setInteraction(final com.commercetools.models.type.CustomFields interaction){
      this.interaction = interaction;
   }

}