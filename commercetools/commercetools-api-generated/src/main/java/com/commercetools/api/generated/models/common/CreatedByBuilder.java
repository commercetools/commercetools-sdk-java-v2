package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.ClientLogging;
import com.commercetools.api.generated.models.common.CreatedBy;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CreatedByBuilder {
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private String clientId;
   
   @Nullable
   private String externalUserId;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerReference customer;
   
   public CreatedByBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CreatedByBuilder clientId(@Nullable final String clientId) {
      this.clientId = clientId;
      return this;
   }
   
   public CreatedByBuilder externalUserId(@Nullable final String externalUserId) {
      this.externalUserId = externalUserId;
      return this;
   }
   
   public CreatedByBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerReference customer) {
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