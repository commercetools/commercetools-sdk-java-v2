package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CustomerEmailVerifiedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerEmailVerifiedMessagePayloadBuilder {
   
   
   

   public CustomerEmailVerifiedMessagePayload build() {
       return new CustomerEmailVerifiedMessagePayloadImpl();
   }
   
   public static CustomerEmailVerifiedMessagePayloadBuilder of() {
      return new CustomerEmailVerifiedMessagePayloadBuilder();
   }
   
   public static CustomerEmailVerifiedMessagePayloadBuilder of(final CustomerEmailVerifiedMessagePayload template) {
      CustomerEmailVerifiedMessagePayloadBuilder builder = new CustomerEmailVerifiedMessagePayloadBuilder();
      return builder;
   }
   
}