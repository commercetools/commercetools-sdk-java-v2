package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.channel.ChannelChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public ChannelChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public ChannelChangeNameAction build() {
       return new ChannelChangeNameActionImpl(name);
   }
   
   public static ChannelChangeNameActionBuilder of() {
      return new ChannelChangeNameActionBuilder();
   }
   
   public static ChannelChangeNameActionBuilder of(final ChannelChangeNameAction template) {
      ChannelChangeNameActionBuilder builder = new ChannelChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}