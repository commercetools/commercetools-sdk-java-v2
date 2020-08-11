package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
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
public final class ProductStateTransitionMessagePayloadImpl implements ProductStateTransitionMessagePayload {

   private String type;

   private Boolean force;

   private com.commercetools.api.models.state.StateReference state;

   @JsonCreator
   ProductStateTransitionMessagePayloadImpl(@JsonProperty("force") final Boolean force, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state) {
      this.force = force;
      this.state = state;
      this.type = "ProductStateTransition";
   }
   public ProductStateTransitionMessagePayloadImpl() {

   }


   public String getType(){
      return this.type;
   }


   public Boolean getForce(){
      return this.force;
   }


   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }

   public void setForce(final Boolean force){
      this.force = force;
   }

   public void setState(final com.commercetools.api.models.state.StateReference state){
      this.state = state;
   }

}
