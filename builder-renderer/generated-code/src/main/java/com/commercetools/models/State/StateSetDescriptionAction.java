package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateSetDescriptionActionImpl;

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
@JsonDeserialize(as = StateSetDescriptionActionImpl.class)
public interface StateSetDescriptionAction extends StateUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static StateSetDescriptionActionImpl of(){
      return new StateSetDescriptionActionImpl();
   }
   

   public static StateSetDescriptionActionImpl of(final StateSetDescriptionAction template) {
      StateSetDescriptionActionImpl instance = new StateSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}