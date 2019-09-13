package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import java.lang.String;
import com.commercetools.models.subscription.SnsDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SnsDestinationBuilder {
   
   
   private java.lang.String accessKey;
   
   
   private java.lang.String topicArn;
   
   
   private java.lang.String accessSecret;
   
   public SnsDestinationBuilder accessKey( final java.lang.String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public SnsDestinationBuilder topicArn( final java.lang.String topicArn) {
      this.topicArn = topicArn;
      return this;
   }
   
   public SnsDestinationBuilder accessSecret( final java.lang.String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
   }
   
   
   public java.lang.String getAccessKey(){
      return this.accessKey;
   }
   
   
   public java.lang.String getTopicArn(){
      return this.topicArn;
   }
   
   
   public java.lang.String getAccessSecret(){
      return this.accessSecret;
   }

   public SnsDestination build() {
       return new SnsDestinationImpl(accessKey, topicArn, accessSecret);
   }
   
   public static SnsDestinationBuilder of() {
      return new SnsDestinationBuilder();
   }
   
   public static SnsDestinationBuilder of(final SnsDestination template) {
      SnsDestinationBuilder builder = new SnsDestinationBuilder();
      builder.accessKey = template.getAccessKey();
      builder.topicArn = template.getTopicArn();
      builder.accessSecret = template.getAccessSecret();
      return builder;
   }
   
}