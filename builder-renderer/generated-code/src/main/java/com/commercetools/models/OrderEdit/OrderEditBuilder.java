package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Order.OrderReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.OrderEdit;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.OrderEdit.OrderEditResult result;
   
   
   private com.commercetools.models.Order.OrderReference resource;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private java.lang.String comment;
   
   
   private java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions;
   
   @Nullable
   private java.lang.String key;
   
   public OrderEditBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderEditBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderEditBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderEditBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderEditBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public OrderEditBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public OrderEditBuilder result( final com.commercetools.models.OrderEdit.OrderEditResult result) {
      this.result = result;
      return this;
   }
   
   public OrderEditBuilder resource( final com.commercetools.models.Order.OrderReference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderEditBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderEditBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   public OrderEditBuilder stagedActions( final java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      return this;
   }
   
   public OrderEditBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditResult getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.Order.OrderReference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.String getComment(){
      return this.comment;
   }
   
   
   public java.util.List<com.commercetools.models.Order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public OrderEdit build() {
       return new OrderEditImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, result, resource, custom, comment, stagedActions, key);
   }
   
   public static OrderEditBuilder of() {
      return new OrderEditBuilder();
   }
   
   public static OrderEditBuilder of(final OrderEdit template) {
      OrderEditBuilder builder = new OrderEditBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.result = template.getResult();
      builder.resource = template.getResource();
      builder.custom = template.getCustom();
      builder.comment = template.getComment();
      builder.stagedActions = template.getStagedActions();
      builder.key = template.getKey();
      return builder;
   }
   
}