package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.OrderEdit.OrderEditUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditUpdateBuilder {
   
   
   private java.lang.Boolean dryRun;
   
   
   private java.util.List<com.commercetools.models.OrderEdit.OrderEditUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public OrderEditUpdateBuilder dryRun( final java.lang.Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
   }
   
   public OrderEditUpdateBuilder actions( final java.util.List<com.commercetools.models.OrderEdit.OrderEditUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public OrderEditUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public java.util.List<com.commercetools.models.OrderEdit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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