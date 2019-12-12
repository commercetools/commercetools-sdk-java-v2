package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateAddRolesAction;
import com.commercetools.api.generated.models.state.StateChangeInitialAction;
import com.commercetools.api.generated.models.state.StateChangeKeyAction;
import com.commercetools.api.generated.models.state.StateChangeTypeAction;
import com.commercetools.api.generated.models.state.StateRemoveRolesAction;
import com.commercetools.api.generated.models.state.StateSetDescriptionAction;
import com.commercetools.api.generated.models.state.StateSetNameAction;
import com.commercetools.api.generated.models.state.StateSetRolesAction;
import com.commercetools.api.generated.models.state.StateSetTransitionsAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateUpdateActionImpl implements StateUpdateAction {

   private String action;

   @JsonCreator
   StateUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}