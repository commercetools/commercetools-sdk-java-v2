package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Order.OrderReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class OrderEditImpl implements OrderEdit {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.OrderEdit.OrderEditResult result;
   
   private com.commercetools.models.Order.OrderReference resource;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.String comment;
   
   private java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions;
   
   private java.lang.String key;

   @JsonCreator
   OrderEditImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("result") final com.commercetools.models.OrderEdit.OrderEditResult result, @JsonProperty("resource") final com.commercetools.models.Order.OrderReference resource, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("comment") final java.lang.String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.result = result;
      this.resource = resource;
      this.custom = custom;
      this.comment = comment;
      this.stagedActions = stagedActions;
      this.key = key;
   }
   public OrderEditImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditResult getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.Order.OrderReference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
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

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setResult(final com.commercetools.models.OrderEdit.OrderEditResult result){
      this.result = result;
   }
   
   public void setResource(final com.commercetools.models.Order.OrderReference resource){
      this.resource = resource;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
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