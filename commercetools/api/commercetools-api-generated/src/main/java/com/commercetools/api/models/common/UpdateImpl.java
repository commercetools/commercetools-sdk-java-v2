package com.commercetools.api.models.common;

import com.commercetools.api.models.common.UpdateAction;
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
public final class UpdateImpl implements Update {

   private java.util.List<com.commercetools.api.models.common.UpdateAction> actions;

   private Long version;

   @JsonCreator
   UpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.models.common.UpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public UpdateImpl() {

   }


   public java.util.List<com.commercetools.api.models.common.UpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.models.common.UpdateAction> actions){
      this.actions = actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

}
