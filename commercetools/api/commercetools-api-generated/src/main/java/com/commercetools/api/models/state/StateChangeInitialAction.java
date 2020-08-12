package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateChangeInitialActionImpl;

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
@JsonDeserialize(as = StateChangeInitialActionImpl.class)
public interface StateChangeInitialAction extends StateUpdateAction {

   
   @NotNull
   @JsonProperty("initial")
   public Boolean getInitial();

   public void setInitial(final Boolean initial);
   
   public static StateChangeInitialActionImpl of(){
      return new StateChangeInitialActionImpl();
   }
   

   public static StateChangeInitialActionImpl of(final StateChangeInitialAction template) {
      StateChangeInitialActionImpl instance = new StateChangeInitialActionImpl();
      instance.setInitial(template.getInitial());
      return instance;
   }

}
