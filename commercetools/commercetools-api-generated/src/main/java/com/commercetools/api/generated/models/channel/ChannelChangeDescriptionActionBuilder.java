package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.channel.ChannelChangeDescriptionAction;
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
public final class ChannelChangeDescriptionActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public ChannelChangeDescriptionActionBuilder description( final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public ChannelChangeDescriptionAction build() {
       return new ChannelChangeDescriptionActionImpl(description);
   }
   
   public static ChannelChangeDescriptionActionBuilder of() {
      return new ChannelChangeDescriptionActionBuilder();
   }
   
   public static ChannelChangeDescriptionActionBuilder of(final ChannelChangeDescriptionAction template) {
      ChannelChangeDescriptionActionBuilder builder = new ChannelChangeDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}