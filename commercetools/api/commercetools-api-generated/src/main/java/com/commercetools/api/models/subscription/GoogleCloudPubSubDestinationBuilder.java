package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GoogleCloudPubSubDestinationBuilder {


   private String topic;


   private String projectId;

   public GoogleCloudPubSubDestinationBuilder topic( final String topic) {
      this.topic = topic;
      return this;
   }

   public GoogleCloudPubSubDestinationBuilder projectId( final String projectId) {
      this.projectId = projectId;
      return this;
   }


   public String getTopic(){
      return this.topic;
   }


   public String getProjectId(){
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
