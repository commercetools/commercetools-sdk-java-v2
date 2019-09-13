package com.commercetools.models.common;

import com.commercetools.models.common.CreatedBy;
import com.commercetools.models.common.LastModifiedBy;
import com.commercetools.models.customer.CustomerReference;
import java.lang.String;
import com.commercetools.models.common.ClientLogging;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ClientLoggingBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.lang.String clientId;
   
   @Nullable
   private java.lang.String externalUserId;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public ClientLoggingBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public ClientLoggingBuilder clientId(@Nullable final java.lang.String clientId) {
      this.clientId = clientId;
      return this;
   }
   
   public ClientLoggingBuilder externalUserId(@Nullable final java.lang.String externalUserId) {
      this.externalUserId = externalUserId;
      return this;
   }
   
   public ClientLoggingBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.lang.String getClientId(){
      return this.clientId;
   }
   
   @Nullable
   public java.lang.String getExternalUserId(){
      return this.externalUserId;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public ClientLogging build() {
       return new ClientLoggingImpl(anonymousId, clientId, externalUserId, customer);
   }
   
   public static ClientLoggingBuilder of() {
      return new ClientLoggingBuilder();
   }
   
   public static ClientLoggingBuilder of(final ClientLogging template) {
      ClientLoggingBuilder builder = new ClientLoggingBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.clientId = template.getClientId();
      builder.externalUserId = template.getExternalUserId();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}