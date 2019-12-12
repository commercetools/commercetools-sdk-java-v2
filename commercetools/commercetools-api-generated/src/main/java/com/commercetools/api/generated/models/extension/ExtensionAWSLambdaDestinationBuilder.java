package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionAWSLambdaDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionAWSLambdaDestinationBuilder {
   
   
   private String accessKey;
   
   
   private String arn;
   
   
   private String accessSecret;
   
   public ExtensionAWSLambdaDestinationBuilder accessKey( final String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public ExtensionAWSLambdaDestinationBuilder arn( final String arn) {
      this.arn = arn;
      return this;
   }
   
   public ExtensionAWSLambdaDestinationBuilder accessSecret( final String accessSecret) {
      this.accessSecret = accessSecret;
      return this;
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