package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import com.commercetools.models.channel.ChannelChangeKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelChangeKeyActionBuilder {
   
   
   private String key;
   
   public ChannelChangeKeyActionBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public ChannelChangeKeyAction build() {
       return new ChannelChangeKeyActionImpl(key);
   }
   
   public static ChannelChangeKeyActionBuilder of() {
      return new ChannelChangeKeyActionBuilder();
   }
   
   public static ChannelChangeKeyActionBuilder of(final ChannelChangeKeyAction template) {
      ChannelChangeKeyActionBuilder builder = new ChannelChangeKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}