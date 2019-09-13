package com.commercetools.models.channel;

import com.commercetools.models.channel.Channel;
import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.channel.ChannelReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.channel.Channel obj;
   
   public ChannelReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ChannelReferenceBuilder obj(@Nullable final com.commercetools.models.channel.Channel obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.channel.Channel getObj(){
      return this.obj;
   }

   public ChannelReference build() {
       return new ChannelReferenceImpl(id, obj);
   }
   
   public static ChannelReferenceBuilder of() {
      return new ChannelReferenceBuilder();
   }
   
   public static ChannelReferenceBuilder of(final ChannelReference template) {
      ChannelReferenceBuilder builder = new ChannelReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}