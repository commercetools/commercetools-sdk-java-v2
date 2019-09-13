package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.customer.CustomerSetDateOfBirthAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetDateOfBirthActionBuilder {
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   public CustomerSetDateOfBirthActionBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   @Nullable
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public CustomerSetDateOfBirthAction build() {
       return new CustomerSetDateOfBirthActionImpl(dateOfBirth);
   }
   
   public static CustomerSetDateOfBirthActionBuilder of() {
      return new CustomerSetDateOfBirthActionBuilder();
   }
   
   public static CustomerSetDateOfBirthActionBuilder of(final CustomerSetDateOfBirthAction template) {
      CustomerSetDateOfBirthActionBuilder builder = new CustomerSetDateOfBirthActionBuilder();
      builder.dateOfBirth = template.getDateOfBirth();
      return builder;
   }
   
}