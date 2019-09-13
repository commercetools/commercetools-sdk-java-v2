package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.channel.ChannelSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public ChannelSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ChannelSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public ChannelSetCustomFieldAction build() {
       return new ChannelSetCustomFieldActionImpl(name, value);
   }
   
   public static ChannelSetCustomFieldActionBuilder of() {
      return new ChannelSetCustomFieldActionBuilder();
   }
   
   public static ChannelSetCustomFieldActionBuilder of(final ChannelSetCustomFieldAction template) {
      ChannelSetCustomFieldActionBuilder builder = new ChannelSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}