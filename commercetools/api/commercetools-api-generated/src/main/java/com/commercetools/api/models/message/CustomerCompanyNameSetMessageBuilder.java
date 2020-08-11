package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCompanyNameSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   
   private String companyName;
   
   public CustomerCompanyNameSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public CustomerCompanyNameSetMessageBuilder companyName( final String companyName) {
      this.companyName = companyName;
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
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public String getCompanyName(){
      return this.companyName;
   }

   public CustomerCompanyNameSetMessage build() {
       return new CustomerCompanyNameSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, companyName);
   }
   
   public static CustomerCompanyNameSetMessageBuilder of() {
      return new CustomerCompanyNameSetMessageBuilder();
   }
   
   public static CustomerCompanyNameSetMessageBuilder of(final CustomerCompanyNameSetMessage template) {
      CustomerCompanyNameSetMessageBuilder builder = new CustomerCompanyNameSetMessageBuilder();
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
      builder.companyName = template.getCompanyName();
      return builder;
   }
   
}
