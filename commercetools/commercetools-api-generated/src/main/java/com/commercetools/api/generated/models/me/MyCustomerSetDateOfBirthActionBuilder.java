package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import java.time.LocalDate;
import com.commercetools.api.generated.models.me.MyCustomerSetDateOfBirthAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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