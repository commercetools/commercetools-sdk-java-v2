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
public final class SnsDestinationImpl implements SnsDestination {

   private java.lang.String type;
   
   private java.lang.String accessKey;
   
   private java.lang.String topicArn;
   
   private java.lang.String accessSecret;

   @JsonCreator
   SnsDestinationImpl(@JsonProperty("accessKey") final java.lang.String accessKey, @JsonProperty("topicArn") final java.lang.String topicArn, @JsonProperty("accessSecret") final java.lang.String accessSecret) {
      this.accessKey = accessKey;
      this.topicArn = topicArn;
      this.accessSecret = accessSecret;
      this.type = "SNS";
   }
   public SnsDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getAccessKey(){
      return this.accessKey;
   }
   
   
   public java.lang.String getTopicArn(){
      return this.topicArn;
   }
   
   
   public java.lang.String getAccessSecret(){
      return this.accessSecret;
   }

   public void setAccessKey(final java.lang.String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setTopicArn(final java.lang.String topicArn){
      this.topicArn = topicArn;
   }
   
   public void setAccessSecret(final java.lang.String accessSecret){
      this.accessSecret = accessSecret;
   }

}