package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.SnsDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SnsDestinationBuilder {
   
   
   private String accessKey;
   
   
   private String topicArn;
   
   
   private String accessSecret;
   
   public SnsDestinationBuilder accessKey( final String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public SnsDestinationBuilder topicArn( final String topicArn) {
      this.topicArn = topicArn;
      return this;
   }
   
   public SnsDestinationBuilder accessSecret( final String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getTopicArn(){
      return this.topicArn;
   }
   
   
   public String getAccessSecret(){
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