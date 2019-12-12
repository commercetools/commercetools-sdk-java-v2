package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerGroupSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerGroupSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference oldCustomerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   public OrderCustomerGroupSetMessagePayloadBuilder oldCustomerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }
   
   public OrderCustomerGroupSetMessagePayloadBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   public OrderCustomerGroupSetMessagePayload build() {
       return new OrderCustomerGroupSetMessagePayloadImpl(oldCustomerGroup, customerGroup);
   }
   
   public static OrderCustomerGroupSetMessagePayloadBuilder of() {
      return new OrderCustomerGroupSetMessagePayloadBuilder();
   }
   
   public static OrderCustomerGroupSetMessagePayloadBuilder of(final OrderCustomerGroupSetMessagePayload template) {
      OrderCustomerGroupSetMessagePayloadBuilder builder = new OrderCustomerGroupSetMessagePayloadBuilder();
      builder.oldCustomerGroup = template.getOldCustomerGroup();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }
   
}