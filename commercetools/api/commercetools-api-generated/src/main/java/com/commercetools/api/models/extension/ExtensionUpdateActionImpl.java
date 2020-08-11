package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionChangeDestinationAction;
import com.commercetools.api.models.extension.ExtensionChangeTriggersAction;
import com.commercetools.api.models.extension.ExtensionSetKeyAction;
import com.commercetools.api.models.extension.ExtensionSetTimeoutInMsAction;
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
public final class ExtensionUpdateActionImpl implements ExtensionUpdateAction {

   private String action;

   @JsonCreator
   ExtensionUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}
