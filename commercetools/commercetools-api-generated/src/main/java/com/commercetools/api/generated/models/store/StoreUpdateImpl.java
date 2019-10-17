package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.store.StoreUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreUpdateImpl implements StoreUpdate {

   private java.util.List<com.commercetools.api.generated.models.store.StoreUpdateAction> actions;
   
   private Long version;

   @JsonCreator
   StoreUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.generated.models.store.StoreUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public StoreUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.store.StoreUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.generated.models.store.StoreUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}