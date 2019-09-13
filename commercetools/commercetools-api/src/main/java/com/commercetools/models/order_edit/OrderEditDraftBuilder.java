package com.commercetools.models.order_edit;

import com.commercetools.models.order.OrderReference;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.order_edit.OrderEditDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditDraftBuilder {
   
   @Nullable
   private java.lang.Boolean dryRun;
   
   
   private com.commercetools.models.order.OrderReference resource;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private java.lang.String comment;
   
   @Nullable
   private java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions;
   
   @Nullable
   private java.lang.String key;
   
   public OrderEditDraftBuilder dryRun(@Nullable final java.lang.Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
   }
   
   public OrderEditDraftBuilder resource( final com.commercetools.models.order.OrderReference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderEditDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderEditDraftBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   public OrderEditDraftBuilder stagedActions(@Nullable final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      return this;
   }
   
   public OrderEditDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public com.commercetools.models.order.OrderReference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.String getComment(){
      return this.comment;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public OrderEditDraft build() {
       return new OrderEditDraftImpl(dryRun, resource, custom, comment, stagedActions, key);
   }
   
   public static OrderEditDraftBuilder of() {
      return new OrderEditDraftBuilder();
   }
   
   public static OrderEditDraftBuilder of(final OrderEditDraft template) {
      OrderEditDraftBuilder builder = new OrderEditDraftBuilder();
      builder.dryRun = template.getDryRun();
      builder.resource = template.getResource();
      builder.custom = template.getCustom();
      builder.comment = template.getComment();
      builder.stagedActions = template.getStagedActions();
      builder.key = template.getKey();
      return builder;
   }
   
}