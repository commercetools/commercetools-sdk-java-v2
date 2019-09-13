package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidItemShippingDetailsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidItemShippingDetailsErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.lang.String itemId;
   
   
   private java.lang.String subject;
   
   public InvalidItemShippingDetailsErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public InvalidItemShippingDetailsErrorBuilder itemId( final java.lang.String itemId) {
      this.itemId = itemId;
      return this;
   }
   
   public InvalidItemShippingDetailsErrorBuilder subject( final java.lang.String subject) {
      this.subject = subject;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getItemId(){
      return this.itemId;
   }
   
   
   public java.lang.String getSubject(){
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