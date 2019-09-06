package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Message.CustomerDateOfBirthSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerDateOfBirthSetMessagePayloadBuilder {
   
   
   private java.time.LocalDate dateOfBirth;
   
   public CustomerDateOfBirthSetMessagePayloadBuilder dateOfBirth( final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public CustomerDateOfBirthSetMessagePayload build() {
       return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
   }
   
   public static CustomerDateOfBirthSetMessagePayloadBuilder of() {
      return new CustomerDateOfBirthSetMessagePayloadBuilder();
   }
   
   public static CustomerDateOfBirthSetMessagePayloadBuilder of(final CustomerDateOfBirthSetMessagePayload template) {
      CustomerDateOfBirthSetMessagePayloadBuilder builder = new CustomerDateOfBirthSetMessagePayloadBuilder();
      builder.dateOfBirth = template.getDateOfBirth();
      return builder;
   }
   
}