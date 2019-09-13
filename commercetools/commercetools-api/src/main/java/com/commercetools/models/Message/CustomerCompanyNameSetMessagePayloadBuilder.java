package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.CustomerCompanyNameSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCompanyNameSetMessagePayloadBuilder {
   
   
   private java.lang.String companyName;
   
   public CustomerCompanyNameSetMessagePayloadBuilder companyName( final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   
   public java.lang.String getCompanyName(){
      return this.companyName;
   }

   public CustomerCompanyNameSetMessagePayload build() {
       return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
   }
   
   public static CustomerCompanyNameSetMessagePayloadBuilder of() {
      return new CustomerCompanyNameSetMessagePayloadBuilder();
   }
   
   public static CustomerCompanyNameSetMessagePayloadBuilder of(final CustomerCompanyNameSetMessagePayload template) {
      CustomerCompanyNameSetMessagePayloadBuilder builder = new CustomerCompanyNameSetMessagePayloadBuilder();
      builder.companyName = template.getCompanyName();
      return builder;
   }
   
}