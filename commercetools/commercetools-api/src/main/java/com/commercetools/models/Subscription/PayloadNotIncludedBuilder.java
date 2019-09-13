package com.commercetools.models.subscription;

import java.lang.String;
import com.commercetools.models.subscription.PayloadNotIncluded;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PayloadNotIncludedBuilder {
   
   
   private java.lang.String reason;
   
   
   private java.lang.String payloadType;
   
   public PayloadNotIncludedBuilder reason( final java.lang.String reason) {
      this.reason = reason;
      return this;
   }
   
   public PayloadNotIncludedBuilder payloadType( final java.lang.String payloadType) {
      this.payloadType = payloadType;
      return this;
   }
   
   
   public java.lang.String getReason(){
      return this.reason;
   }
   
   
   public java.lang.String getPayloadType(){
      return this.payloadType;
   }

   public PayloadNotIncluded build() {
       return new PayloadNotIncludedImpl(reason, payloadType);
   }
   
   public static PayloadNotIncludedBuilder of() {
      return new PayloadNotIncludedBuilder();
   }
   
   public static PayloadNotIncludedBuilder of(final PayloadNotIncluded template) {
      PayloadNotIncludedBuilder builder = new PayloadNotIncludedBuilder();
      builder.reason = template.getReason();
      builder.payloadType = template.getPayloadType();
      return builder;
   }
   
}