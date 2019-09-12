package com.commercetools.models.Common;

import com.commercetools.models.Common.ClientLogging;
import com.commercetools.models.Common.CreatedBy;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CreatedByBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.lang.String clientId;
   
   @Nullable
   private java.lang.String externalUserId;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public CreatedByBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CreatedByBuilder clientId(@Nullable final java.lang.String clientId) {
      this.clientId = clientId;
      return this;
   }
   
   public CreatedByBuilder externalUserId(@Nullable final java.lang.String externalUserId) {
      this.externalUserId = externalUserId;
      return this;
   }
   
   public CreatedByBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
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
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public CreatedBy build() {
       return new CreatedByImpl(anonymousId, clientId, externalUserId, customer);
   }
   
   public static CreatedByBuilder of() {
      return new CreatedByBuilder();
   }
   
   public static CreatedByBuilder of(final CreatedBy template) {
      CreatedByBuilder builder = new CreatedByBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.clientId = template.getClientId();
      builder.externalUserId = template.getExternalUserId();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}