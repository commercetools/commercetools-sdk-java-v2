package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.AzureEventGridDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AzureEventGridDestinationBuilder {
   
   
   private String accessKey;
   
   
   private String uri;
   
   public AzureEventGridDestinationBuilder accessKey( final String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public AzureEventGridDestinationBuilder uri( final String uri) {
      this.uri = uri;
      return this;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getUri(){
      return this.uri;
   }

   public AzureEventGridDestination build() {
       return new AzureEventGridDestinationImpl(accessKey, uri);
   }
   
   public static AzureEventGridDestinationBuilder of() {
      return new AzureEventGridDestinationBuilder();
   }
   
   public static AzureEventGridDestinationBuilder of(final AzureEventGridDestination template) {
      AzureEventGridDestinationBuilder builder = new AzureEventGridDestinationBuilder();
      builder.accessKey = template.getAccessKey();
      builder.uri = template.getUri();
      return builder;
   }
   
}