package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionUpdateAction;
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
public final class ExtensionUpdateImpl implements ExtensionUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions;

   @JsonCreator
   ExtensionUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions) {
      this.version = version;
      this.actions = actions;
   }
   public ExtensionUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> getActions(){
      return this.actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions){
      this.actions = actions;
   }

}
