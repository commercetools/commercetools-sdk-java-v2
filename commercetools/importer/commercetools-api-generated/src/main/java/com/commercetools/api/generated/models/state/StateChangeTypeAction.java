package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateTypeEnum;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateChangeTypeActionImpl;

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
@JsonDeserialize(as = StateChangeTypeActionImpl.class)
public interface StateChangeTypeAction extends StateUpdateAction {

   
   @NotNull
   @JsonProperty("type")
   public StateTypeEnum getType();

   public void setType(final StateTypeEnum type);
   
   public static StateChangeTypeActionImpl of(){
      return new StateChangeTypeActionImpl();
   }
   

   public static StateChangeTypeActionImpl of(final StateChangeTypeAction template) {
      StateChangeTypeActionImpl instance = new StateChangeTypeActionImpl();
      instance.setType(template.getType());
      return instance;
   }

}