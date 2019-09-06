package com.commercetools.models.Customer;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Customer.CustomerCreateEmailToken;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreateEmailTokenBuilder {
   
   
   private java.lang.Long ttlMinutes;
   
   
   private java.lang.String id;
   
   @Nullable
   private java.lang.Long version;
   
   public CustomerCreateEmailTokenBuilder ttlMinutes( final java.lang.Long ttlMinutes) {
      this.ttlMinutes = ttlMinutes;
      return this;
   }
   
   public CustomerCreateEmailTokenBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerCreateEmailTokenBuilder version(@Nullable final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.Long getVersion(){
      return this.version;
   }

   public CustomerCreateEmailToken build() {
       return new CustomerCreateEmailTokenImpl(ttlMinutes, id, version);
   }
   
   public static CustomerCreateEmailTokenBuilder of() {
      return new CustomerCreateEmailTokenBuilder();
   }
   
   public static CustomerCreateEmailTokenBuilder of(final CustomerCreateEmailToken template) {
      CustomerCreateEmailTokenBuilder builder = new CustomerCreateEmailTokenBuilder();
      builder.ttlMinutes = template.getTtlMinutes();
      builder.id = template.getId();
      builder.version = template.getVersion();
      return builder;
   }
   
}