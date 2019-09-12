package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
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
public final class SqsDestinationImpl implements SqsDestination {

   private java.lang.String type;
   
   private java.lang.String accessKey;
   
   private java.lang.String queueUrl;
   
   private java.lang.String region;
   
   private java.lang.String accessSecret;

   @JsonCreator
   SqsDestinationImpl(@JsonProperty("accessKey") final java.lang.String accessKey, @JsonProperty("queueUrl") final java.lang.String queueUrl, @JsonProperty("region") final java.lang.String region, @JsonProperty("accessSecret") final java.lang.String accessSecret) {
      this.accessKey = accessKey;
      this.queueUrl = queueUrl;
      this.region = region;
      this.accessSecret = accessSecret;
      this.type = "SQS";
   }
   public SqsDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
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

   public void setAccessKey(final java.lang.String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setQueueUrl(final java.lang.String queueUrl){
      this.queueUrl = queueUrl;
   }
   
   public void setRegion(final java.lang.String region){
      this.region = region;
   }
   
   public void setAccessSecret(final java.lang.String accessSecret){
      this.accessSecret = accessSecret;
   }

}