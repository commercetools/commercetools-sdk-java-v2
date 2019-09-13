package com.commercetools.models.common;

import com.commercetools.models.common.ClientLogging;
import com.commercetools.models.common.LastModifiedBy;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LastModifiedByBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.lang.String clientId;
   
   @Nullable
   private java.lang.String externalUserId;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public LastModifiedByBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public LastModifiedByBuilder clientId(@Nullable final java.lang.String clientId) {
      this.clientId = clientId;
      return this;
   }
   
   public LastModifiedByBuilder externalUserId(@Nullable final java.lang.String externalUserId) {
      this.externalUserId = externalUserId;
      return this;
   }
   
   public LastModifiedByBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
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

   public LastModifiedBy build() {
       return new LastModifiedByImpl(anonymousId, clientId, externalUserId, customer);
   }
   
   public static LastModifiedByBuilder of() {
      return new LastModifiedByBuilder();
   }
   
   public static LastModifiedByBuilder of(final LastModifiedBy template) {
      LastModifiedByBuilder builder = new LastModifiedByBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.clientId = template.getClientId();
      builder.externalUserId = template.getExternalUserId();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}