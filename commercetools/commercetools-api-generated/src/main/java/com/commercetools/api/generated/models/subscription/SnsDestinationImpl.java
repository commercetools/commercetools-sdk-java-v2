package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
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
   
   private String topicArn;
   
   private String accessSecret;

   @JsonCreator
   SnsDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("topicArn") final String topicArn, @JsonProperty("accessSecret") final String accessSecret) {
      this.accessKey = accessKey;
      this.topicArn = topicArn;
      this.accessSecret = accessSecret;
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
   
   
   public String getTopicArn(){
      return this.topicArn;
   }
   
   
   public String getAccessSecret(){
      return this.accessSecret;
   }

   public void setAccessKey(final String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setTopicArn(final String topicArn){
      this.topicArn = topicArn;
   }
   
   public void setAccessSecret(final String accessSecret){
      this.accessSecret = accessSecret;
   }

}