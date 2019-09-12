package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderTransitionStateActionImpl implements OrderTransitionStateAction {

   private java.lang.String action;
   
   private java.lang.Boolean force;
   
   private com.commercetools.models.State.StateResourceIdentifier state;

   @JsonCreator
   OrderTransitionStateActionImpl(@JsonProperty("force") final java.lang.Boolean force, @JsonProperty("state") final com.commercetools.models.State.StateResourceIdentifier state) {
      this.force = force;
      this.state = state;
      this.action = "transitionState";
   }
   public OrderTransitionStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getState(){
      return this.state;
   }

   public void setForce(final java.lang.Boolean force){
      this.force = force;
   }
   
   public void setState(final com.commercetools.models.State.StateResourceIdentifier state){
      this.state = state;
   }

}