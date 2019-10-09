package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.customer.CustomerSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public CustomerSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CustomerSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CustomerSetCustomTypeAction build() {
       return new CustomerSetCustomTypeActionImpl(fields, type);
   }
   
   public static CustomerSetCustomTypeActionBuilder of() {
      return new CustomerSetCustomTypeActionBuilder();
   }
   
   public static CustomerSetCustomTypeActionBuilder of(final CustomerSetCustomTypeAction template) {
      CustomerSetCustomTypeActionBuilder builder = new CustomerSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}