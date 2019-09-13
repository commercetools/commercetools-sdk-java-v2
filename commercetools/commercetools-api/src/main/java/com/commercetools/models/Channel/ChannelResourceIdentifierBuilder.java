package com.commercetools.models.channel;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ChannelResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ChannelResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ChannelResourceIdentifier build() {
       return new ChannelResourceIdentifierImpl(id, key);
   }
   
   public static ChannelResourceIdentifierBuilder of() {
      return new ChannelResourceIdentifierBuilder();
   }
   
   public static ChannelResourceIdentifierBuilder of(final ChannelResourceIdentifier template) {
      ChannelResourceIdentifierBuilder builder = new ChannelResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}