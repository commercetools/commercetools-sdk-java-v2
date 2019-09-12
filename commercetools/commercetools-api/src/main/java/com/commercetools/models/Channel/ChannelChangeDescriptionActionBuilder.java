package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Channel.ChannelChangeDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelChangeDescriptionActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString description;
   
   public ChannelChangeDescriptionActionBuilder description( final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
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