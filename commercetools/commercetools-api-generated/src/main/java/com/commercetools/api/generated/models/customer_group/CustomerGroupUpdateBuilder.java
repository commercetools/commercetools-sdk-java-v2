package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.generated.models.customer_group.CustomerGroupUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction> actions;
   
   
   private Long version;
   
   public CustomerGroupUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CustomerGroupUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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