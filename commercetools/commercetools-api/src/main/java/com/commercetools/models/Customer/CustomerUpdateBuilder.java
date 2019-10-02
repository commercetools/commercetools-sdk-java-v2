package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.customer.CustomerUpdateAction> actions;
   
   
   private Long version;
   
   public CustomerUpdateBuilder actions( final java.util.List<com.commercetools.models.customer.CustomerUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CustomerUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.customer.CustomerUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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