package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.OrderReference;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.order_edit.OrderEditDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditDraftBuilder {
   
   @Nullable
   private Boolean dryRun;
   
   
   private com.commercetools.api.generated.models.order.OrderReference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private String comment;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions;
   
   @Nullable
   private String key;
   
   public OrderEditDraftBuilder dryRun(@Nullable final Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
   }
   
   public OrderEditDraftBuilder resource( final com.commercetools.api.generated.models.order.OrderReference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderEditDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderEditDraftBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }
   
   public OrderEditDraftBuilder stagedActions(@Nullable final java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      return this;
   }
   
   public OrderEditDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderReference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public String getComment(){
      return this.comment;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   @Nullable
   public String getKey(){
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