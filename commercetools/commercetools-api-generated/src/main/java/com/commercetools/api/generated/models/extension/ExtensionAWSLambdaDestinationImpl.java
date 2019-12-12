package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
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
public final class ExtensionAWSLambdaDestinationImpl implements ExtensionAWSLambdaDestination {

   private String type;
   
   private String accessKey;
   
   private String arn;
   
   private String accessSecret;

   @JsonCreator
   ExtensionAWSLambdaDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("arn") final String arn, @JsonProperty("accessSecret") final String accessSecret) {
      this.accessKey = accessKey;
      this.arn = arn;
      this.accessSecret = accessSecret;
      this.type = "AWSLambda";
   }
   public ExtensionAWSLambdaDestinationImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getArn(){
      return this.arn;
   }
   
   
   public String getAccessSecret(){
      return this.accessSecret;
   }

   public void setAccessKey(final String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setArn(final String arn){
      this.arn = arn;
   }
   
   public void setAccessSecret(final String accessSecret){
      this.accessSecret = accessSecret;
   }

}