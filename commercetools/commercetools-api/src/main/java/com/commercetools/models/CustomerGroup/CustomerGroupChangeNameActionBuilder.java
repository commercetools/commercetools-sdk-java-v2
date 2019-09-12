package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.String;
import com.commercetools.models.CustomerGroup.CustomerGroupChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public CustomerGroupChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public CustomerGroupChangeNameAction build() {
       return new CustomerGroupChangeNameActionImpl(name);
   }
   
   public static CustomerGroupChangeNameActionBuilder of() {
      return new CustomerGroupChangeNameActionBuilder();
   }
   
   public static CustomerGroupChangeNameActionBuilder of(final CustomerGroupChangeNameAction template) {
      CustomerGroupChangeNameActionBuilder builder = new CustomerGroupChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}