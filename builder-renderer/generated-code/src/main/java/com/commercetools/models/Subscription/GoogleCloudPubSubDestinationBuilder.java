package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
import java.lang.String;
import com.commercetools.models.Subscription.GoogleCloudPubSubDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class GoogleCloudPubSubDestinationBuilder {
   
   
   private java.lang.String topic;
   
   
   private java.lang.String projectId;
   
   public GoogleCloudPubSubDestinationBuilder topic( final java.lang.String topic) {
      this.topic = topic;
      return this;
   }
   
   public GoogleCloudPubSubDestinationBuilder projectId( final java.lang.String projectId) {
      this.projectId = projectId;
      return this;
   }
   
   
   public java.lang.String getTopic(){
      return this.topic;
   }
   
   
   public java.lang.String getProjectId(){
      return this.projectId;
   }

   public GoogleCloudPubSubDestination build() {
       return new GoogleCloudPubSubDestinationImpl(topic, projectId);
   }
   
   public static GoogleCloudPubSubDestinationBuilder of() {
      return new GoogleCloudPubSubDestinationBuilder();
   }
   
   public static GoogleCloudPubSubDestinationBuilder of(final GoogleCloudPubSubDestination template) {
      GoogleCloudPubSubDestinationBuilder builder = new GoogleCloudPubSubDestinationBuilder();
      builder.topic = template.getTopic();
      builder.projectId = template.getProjectId();
      return builder;
   }
   
}