package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.Long;
import com.commercetools.models.Customer.CustomerUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Customer.CustomerUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public CustomerUpdateBuilder actions( final java.util.List<com.commercetools.models.Customer.CustomerUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CustomerUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Customer.CustomerUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public CustomerUpdate build() {
       return new CustomerUpdateImpl(actions, version);
   }
   
   public static CustomerUpdateBuilder of() {
      return new CustomerUpdateBuilder();
   }
   
   public static CustomerUpdateBuilder of(final CustomerUpdate template) {
      CustomerUpdateBuilder builder = new CustomerUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}