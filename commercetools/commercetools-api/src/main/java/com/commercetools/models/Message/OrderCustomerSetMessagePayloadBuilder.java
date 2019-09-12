package com.commercetools.models.Message;

import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderCustomerSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCustomerSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference oldCustomer;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder oldCustomer(@Nullable final com.commercetools.models.Customer.CustomerReference oldCustomer) {
      this.oldCustomer = oldCustomer;
      return this;
   }
   
   public OrderCustomerSetMessagePayloadBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
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