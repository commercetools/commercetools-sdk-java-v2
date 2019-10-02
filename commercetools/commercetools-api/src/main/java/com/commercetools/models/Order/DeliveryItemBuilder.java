package com.commercetools.models.order;


import com.commercetools.models.order.DeliveryItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryItemBuilder {
   
   
   private Integer quantity;
   
   
   private String id;
   
   public DeliveryItemBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public DeliveryItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public String getId(){
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