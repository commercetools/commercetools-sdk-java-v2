package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.OrderCustomerSetMessage;
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
public final class OrderCustomerSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference oldCustomerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerReference oldCustomer;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerReference customer;
   
   public OrderCustomerSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder oldCustomerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder oldCustomer(@Nullable final com.commercetools.api.generated.models.customer.CustomerReference oldCustomer) {
      this.oldCustomer = oldCustomer;
      return this;
   }
   
   public OrderCustomerSetMessageBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public OrderCustomerSetMessage build() {
       return new OrderCustomerSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, oldCustomerGroup, customerGroup, oldCustomer, customer);
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
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.oldCustomerGroup = template.getOldCustomerGroup();
      builder.customerGroup = template.getCustomerGroup();
      builder.oldCustomer = template.getOldCustomer();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}