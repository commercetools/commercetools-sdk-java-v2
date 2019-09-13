package com.commercetools.models.message;

import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.message.Message;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerSetMessageImpl implements OrderCustomerSetMessage {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.Long sequenceNumber;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;
   
   private com.commercetools.models.customer_group.CustomerGroupReference oldCustomerGroup;
   
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.customer.CustomerReference oldCustomer;
   
   private com.commercetools.models.customer.CustomerReference customer;

   @JsonCreator
   OrderCustomerSetMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type, @JsonProperty("oldCustomerGroup") final com.commercetools.models.customer_group.CustomerGroupReference oldCustomerGroup, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomer") final com.commercetools.models.customer.CustomerReference oldCustomer, @JsonProperty("customer") final com.commercetools.models.customer.CustomerReference customer) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = type;
      this.oldCustomerGroup = oldCustomerGroup;
      this.customerGroup = customerGroup;
      this.oldCustomer = oldCustomer;
      this.customer = customer;
   }
   public OrderCustomerSetMessageImpl() {
      
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
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }
   
   
   public com.commercetools.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }
   
   public void setOldCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference oldCustomerGroup){
      this.oldCustomerGroup = oldCustomerGroup;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setOldCustomer(final com.commercetools.models.customer.CustomerReference oldCustomer){
      this.oldCustomer = oldCustomer;
   }
   
   public void setCustomer(final com.commercetools.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}