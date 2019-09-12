package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.OrderReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Boolean;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditDraftImpl implements OrderEditDraft {

   private java.lang.Boolean dryRun;
   
   private com.commercetools.models.Order.OrderReference resource;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private java.lang.String comment;
   
   private java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions;
   
   private java.lang.String key;

   @JsonCreator
   OrderEditDraftImpl(@JsonProperty("dryRun") final java.lang.Boolean dryRun, @JsonProperty("resource") final com.commercetools.models.Order.OrderReference resource, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("comment") final java.lang.String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final java.lang.String key) {
      this.dryRun = dryRun;
      this.resource = resource;
      this.custom = custom;
      this.comment = comment;
      this.stagedActions = stagedActions;
      this.key = key;
   }
   public OrderEditDraftImpl() {
      
   }
   
   
   public java.lang.Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public com.commercetools.models.Order.OrderReference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getComment(){
      return this.comment;
   }
   
   
   public java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setDryRun(final java.lang.Boolean dryRun){
      this.dryRun = dryRun;
   }
   
   public void setResource(final com.commercetools.models.Order.OrderReference resource){
      this.resource = resource;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setComment(final java.lang.String comment){
      this.comment = comment;
   }
   
   public void setStagedActions(final java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}