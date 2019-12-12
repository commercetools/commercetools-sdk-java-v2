package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.order.OrderReference;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.OrderEditResult;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditImpl implements OrderEdit {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.order_edit.OrderEditResult result;
   
   private com.commercetools.api.generated.models.order.OrderReference resource;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private String comment;
   
   private java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions;
   
   private String key;

   @JsonCreator
   OrderEditImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("result") final com.commercetools.api.generated.models.order_edit.OrderEditResult result, @JsonProperty("resource") final com.commercetools.api.generated.models.order.OrderReference resource, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("comment") final String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final String key) {
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
   
   /**
   *  <p>The unique ID of the OrderEdit.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the OrderEdit.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>Contains a preview of the changes in case of unapplied edit.
   *  For applied edits, it contains the summary of the changes.</p>
   */
   public com.commercetools.api.generated.models.order_edit.OrderEditResult getResult(){
      return this.result;
   }
   
   /**
   *  <p>The order to be updated with this edit.</p>
   */
   public com.commercetools.api.generated.models.order.OrderReference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>This field can be used to add textual information regarding the edit.</p>
   */
   public String getComment(){
      return this.comment;
   }
   
   /**
   *  <p>The actions to apply to the Order.
   *  Cannot be updated after the edit has been applied.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   /**
   *  <p>Unique identifier for this edit.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setResult(final com.commercetools.api.generated.models.order_edit.OrderEditResult result){
      this.result = result;
   }
   
   public void setResource(final com.commercetools.api.generated.models.order.OrderReference resource){
      this.resource = resource;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setComment(final String comment){
      this.comment = comment;
   }
   
   public void setStagedActions(final java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}