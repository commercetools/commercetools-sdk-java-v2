package com.commercetools.models.message;

import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.OrderCustomerSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCustomerSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference oldCustomerGroup;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference oldCustomer;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder oldCustomer(@Nullable final com.commercetools.models.customer.CustomerReference oldCustomer) {
      this.oldCustomer = oldCustomer;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public OrderCustomerSetMessagePayload build() {
       return new OrderCustomerSetMessagePayloadImpl(oldCustomerGroup, customerGroup, oldCustomer, customer);
   }
   
   public static OrderCustomerSetMessagePayloadBuilder of() {
      return new OrderCustomerSetMessagePayloadBuilder();
   }
   
   public static OrderCustomerSetMessagePayloadBuilder of(final OrderCustomerSetMessagePayload template) {
      OrderCustomerSetMessagePayloadBuilder builder = new OrderCustomerSetMessagePayloadBuilder();
      builder.oldCustomerGroup = template.getOldCustomerGroup();
      builder.customerGroup = template.getCustomerGroup();
      builder.oldCustomer = template.getOldCustomer();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}