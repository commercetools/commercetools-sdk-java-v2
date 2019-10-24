package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditResult;
import com.commercetools.api.generated.models.order_edit.OrderExcerpt;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order_edit.OrderEditApplied;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditAppliedBuilder {
   
   
   private com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptAfterEdit;
   
   
   private com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptBeforeEdit;
   
   
   private java.time.ZonedDateTime appliedAt;
   
   public OrderEditAppliedBuilder excerptAfterEdit( final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptAfterEdit) {
      this.excerptAfterEdit = excerptAfterEdit;
      return this;
   }
   
   public OrderEditAppliedBuilder excerptBeforeEdit( final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptBeforeEdit) {
      this.excerptBeforeEdit = excerptBeforeEdit;
      return this;
   }
   
   public OrderEditAppliedBuilder appliedAt( final java.time.ZonedDateTime appliedAt) {
      this.appliedAt = appliedAt;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order_edit.OrderExcerpt getExcerptAfterEdit(){
      return this.excerptAfterEdit;
   }
   
   
   public com.commercetools.api.generated.models.order_edit.OrderExcerpt getExcerptBeforeEdit(){
      return this.excerptBeforeEdit;
   }
   
   
   public java.time.ZonedDateTime getAppliedAt(){
      return this.appliedAt;
   }

   public OrderEditApplied build() {
       return new OrderEditAppliedImpl(excerptAfterEdit, excerptBeforeEdit, appliedAt);
   }
   
   public static OrderEditAppliedBuilder of() {
      return new OrderEditAppliedBuilder();
   }
   
   public static OrderEditAppliedBuilder of(final OrderEditApplied template) {
      OrderEditAppliedBuilder builder = new OrderEditAppliedBuilder();
      builder.excerptAfterEdit = template.getExcerptAfterEdit();
      builder.excerptBeforeEdit = template.getExcerptBeforeEdit();
      builder.appliedAt = template.getAppliedAt();
      return builder;
   }
   
}