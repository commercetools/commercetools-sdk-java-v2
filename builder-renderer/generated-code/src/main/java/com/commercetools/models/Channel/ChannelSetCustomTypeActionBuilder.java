package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Channel.ChannelSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public ChannelSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ChannelSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public ChannelSetCustomTypeAction build() {
       return new ChannelSetCustomTypeActionImpl(fields, type);
   }
   
   public static ChannelSetCustomTypeActionBuilder of() {
      return new ChannelSetCustomTypeActionBuilder();
   }
   
   public static ChannelSetCustomTypeActionBuilder of(final ChannelSetCustomTypeAction template) {
      ChannelSetCustomTypeActionBuilder builder = new ChannelSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}