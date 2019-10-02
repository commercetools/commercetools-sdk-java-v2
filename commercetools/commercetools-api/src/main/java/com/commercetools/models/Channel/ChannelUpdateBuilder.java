package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import com.commercetools.models.channel.ChannelUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.channel.ChannelUpdateAction> actions;
   
   
   private Long version;
   
   public ChannelUpdateBuilder actions( final java.util.List<com.commercetools.models.channel.ChannelUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ChannelUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.channel.ChannelUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public ChannelUpdate build() {
       return new ChannelUpdateImpl(actions, version);
   }
   
   public static ChannelUpdateBuilder of() {
      return new ChannelUpdateBuilder();
   }
   
   public static ChannelUpdateBuilder of(final ChannelUpdate template) {
      ChannelUpdateBuilder builder = new ChannelUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}