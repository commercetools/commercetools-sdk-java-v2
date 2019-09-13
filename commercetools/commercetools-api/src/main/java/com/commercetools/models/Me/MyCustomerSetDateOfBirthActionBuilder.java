package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.me.MyCustomerSetDateOfBirthAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetDateOfBirthActionBuilder {
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   public MyCustomerSetDateOfBirthActionBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   @Nullable
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public MyCustomerSetDateOfBirthAction build() {
       return new MyCustomerSetDateOfBirthActionImpl(dateOfBirth);
   }
   
   public static MyCustomerSetDateOfBirthActionBuilder of() {
      return new MyCustomerSetDateOfBirthActionBuilder();
   }
   
   public static MyCustomerSetDateOfBirthActionBuilder of(final MyCustomerSetDateOfBirthAction template) {
      MyCustomerSetDateOfBirthActionBuilder builder = new MyCustomerSetDateOfBirthActionBuilder();
      builder.dateOfBirth = template.getDateOfBirth();
      return builder;
   }
   
}