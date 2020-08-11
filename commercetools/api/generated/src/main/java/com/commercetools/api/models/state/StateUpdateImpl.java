package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
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
public final class StateUpdateImpl implements StateUpdate {

   private java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions;

   private Long version;

   @JsonCreator
   StateUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public StateUpdateImpl() {

   }


   public java.util.List<com.commercetools.api.models.state.StateUpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions){
      this.actions = actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

}
