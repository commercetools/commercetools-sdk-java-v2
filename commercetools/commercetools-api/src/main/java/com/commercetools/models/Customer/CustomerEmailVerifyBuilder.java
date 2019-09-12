package com.commercetools.models.Customer;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Customer.CustomerEmailVerify;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerEmailVerifyBuilder {
   
   
   private java.lang.String tokenValue;
   
   @Nullable
   private java.lang.Long version;
   
   public CustomerEmailVerifyBuilder tokenValue( final java.lang.String tokenValue) {
      this.tokenValue = tokenValue;
      return this;
   }
   
   public CustomerEmailVerifyBuilder version(@Nullable final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.String getTokenValue(){
      return this.tokenValue;
   }
   
   @Nullable
   public java.lang.Long getVersion(){
      return this.version;
   }

   public CustomerEmailVerify build() {
       return new CustomerEmailVerifyImpl(tokenValue, version);
   }
   
   public static CustomerEmailVerifyBuilder of() {
      return new CustomerEmailVerifyBuilder();
   }
   
   public static CustomerEmailVerifyBuilder of(final CustomerEmailVerify template) {
      CustomerEmailVerifyBuilder builder = new CustomerEmailVerifyBuilder();
      builder.tokenValue = template.getTokenValue();
      builder.version = template.getVersion();
      return builder;
   }
   
}