package com.commercetools.models.Order;

import com.commercetools.models.State.StateReference;
import java.lang.Integer;
import com.commercetools.models.Order.ItemState;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ItemStateBuilder {
   
   
   private java.lang.Integer quantity;
   
   
   private com.commercetools.models.State.StateReference state;
   
   public ItemStateBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ItemStateBuilder state( final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }

   public ItemState build() {
       return new ItemStateImpl(quantity, state);
   }
   
   public static ItemStateBuilder of() {
      return new ItemStateBuilder();
   }
   
   public static ItemStateBuilder of(final ItemState template) {
      ItemStateBuilder builder = new ItemStateBuilder();
      builder.quantity = template.getQuantity();
      builder.state = template.getState();
      return builder;
   }
   
}