package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GoogleCloudPubSubDestinationImpl implements GoogleCloudPubSubDestination {

   private java.lang.String type;
   
   private java.lang.String topic;
   
   private java.lang.String projectId;

   @JsonCreator
   GoogleCloudPubSubDestinationImpl(@JsonProperty("topic") final java.lang.String topic, @JsonProperty("projectId") final java.lang.String projectId) {
      this.topic = topic;
      this.projectId = projectId;
      this.type = "GoogleCloudPubSub";
   }
   public GoogleCloudPubSubDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getTopic(){
      return this.topic;
   }
   
   
   public java.lang.String getProjectId(){
      return this.projectId;
   }

   public void setTopic(final java.lang.String topic){
      this.topic = topic;
   }
   
   public void setProjectId(final java.lang.String projectId){
      this.projectId = projectId;
   }

}