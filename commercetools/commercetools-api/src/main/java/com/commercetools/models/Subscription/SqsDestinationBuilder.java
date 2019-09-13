package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import java.lang.String;
import com.commercetools.models.subscription.SqsDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SqsDestinationBuilder {
   
   
   private java.lang.String accessKey;
   
   
   private java.lang.String queueUrl;
   
   
   private java.lang.String region;
   
   
   private java.lang.String accessSecret;
   
   public SqsDestinationBuilder accessKey( final java.lang.String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public SqsDestinationBuilder queueUrl( final java.lang.String queueUrl) {
      this.queueUrl = queueUrl;
      return this;
   }
   
   public SqsDestinationBuilder region( final java.lang.String region) {
      this.region = region;
      return this;
   }
   
   public SqsDestinationBuilder accessSecret( final java.lang.String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
   }
   
   
   public java.lang.String getAccessKey(){
      return this.accessKey;
   }
   
   
   public java.lang.String getQueueUrl(){
      return this.queueUrl;
   }
   
   
   public java.lang.String getRegion(){
      return this.region;
   }
   
   
   public java.lang.String getAccessSecret(){
      return this.accessSecret;
   }

   public SqsDestination build() {
       return new SqsDestinationImpl(accessKey, queueUrl, region, accessSecret);
   }
   
   public static SqsDestinationBuilder of() {
      return new SqsDestinationBuilder();
   }
   
   public static SqsDestinationBuilder of(final SqsDestination template) {
      SqsDestinationBuilder builder = new SqsDestinationBuilder();
      builder.accessKey = template.getAccessKey();
      builder.queueUrl = template.getQueueUrl();
      builder.region = template.getRegion();
      builder.accessSecret = template.getAccessSecret();
      return builder;
   }
   
}