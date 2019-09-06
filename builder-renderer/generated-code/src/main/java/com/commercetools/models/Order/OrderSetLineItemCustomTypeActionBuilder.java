package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public OrderSetLineItemCustomTypeActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderSetLineItemCustomTypeAction build() {
       return new OrderSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }
   
   public static OrderSetLineItemCustomTypeActionBuilder of() {
      return new OrderSetLineItemCustomTypeActionBuilder();
   }
   
   public static OrderSetLineItemCustomTypeActionBuilder of(final OrderSetLineItemCustomTypeAction template) {
      OrderSetLineItemCustomTypeActionBuilder builder = new OrderSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}