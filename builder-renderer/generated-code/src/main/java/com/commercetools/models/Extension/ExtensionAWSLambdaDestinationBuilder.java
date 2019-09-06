package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionAWSLambdaDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionAWSLambdaDestinationBuilder {
   
   
   private java.lang.String accessKey;
   
   
   private java.lang.String arn;
   
   
   private java.lang.String accessSecret;
   
   public ExtensionAWSLambdaDestinationBuilder accessKey( final java.lang.String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public ExtensionAWSLambdaDestinationBuilder arn( final java.lang.String arn) {
      this.arn = arn;
      return this;
   }
   
   public ExtensionAWSLambdaDestinationBuilder accessSecret( final java.lang.String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
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

   public ExtensionAWSLambdaDestination build() {
       return new ExtensionAWSLambdaDestinationImpl(accessKey, arn, accessSecret);
   }
   
   public static ExtensionAWSLambdaDestinationBuilder of() {
      return new ExtensionAWSLambdaDestinationBuilder();
   }
   
   public static ExtensionAWSLambdaDestinationBuilder of(final ExtensionAWSLambdaDestination template) {
      ExtensionAWSLambdaDestinationBuilder builder = new ExtensionAWSLambdaDestinationBuilder();
      builder.accessKey = template.getAccessKey();
      builder.arn = template.getArn();
      builder.accessSecret = template.getAccessSecret();
      return builder;
   }
   
}