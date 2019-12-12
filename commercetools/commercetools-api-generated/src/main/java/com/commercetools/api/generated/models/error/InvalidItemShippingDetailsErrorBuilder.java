package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidItemShippingDetailsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidItemShippingDetailsErrorBuilder {
   
   
   private String message;
   
   
   private String itemId;
   
   
   private String subject;
   
   public InvalidItemShippingDetailsErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public InvalidItemShippingDetailsErrorBuilder itemId( final String itemId) {
      this.itemId = itemId;
      return this;
   }
   
   public InvalidItemShippingDetailsErrorBuilder subject( final String subject) {
      this.subject = subject;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getItemId(){
      return this.itemId;
   }
   
   
   public String getSubject(){
      return this.subject;
   }

   public InvalidItemShippingDetailsError build() {
       return new InvalidItemShippingDetailsErrorImpl(message, itemId, subject);
   }
   
   public static InvalidItemShippingDetailsErrorBuilder of() {
      return new InvalidItemShippingDetailsErrorBuilder();
   }
   
   public static InvalidItemShippingDetailsErrorBuilder of(final InvalidItemShippingDetailsError template) {
      InvalidItemShippingDetailsErrorBuilder builder = new InvalidItemShippingDetailsErrorBuilder();
      builder.message = template.getMessage();
      builder.itemId = template.getItemId();
      builder.subject = template.getSubject();
      return builder;
   }
   
}