package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerCreateEmailToken;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreateEmailTokenBuilder {
   
   
   private Long ttlMinutes;
   
   
   private String id;
   
   @Nullable
   private Long version;
   
   public CustomerCreateEmailTokenBuilder ttlMinutes( final Long ttlMinutes) {
      this.ttlMinutes = ttlMinutes;
      return this;
   }
   
   public CustomerCreateEmailTokenBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerCreateEmailTokenBuilder version(@Nullable final Long version) {
      this.version = version;
      return this;
   }
   
   
   public Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public Long getVersion(){
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