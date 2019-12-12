package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private JsonNode value;
   
   public CustomerSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CustomerSetCustomFieldActionBuilder value(@Nullable final JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public JsonNode getValue(){
      return this.value;
   }

   public CustomerSetCustomFieldAction build() {
       return new CustomerSetCustomFieldActionImpl(name, value);
   }
   
   public static CustomerSetCustomFieldActionBuilder of() {
      return new CustomerSetCustomFieldActionBuilder();
   }
   
   public static CustomerSetCustomFieldActionBuilder of(final CustomerSetCustomFieldAction template) {
      CustomerSetCustomFieldActionBuilder builder = new CustomerSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}