package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import com.commercetools.models.order_edit.OrderEditUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditUpdateBuilder {
   
   
   private Boolean dryRun;
   
   
   private java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> actions;
   
   
   private Long version;
   
   public OrderEditUpdateBuilder dryRun( final Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
   }
   
   public OrderEditUpdateBuilder actions( final java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public OrderEditUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public java.util.List<com.commercetools.models.order_edit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public OrderEditUpdate build() {
       return new OrderEditUpdateImpl(dryRun, actions, version);
   }
   
   public static OrderEditUpdateBuilder of() {
      return new OrderEditUpdateBuilder();
   }
   
   public static OrderEditUpdateBuilder of(final OrderEditUpdate template) {
      OrderEditUpdateBuilder builder = new OrderEditUpdateBuilder();
      builder.dryRun = template.getDryRun();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}