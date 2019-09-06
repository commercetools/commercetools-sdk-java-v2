package com.commercetools.models.Extension;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Extension.ExtensionAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionInputImpl implements ExtensionInput {

   private com.commercetools.models.Common.Reference resource;
   
   private com.commercetools.models.Extension.ExtensionAction action;

   @JsonCreator
   ExtensionInputImpl(@JsonProperty("resource") final com.commercetools.models.Common.Reference resource, @JsonProperty("action") final com.commercetools.models.Extension.ExtensionAction action) {
      this.resource = resource;
      this.action = action;
   }
   public ExtensionInputImpl() {
      
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Extension.ExtensionAction getAction(){
      return this.action;
   }

   public void setResource(final com.commercetools.models.Common.Reference resource){
      this.resource = resource;
   }
   
   public void setAction(final com.commercetools.models.Extension.ExtensionAction action){
      this.action = action;
   }

}