package com.commercetools.api.models.state;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateSetNameActionImpl;

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
@JsonDeserialize(as = StateSetNameActionImpl.class)
public interface StateSetNameAction extends StateUpdateAction {


   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);

   public static StateSetNameActionImpl of(){
      return new StateSetNameActionImpl();
   }


   public static StateSetNameActionImpl of(final StateSetNameAction template) {
      StateSetNameActionImpl instance = new StateSetNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}
