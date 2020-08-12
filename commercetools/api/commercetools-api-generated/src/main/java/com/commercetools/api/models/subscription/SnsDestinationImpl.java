package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SnsDestinationImpl implements SnsDestination {

   private String type;
   
   private String accessKey;
   
   private String accessSecret;
   
   private String topicArn;

   @JsonCreator
   SnsDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("topicArn") final String topicArn) {
      this.accessKey = accessKey;
      this.accessSecret = accessSecret;
      this.topicArn = topicArn;
      this.type = "SNS";
   }
   public SnsDestinationImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getAccessSecret(){
      return this.accessSecret;
   }
   
   
   public String getTopicArn(){
      return this.topicArn;
   }

   public void setAccessKey(final String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setAccessSecret(final String accessSecret){
      this.accessSecret = accessSecret;
   }
   
   public void setTopicArn(final String topicArn){
      this.topicArn = topicArn;
   }

}
