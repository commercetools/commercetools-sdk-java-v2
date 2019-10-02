package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.SqsDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SqsDestinationBuilder {
   
   
   private String accessKey;
   
   
   private String queueUrl;
   
   
   private String region;
   
   
   private String accessSecret;
   
   public SqsDestinationBuilder accessKey( final String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public SqsDestinationBuilder queueUrl( final String queueUrl) {
      this.queueUrl = queueUrl;
      return this;
   }
   
   public SqsDestinationBuilder region( final String region) {
      this.region = region;
      return this;
   }
   
   public SqsDestinationBuilder accessSecret( final String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getQueueUrl(){
      return this.queueUrl;
   }
   
   
   public String getRegion(){
      return this.region;
   }
   
   
   public String getAccessSecret(){
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