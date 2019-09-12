package com.commercetools.models.State;

import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateChangeKeyActionImpl;

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
@JsonDeserialize(as = StateChangeKeyActionImpl.class)
public interface StateChangeKeyAction extends StateUpdateAction {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static StateChangeKeyActionImpl of(){
      return new StateChangeKeyActionImpl();
   }
   

   public static StateChangeKeyActionImpl of(final StateChangeKeyAction template) {
      StateChangeKeyActionImpl instance = new StateChangeKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}