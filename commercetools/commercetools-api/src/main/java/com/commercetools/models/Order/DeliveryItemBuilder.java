package com.commercetools.models.order;

import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order.DeliveryItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryItemBuilder {
   
   
   private java.lang.Integer quantity;
   
   
   private java.lang.String id;
   
   public DeliveryItemBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public DeliveryItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }

   public DeliveryItem build() {
       return new DeliveryItemImpl(quantity, id);
   }
   
   public static DeliveryItemBuilder of() {
      return new DeliveryItemBuilder();
   }
   
   public static DeliveryItemBuilder of(final DeliveryItem template) {
      DeliveryItemBuilder builder = new DeliveryItemBuilder();
      builder.quantity = template.getQuantity();
      builder.id = template.getId();
      return builder;
   }
   
}