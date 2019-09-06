package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.OrderExcerpt;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.OrderEditApplied;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditAppliedBuilder {
   
   
   private com.commercetools.models.OrderEdit.OrderExcerpt excerptAfterEdit;
   
   
   private com.commercetools.models.OrderEdit.OrderExcerpt excerptBeforeEdit;
   
   
   private java.time.ZonedDateTime appliedAt;
   
   public OrderEditAppliedBuilder excerptAfterEdit( final com.commercetools.models.OrderEdit.OrderExcerpt excerptAfterEdit) {
      this.excerptAfterEdit = excerptAfterEdit;
      return this;
   }
   
   public OrderEditAppliedBuilder excerptBeforeEdit( final com.commercetools.models.OrderEdit.OrderExcerpt excerptBeforeEdit) {
      this.excerptBeforeEdit = excerptBeforeEdit;
      return this;
   }
   
   public OrderEditAppliedBuilder appliedAt( final java.time.ZonedDateTime appliedAt) {
      this.appliedAt = appliedAt;
      return this;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderExcerpt getExcerptAfterEdit(){
      return this.excerptAfterEdit;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderExcerpt getExcerptBeforeEdit(){
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