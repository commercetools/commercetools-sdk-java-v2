package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionUpdateAction;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionChangeDestinationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionChangeDestinationActionBuilder {
   
   
   private com.commercetools.models.Extension.ExtensionDestination destination;
   
   public ExtensionChangeDestinationActionBuilder destination( final com.commercetools.models.Extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   
   public com.commercetools.models.Extension.ExtensionDestination getDestination(){
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