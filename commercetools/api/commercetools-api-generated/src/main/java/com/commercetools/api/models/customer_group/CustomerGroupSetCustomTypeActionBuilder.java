package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupSetCustomTypeActionBuilder {

   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;

   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   public CustomerGroupSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }

   public CustomerGroupSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CustomerGroupSetCustomTypeAction build() {
       return new CustomerGroupSetCustomTypeActionImpl(fields, type);
   }

   public static CustomerGroupSetCustomTypeActionBuilder of() {
      return new CustomerGroupSetCustomTypeActionBuilder();
   }

   public static CustomerGroupSetCustomTypeActionBuilder of(final CustomerGroupSetCustomTypeAction template) {
      CustomerGroupSetCustomTypeActionBuilder builder = new CustomerGroupSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }

}
