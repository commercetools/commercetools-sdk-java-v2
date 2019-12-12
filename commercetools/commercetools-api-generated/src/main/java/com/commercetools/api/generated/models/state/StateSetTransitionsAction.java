package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateSetTransitionsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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