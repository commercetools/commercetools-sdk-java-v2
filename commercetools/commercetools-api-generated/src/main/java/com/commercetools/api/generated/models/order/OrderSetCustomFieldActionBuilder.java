package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public OrderSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public OrderSetCustomFieldAction build() {
       return new OrderSetCustomFieldActionImpl(name, value);
   }
   
   public static OrderSetCustomFieldActionBuilder of() {
      return new OrderSetCustomFieldActionBuilder();
   }
   
   public static OrderSetCustomFieldActionBuilder of(final OrderSetCustomFieldAction template) {
      OrderSetCustomFieldActionBuilder builder = new OrderSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}