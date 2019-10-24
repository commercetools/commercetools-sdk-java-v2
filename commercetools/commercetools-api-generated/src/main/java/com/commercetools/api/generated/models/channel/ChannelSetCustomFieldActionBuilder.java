package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.channel.ChannelSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public ChannelSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ChannelSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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