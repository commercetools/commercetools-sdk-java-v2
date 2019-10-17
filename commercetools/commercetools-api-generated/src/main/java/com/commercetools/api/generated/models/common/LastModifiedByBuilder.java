package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.ClientLogging;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LastModifiedByBuilder {
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private String clientId;
   
   @Nullable
   private String externalUserId;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerReference customer;
   
   public LastModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public LastModifiedByBuilder clientId(@Nullable final String clientId) {
      this.clientId = clientId;
      return this;
   }
   
   public LastModifiedByBuilder externalUserId(@Nullable final String externalUserId) {
      this.externalUserId = externalUserId;
      return this;
   }
   
   public LastModifiedByBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public String getClientId(){
      return this.clientId;
   }
   
   @Nullable
   public String getExternalUserId(){
      return this.externalUserId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
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