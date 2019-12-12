package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.message.UserProvidedIdentifiers;
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
public final class UserProvidedIdentifiersBuilder {
   
   @Nullable
   private String orderNumber;
   
   @Nullable
   private String externalId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String customerNumber;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   @Nullable
   private String key;
   
   public UserProvidedIdentifiersBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder customerNumber(@Nullable final String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder slug(@Nullable final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public UserProvidedIdentifiers build() {
       return new UserProvidedIdentifiersImpl(orderNumber, externalId, sku, customerNumber, slug, key);
   }
   
   public static UserProvidedIdentifiersBuilder of() {
      return new UserProvidedIdentifiersBuilder();
   }
   
   public static UserProvidedIdentifiersBuilder of(final UserProvidedIdentifiers template) {
      UserProvidedIdentifiersBuilder builder = new UserProvidedIdentifiersBuilder();
      builder.orderNumber = template.getOrderNumber();
      builder.externalId = template.getExternalId();
      builder.sku = template.getSku();
      builder.customerNumber = template.getCustomerNumber();
      builder.slug = template.getSlug();
      builder.key = template.getKey();
      return builder;
   }
   
}