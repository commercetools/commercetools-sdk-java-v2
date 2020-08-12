package com.commercetools.api.models.extension;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.extension.ExtensionAction;
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
public final class ExtensionInputImpl implements ExtensionInput {

   private com.commercetools.api.models.extension.ExtensionAction action;
   
   private com.commercetools.api.models.common.Reference resource;

   @JsonCreator
   ExtensionInputImpl(@JsonProperty("action") final com.commercetools.api.models.extension.ExtensionAction action, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource) {
      this.action = action;
      this.resource = resource;
   }
   public ExtensionInputImpl() {
      
   }
   
   
   public com.commercetools.api.models.extension.ExtensionAction getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }

   public void setAction(final com.commercetools.api.models.extension.ExtensionAction action){
      this.action = action;
   }
   
   public void setResource(final com.commercetools.api.models.common.Reference resource){
      this.resource = resource;
   }

}
