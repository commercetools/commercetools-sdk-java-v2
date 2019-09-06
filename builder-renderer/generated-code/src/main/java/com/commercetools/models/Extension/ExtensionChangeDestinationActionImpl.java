package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionUpdateAction;
import java.lang.String;
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
public final class ExtensionChangeDestinationActionImpl implements ExtensionChangeDestinationAction {

   private java.lang.String action;
   
   private com.commercetools.models.Extension.ExtensionDestination destination;

   @JsonCreator
   ExtensionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.models.Extension.ExtensionDestination destination) {
      this.destination = destination;
      this.action = "changeDestination";
   }
   public ExtensionChangeDestinationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Extension.ExtensionDestination getDestination(){
      return this.destination;
   }

   public void setDestination(final com.commercetools.models.Extension.ExtensionDestination destination){
      this.destination = destination;
   }

}