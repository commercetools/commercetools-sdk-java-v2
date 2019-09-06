package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.String;
import com.commercetools.models.Channel.ChannelChangeKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelChangeKeyActionBuilder {
   
   
   private java.lang.String key;
   
   public ChannelChangeKeyActionBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getKey(){
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