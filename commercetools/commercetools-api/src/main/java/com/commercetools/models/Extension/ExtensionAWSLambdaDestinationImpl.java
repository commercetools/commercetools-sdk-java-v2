package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
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
public final class ExtensionAWSLambdaDestinationImpl implements ExtensionAWSLambdaDestination {

   private java.lang.String type;
   
   private java.lang.String accessKey;
   
   private java.lang.String arn;
   
   private java.lang.String accessSecret;

   @JsonCreator
   ExtensionAWSLambdaDestinationImpl(@JsonProperty("accessKey") final java.lang.String accessKey, @JsonProperty("arn") final java.lang.String arn, @JsonProperty("accessSecret") final java.lang.String accessSecret) {
      this.accessKey = accessKey;
      this.arn = arn;
      this.accessSecret = accessSecret;
      this.type = "AWSLambda";
   }
   public ExtensionAWSLambdaDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getAccessKey(){
      return this.accessKey;
   }
   
   
   public java.lang.String getArn(){
      return this.arn;
   }
   
   
   public java.lang.String getAccessSecret(){
      return this.accessSecret;
   }

   public void setAccessKey(final java.lang.String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setArn(final java.lang.String arn){
      this.arn = arn;
   }
   
   public void setAccessSecret(final java.lang.String accessSecret){
      this.accessSecret = accessSecret;
   }

}