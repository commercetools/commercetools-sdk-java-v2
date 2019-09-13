package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.message.UserProvidedIdentifiers;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class UserProvidedIdentifiersBuilder {
   
   @Nullable
   private java.lang.String orderNumber;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String customerNumber;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString slug;
   
   @Nullable
   private java.lang.String key;
   
   public UserProvidedIdentifiersBuilder orderNumber(@Nullable final java.lang.String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder customerNumber(@Nullable final java.lang.String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder slug(@Nullable final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public UserProvidedIdentifiersBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getCustomerNumber(){
      return this.customerNumber;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   @Nullable
   public java.lang.String getKey(){
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