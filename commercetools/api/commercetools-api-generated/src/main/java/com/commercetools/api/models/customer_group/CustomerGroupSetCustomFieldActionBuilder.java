package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public CustomerGroupSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CustomerGroupSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public CustomerGroupSetCustomFieldAction build() {
       return new CustomerGroupSetCustomFieldActionImpl(name, value);
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of() {
      return new CustomerGroupSetCustomFieldActionBuilder();
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of(final CustomerGroupSetCustomFieldAction template) {
      CustomerGroupSetCustomFieldActionBuilder builder = new CustomerGroupSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}
