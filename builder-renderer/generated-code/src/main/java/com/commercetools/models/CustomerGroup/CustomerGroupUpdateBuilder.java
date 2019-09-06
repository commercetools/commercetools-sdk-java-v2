package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.Long;
import com.commercetools.models.CustomerGroup.CustomerGroupUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public CustomerGroupUpdateBuilder actions( final java.util.List<com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CustomerGroupUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public CustomerGroupUpdate build() {
       return new CustomerGroupUpdateImpl(actions, version);
   }
   
   public static CustomerGroupUpdateBuilder of() {
      return new CustomerGroupUpdateBuilder();
   }
   
   public static CustomerGroupUpdateBuilder of(final CustomerGroupUpdate template) {
      CustomerGroupUpdateBuilder builder = new CustomerGroupUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}