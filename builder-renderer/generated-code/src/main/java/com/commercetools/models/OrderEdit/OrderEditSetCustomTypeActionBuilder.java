package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetCustomTypeActionBuilder {
   
   @Nullable
   private java.lang.Object fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public OrderEditSetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderEditSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderEditSetCustomTypeAction build() {
       return new OrderEditSetCustomTypeActionImpl(fields, type);
   }
   
   public static OrderEditSetCustomTypeActionBuilder of() {
      return new OrderEditSetCustomTypeActionBuilder();
   }
   
   public static OrderEditSetCustomTypeActionBuilder of(final OrderEditSetCustomTypeAction template) {
      OrderEditSetCustomTypeActionBuilder builder = new OrderEditSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}