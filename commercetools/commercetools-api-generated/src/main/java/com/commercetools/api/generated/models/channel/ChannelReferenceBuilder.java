package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.channel.ChannelReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.Channel obj;
   
   public ChannelReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ChannelReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.channel.Channel obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.Channel getObj(){
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