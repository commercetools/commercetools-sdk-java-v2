package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import java.time.LocalDate;
import com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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