package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.OrderEdit;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private com.commercetools.api.models.order_edit.OrderEditResult result;


   private com.commercetools.api.models.order.OrderReference resource;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;

   @Nullable
   private String comment;


   private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

   @Nullable
   private String key;

   public OrderEditBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public OrderEditBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public OrderEditBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public OrderEditBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public OrderEditBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public OrderEditBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public OrderEditBuilder result( final com.commercetools.api.models.order_edit.OrderEditResult result) {
      this.result = result;
      return this;
   }

   public OrderEditBuilder resource( final com.commercetools.api.models.order.OrderReference resource) {
      this.resource = resource;
      return this;
   }

   public OrderEditBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public OrderEditBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }

   public OrderEditBuilder stagedActions( final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      return this;
   }

   public OrderEditBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public String getId(){
      return this.id;
   }


   public Long getVersion(){
      return this.version;
   }

   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }

   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public com.commercetools.api.models.order_edit.OrderEditResult getResult(){
      return this.result;
   }


   public com.commercetools.api.models.order.OrderReference getResource(){
      return this.resource;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   @Nullable
   public String getComment(){
      return this.comment;
   }


   public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }

   @Nullable
   public String getKey(){
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
