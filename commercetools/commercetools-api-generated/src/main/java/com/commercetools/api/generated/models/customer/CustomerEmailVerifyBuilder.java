package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerEmailVerify;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerEmailVerifyBuilder {
   
   
   private String tokenValue;
   
   @Nullable
   private Long version;
   
   public CustomerEmailVerifyBuilder tokenValue( final String tokenValue) {
      this.tokenValue = tokenValue;
      return this;
   }
   
   public CustomerEmailVerifyBuilder version(@Nullable final Long version) {
      this.version = version;
      return this;
   }
   
   
   public String getTokenValue(){
      return this.tokenValue;
   }
   
   @Nullable
   public Long getVersion(){
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