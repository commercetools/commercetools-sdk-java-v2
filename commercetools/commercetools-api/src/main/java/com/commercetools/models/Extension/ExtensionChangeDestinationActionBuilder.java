package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionDestination;
import com.commercetools.models.extension.ExtensionUpdateAction;
import com.commercetools.models.extension.ExtensionChangeDestinationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionChangeDestinationActionBuilder {
   
   
   private com.commercetools.models.extension.ExtensionDestination destination;
   
   public ExtensionChangeDestinationActionBuilder destination( final com.commercetools.models.extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   
   public com.commercetools.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }

   public ExtensionChangeDestinationAction build() {
       return new ExtensionChangeDestinationActionImpl(destination);
   }
   
   public static ExtensionChangeDestinationActionBuilder of() {
      return new ExtensionChangeDestinationActionBuilder();
   }
   
   public static ExtensionChangeDestinationActionBuilder of(final ExtensionChangeDestinationAction template) {
      ExtensionChangeDestinationActionBuilder builder = new ExtensionChangeDestinationActionBuilder();
      builder.destination = template.getDestination();
      return builder;
   }
   
}