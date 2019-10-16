package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
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
public final class SqsDestinationImpl implements SqsDestination {

   private String type;
   
   private String accessKey;
   
   private String queueUrl;
   
   private String region;
   
   private String accessSecret;

   @JsonCreator
   SqsDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("queueUrl") final String queueUrl, @JsonProperty("region") final String region, @JsonProperty("accessSecret") final String accessSecret) {
      this.accessKey = accessKey;
      this.queueUrl = queueUrl;
      this.region = region;
      this.accessSecret = accessSecret;
      this.type = "SQS";
   }
   public SqsDestinationImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
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

   public void setAccessKey(final String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setQueueUrl(final String queueUrl){
      this.queueUrl = queueUrl;
   }
   
   public void setRegion(final String region){
      this.region = region;
   }
   
   public void setAccessSecret(final String accessSecret){
      this.accessSecret = accessSecret;
   }

}