package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
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
public final class OrderEditUpdateImpl implements OrderEditUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;
   
   private Boolean dryRun;

   @JsonCreator
   OrderEditUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions, @JsonProperty("dryRun") final Boolean dryRun) {
      this.version = version;
      this.actions = actions;
      this.dryRun = dryRun;
   }
   public OrderEditUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Boolean getDryRun(){
      return this.dryRun;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setDryRun(final Boolean dryRun){
      this.dryRun = dryRun;
   }

}
