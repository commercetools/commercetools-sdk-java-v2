package com.commercetools.models.State;

import com.commercetools.models.State.StateUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.State.StateChangeInitialActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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