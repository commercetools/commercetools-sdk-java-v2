package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public OrderSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderSetCustomTypeAction build() {
       return new OrderSetCustomTypeActionImpl(fields, type);
   }
   
   public static OrderSetCustomTypeActionBuilder of() {
      return new OrderSetCustomTypeActionBuilder();
   }
   
   public static OrderSetCustomTypeActionBuilder of(final OrderSetCustomTypeAction template) {
      OrderSetCustomTypeActionBuilder builder = new OrderSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}