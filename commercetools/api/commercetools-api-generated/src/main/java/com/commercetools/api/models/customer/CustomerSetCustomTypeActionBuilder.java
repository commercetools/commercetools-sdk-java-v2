package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;
   
   public CustomerSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public CustomerSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   public CustomerSetCustomTypeAction build() {
       return new CustomerSetCustomTypeActionImpl(type, fields);
   }
   
   public static CustomerSetCustomTypeActionBuilder of() {
      return new CustomerSetCustomTypeActionBuilder();
   }
   
   public static CustomerSetCustomTypeActionBuilder of(final CustomerSetCustomTypeAction template) {
      CustomerSetCustomTypeActionBuilder builder = new CustomerSetCustomTypeActionBuilder();
      builder.type = template.getType();
      builder.fields = template.getFields();
      return builder;
   }
   
}
