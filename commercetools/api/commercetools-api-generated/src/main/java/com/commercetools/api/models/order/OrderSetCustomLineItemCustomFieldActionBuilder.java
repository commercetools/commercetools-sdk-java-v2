package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetCustomLineItemCustomFieldActionBuilder {
   
   
   private String customLineItemId;
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderSetCustomLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public OrderSetCustomLineItemCustomFieldAction build() {
       return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
   }
   
   public static OrderSetCustomLineItemCustomFieldActionBuilder of() {
      return new OrderSetCustomLineItemCustomFieldActionBuilder();
   }
   
   public static OrderSetCustomLineItemCustomFieldActionBuilder of(final OrderSetCustomLineItemCustomFieldAction template) {
      OrderSetCustomLineItemCustomFieldActionBuilder builder = new OrderSetCustomLineItemCustomFieldActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}
