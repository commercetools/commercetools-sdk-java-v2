package com.commercetools.models.Message;

import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.OrderCustomerSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCustomerSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference oldCustomer;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public OrderCustomerSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder oldCustomerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder oldCustomer(@Nullable final com.commercetools.models.Customer.CustomerReference oldCustomer) {
      this.oldCustomer = oldCustomer;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
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

   public OrderCustomerSetMessage build() {
       return new OrderCustomerSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, oldCustomerGroup, customerGroup, oldCustomer, customer);
   }
   
   public static OrderCustomerSetMessageBuilder of() {
      return new OrderCustomerSetMessageBuilder();
   }
   
   public static OrderCustomerSetMessageBuilder of(final OrderCustomerSetMessage template) {
      OrderCustomerSetMessageBuilder builder = new OrderCustomerSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.oldCustomerGroup = template.getOldCustomerGroup();
      builder.customerGroup = template.getCustomerGroup();
      builder.oldCustomer = template.getOldCustomer();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}