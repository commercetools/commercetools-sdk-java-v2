package com.commercetools.models.State;

import com.commercetools.models.State.StateResourceIdentifier;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateSetTransitionsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateSetTransitionsActionImpl.class)
public interface StateSetTransitionsAction extends StateUpdateAction {

   
   @Valid
   @JsonProperty("transitions")
   public List<StateResourceIdentifier> getTransitions();

   public void setTransitions(final List<StateResourceIdentifier> transitions);
   
   public static StateSetTransitionsActionImpl of(){
      return new StateSetTransitionsActionImpl();
   }
   

   public static StateSetTransitionsActionImpl of(final StateSetTransitionsAction template) {
      StateSetTransitionsActionImpl instance = new StateSetTransitionsActionImpl();
      instance.setTransitions(template.getTransitions());
      return instance;
   }

}